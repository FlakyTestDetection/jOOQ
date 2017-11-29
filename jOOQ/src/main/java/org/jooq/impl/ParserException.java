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
 *
 *
 *
 */
package org.jooq.impl;

import static org.jooq.exception.SQLStateSubclass.C42000_NO_SUBCLASS;

import org.jooq.DSLContext;
import org.jooq.exception.DataAccessException;
import org.jooq.exception.SQLStateSubclass;

/**
 * An exception that arises while parsing SQL through
 * {@link DSLContext#parser()}.
 *
 * @author Lukas Eder
 */
public final class ParserException extends DataAccessException {

    /**
     * Generated UID
     */
    private static final long   serialVersionUID = -724913199583039157L;

    public ParserException(String sql) {
        this(sql, null);
    }

    public ParserException(String sql, String message) {
        this(sql, message, C42000_NO_SUBCLASS);
    }

    public ParserException(String sql, String message, SQLStateSubclass state) {
        this(sql, message, state, null);
    }

    public ParserException(String sql, String message, SQLStateSubclass state, Throwable cause) {
        super(state + ": " + (message == null ? "" : message + ": ") + sql, cause);
    }
}