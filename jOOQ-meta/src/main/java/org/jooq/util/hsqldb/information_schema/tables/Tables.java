/*
 * This file is generated by jOOQ.
*/
package org.jooq.util.hsqldb.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.util.hsqldb.information_schema.InformationSchema;


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
public class Tables extends TableImpl<Record> {

    private static final long serialVersionUID = -927928769;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.TABLES</code>
     */
    public static final Tables TABLES = new Tables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_CATALOG</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_SCHEMA</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_NAME</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_TYPE</code>.
     */
    public final TableField<Record, String> TABLE_TYPE = createField("TABLE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.SELF_REFERENCING_COLUMN_NAME</code>.
     */
    public final TableField<Record, String> SELF_REFERENCING_COLUMN_NAME = createField("SELF_REFERENCING_COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.REFERENCE_GENERATION</code>.
     */
    public final TableField<Record, String> REFERENCE_GENERATION = createField("REFERENCE_GENERATION", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.USER_DEFINED_TYPE_CATALOG</code>.
     */
    public final TableField<Record, String> USER_DEFINED_TYPE_CATALOG = createField("USER_DEFINED_TYPE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.USER_DEFINED_TYPE_SCHEMA</code>.
     */
    public final TableField<Record, String> USER_DEFINED_TYPE_SCHEMA = createField("USER_DEFINED_TYPE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.USER_DEFINED_TYPE_NAME</code>.
     */
    public final TableField<Record, String> USER_DEFINED_TYPE_NAME = createField("USER_DEFINED_TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.IS_INSERTABLE_INTO</code>.
     */
    public final TableField<Record, String> IS_INSERTABLE_INTO = createField("IS_INSERTABLE_INTO", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.IS_TYPED</code>.
     */
    public final TableField<Record, String> IS_TYPED = createField("IS_TYPED", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.COMMIT_ACTION</code>.
     */
    public final TableField<Record, String> COMMIT_ACTION = createField("COMMIT_ACTION", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.TABLES</code> table reference
     */
    public Tables() {
        this(DSL.name("TABLES"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.TABLES</code> table reference
     */
    public Tables(String alias) {
        this(DSL.name(alias), TABLES);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.TABLES</code> table reference
     */
    public Tables(Name alias) {
        this(alias, TABLES);
    }

    private Tables(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Tables(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tables as(String alias) {
        return new Tables(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tables as(Name alias) {
        return new Tables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tables rename(String name) {
        return new Tables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tables rename(Name name) {
        return new Tables(name, null);
    }
}
