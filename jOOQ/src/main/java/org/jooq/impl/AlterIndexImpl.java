/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

import static org.jooq.Clause.ALTER_INDEX;
import static org.jooq.Clause.ALTER_INDEX_INDEX;
import static org.jooq.Clause.ALTER_INDEX_RENAME;
// ...
// ...
import static org.jooq.SQLDialect.CUBRID;
// ...
import static org.jooq.SQLDialect.DERBY;
import static org.jooq.SQLDialect.FIREBIRD;
// ...
// ...
import static org.jooq.impl.DSL.index;
import static org.jooq.impl.DSL.name;
import static org.jooq.impl.Keywords.K_ALTER_INDEX;
import static org.jooq.impl.Keywords.K_IF_EXISTS;
import static org.jooq.impl.Keywords.K_RENAME_INDEX;
import static org.jooq.impl.Keywords.K_RENAME_TO;
import static org.jooq.impl.Keywords.K_TO;

import java.util.EnumSet;

import org.jooq.AlterIndexFinalStep;
import org.jooq.AlterIndexStep;
import org.jooq.Clause;
import org.jooq.Configuration;
import org.jooq.Context;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.SQLDialect;

/**
 * @author Lukas Eder
 */
final class AlterIndexImpl extends AbstractQuery implements

    // Cascading interface implementations for ALTER INDEX behaviour
    AlterIndexStep,
    AlterIndexFinalStep {

    /**
     * Generated UID
     */
    private static final long                serialVersionUID     = 8904572826501186329L;
    private static final Clause[]            CLAUSES              = { ALTER_INDEX };
    private static final EnumSet<SQLDialect> NO_SUPPORT_IF_EXISTS = EnumSet.of(CUBRID, DERBY, FIREBIRD);
    private static final EnumSet<SQLDialect> SUPPORT_RENAME_INDEX = EnumSet.of(DERBY);

    private final Index                      index;
    private final boolean                    ifExists;
    private Index                            renameTo;

    AlterIndexImpl(Configuration configuration, Index index) {
        this(configuration, index, false);
    }

    AlterIndexImpl(Configuration configuration, Index index, boolean ifExists) {
        super(configuration);

        this.index = index;
        this.ifExists = ifExists;
    }

    // ------------------------------------------------------------------------
    // XXX: DSL API
    // ------------------------------------------------------------------------

    @Override
    public final AlterIndexImpl renameTo(String newName) {
        return renameTo(name(newName));
    }

    @Override
    public final AlterIndexImpl renameTo(Name newName) {
        return renameTo(index(newName));
    }

    @Override
    public final AlterIndexImpl renameTo(Index newName) {
        this.renameTo = newName;
        return this;
    }

    // ------------------------------------------------------------------------
    // XXX: QueryPart API
    // ------------------------------------------------------------------------

    private final boolean supportsIfExists(Context<?> ctx) {
        return !NO_SUPPORT_IF_EXISTS.contains(ctx.family());
    }

    @Override
    public final void accept(Context<?> ctx) {
        if (ifExists && !supportsIfExists(ctx)) {
            Tools.beginTryCatchIfExists(ctx, DDLStatementType.ALTER_INDEX, index);
            accept0(ctx);
            Tools.endTryCatchIfExists(ctx, DDLStatementType.ALTER_INDEX, index);
        }
        else {
            accept0(ctx);
        }
    }

    private final void accept0(Context<?> ctx) {
        boolean renameIndex = SUPPORT_RENAME_INDEX.contains(ctx.family());

        ctx.start(ALTER_INDEX_INDEX)
           .visit(renameIndex ? K_RENAME_INDEX : K_ALTER_INDEX);

        if (ifExists && supportsIfExists(ctx))
            ctx.sql(' ').visit(K_IF_EXISTS);

        ctx.sql(' ').visit(index)
           .end(ALTER_INDEX_INDEX)
           .formatIndentStart()
           .formatSeparator();

        if (renameTo != null) {
            boolean qualify = ctx.qualify();

            ctx.start(ALTER_INDEX_RENAME)
               .qualify(false)
               .visit(renameIndex ? K_TO : K_RENAME_TO).sql(' ').visit(renameTo)
               .qualify(qualify)
               .end(ALTER_INDEX_RENAME);
        }

        ctx.formatIndentEnd();
    }

    @Override
    public final Clause[] clauses(Context<?> ctx) {
        return CLAUSES;
    }
}
