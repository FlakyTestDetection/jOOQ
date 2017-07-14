/*
 * This file is generated by jOOQ.
*/
package org.jooq.util.hsqldb.information_schema;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.jooq.util.hsqldb.information_schema.tables.CheckConstraints;
import org.jooq.util.hsqldb.information_schema.tables.Columns;
import org.jooq.util.hsqldb.information_schema.tables.ElementTypes;
import org.jooq.util.hsqldb.information_schema.tables.KeyColumnUsage;
import org.jooq.util.hsqldb.information_schema.tables.Parameters;
import org.jooq.util.hsqldb.information_schema.tables.ReferentialConstraints;
import org.jooq.util.hsqldb.information_schema.tables.Routines;
import org.jooq.util.hsqldb.information_schema.tables.Schemata;
import org.jooq.util.hsqldb.information_schema.tables.Sequences;
import org.jooq.util.hsqldb.information_schema.tables.SystemIndexinfo;
import org.jooq.util.hsqldb.information_schema.tables.TableConstraints;
import org.jooq.util.hsqldb.information_schema.tables.Tables;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InformationSchema extends SchemaImpl {

    private static final long serialVersionUID = -2118475040;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA</code>
     */
    public static final InformationSchema INFORMATION_SCHEMA = new InformationSchema();

    /**
     * The table <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS</code>.
     */
    public final CheckConstraints CHECK_CONSTRAINTS = org.jooq.util.hsqldb.information_schema.tables.CheckConstraints.CHECK_CONSTRAINTS;

    /**
     * The table <code>INFORMATION_SCHEMA.COLUMNS</code>.
     */
    public final Columns COLUMNS = org.jooq.util.hsqldb.information_schema.tables.Columns.COLUMNS;

    /**
     * The table <code>INFORMATION_SCHEMA.ELEMENT_TYPES</code>.
     */
    public final ElementTypes ELEMENT_TYPES = org.jooq.util.hsqldb.information_schema.tables.ElementTypes.ELEMENT_TYPES;

    /**
     * The table <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE</code>.
     */
    public final KeyColumnUsage KEY_COLUMN_USAGE = org.jooq.util.hsqldb.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE;

    /**
     * The table <code>INFORMATION_SCHEMA.PARAMETERS</code>.
     */
    public final Parameters PARAMETERS = org.jooq.util.hsqldb.information_schema.tables.Parameters.PARAMETERS;

    /**
     * The table <code>INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS</code>.
     */
    public final ReferentialConstraints REFERENTIAL_CONSTRAINTS = org.jooq.util.hsqldb.information_schema.tables.ReferentialConstraints.REFERENTIAL_CONSTRAINTS;

    /**
     * The table <code>INFORMATION_SCHEMA.ROUTINES</code>.
     */
    public final Routines ROUTINES = org.jooq.util.hsqldb.information_schema.tables.Routines.ROUTINES;

    /**
     * The table <code>INFORMATION_SCHEMA.SCHEMATA</code>.
     */
    public final Schemata SCHEMATA = org.jooq.util.hsqldb.information_schema.tables.Schemata.SCHEMATA;

    /**
     * The table <code>INFORMATION_SCHEMA.SEQUENCES</code>.
     */
    public final Sequences SEQUENCES = org.jooq.util.hsqldb.information_schema.tables.Sequences.SEQUENCES;

    /**
     * The table <code>INFORMATION_SCHEMA.SYSTEM_INDEXINFO</code>.
     */
    public final SystemIndexinfo SYSTEM_INDEXINFO = org.jooq.util.hsqldb.information_schema.tables.SystemIndexinfo.SYSTEM_INDEXINFO;

    /**
     * The table <code>INFORMATION_SCHEMA.TABLES</code>.
     */
    public final Tables TABLES = org.jooq.util.hsqldb.information_schema.tables.Tables.TABLES;

    /**
     * The table <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS</code>.
     */
    public final TableConstraints TABLE_CONSTRAINTS = org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS;

    /**
     * No further instances allowed
     */
    private InformationSchema() {
        super("INFORMATION_SCHEMA", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            CheckConstraints.CHECK_CONSTRAINTS,
            Columns.COLUMNS,
            ElementTypes.ELEMENT_TYPES,
            KeyColumnUsage.KEY_COLUMN_USAGE,
            Parameters.PARAMETERS,
            ReferentialConstraints.REFERENTIAL_CONSTRAINTS,
            Routines.ROUTINES,
            Schemata.SCHEMATA,
            Sequences.SEQUENCES,
            SystemIndexinfo.SYSTEM_INDEXINFO,
            Tables.TABLES,
            TableConstraints.TABLE_CONSTRAINTS);
    }
}
