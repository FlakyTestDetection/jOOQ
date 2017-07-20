/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.jpa.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.jpa.jooq.Indexes;
import org.jooq.example.jpa.jooq.Keys;
import org.jooq.example.jpa.jooq.Public;
import org.jooq.example.jpa.jooq.tables.records.FilmRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Film extends TableImpl<FilmRecord> {

    private static final long serialVersionUID = -1288618201;

    /**
     * The reference instance of <code>PUBLIC.FILM</code>
     */
    public static final Film FILM = new Film();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmRecord> getRecordType() {
        return FilmRecord.class;
    }

    /**
     * The column <code>PUBLIC.FILM.FILMID</code>.
     */
    public final TableField<FilmRecord, Integer> FILMID = createField("FILMID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.FILM.LENGTH</code>.
     */
    public final TableField<FilmRecord, Integer> LENGTH = createField("LENGTH", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>PUBLIC.FILM.TITLE</code>.
     */
    public final TableField<FilmRecord, String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.FILM.LANGUAGE_LANGUAGEID</code>.
     */
    public final TableField<FilmRecord, Integer> LANGUAGE_LANGUAGEID = createField("LANGUAGE_LANGUAGEID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>PUBLIC.FILM.ORIGINALLANGUAGE_LANGUAGEID</code>.
     */
    public final TableField<FilmRecord, Integer> ORIGINALLANGUAGE_LANGUAGEID = createField("ORIGINALLANGUAGE_LANGUAGEID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>PUBLIC.FILM</code> table reference
     */
    public Film() {
        this(DSL.name("FILM"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.FILM</code> table reference
     */
    public Film(String alias) {
        this(DSL.name(alias), FILM);
    }

    /**
     * Create an aliased <code>PUBLIC.FILM</code> table reference
     */
    public Film(Name alias) {
        this(alias, FILM);
    }

    private Film(Name alias, Table<FilmRecord> aliased) {
        this(alias, aliased, null);
    }

    private Film(Name alias, Table<FilmRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FKD2YJC1RU34H1SMWLA3FX7B6NX_INDEX_2, Indexes.FKN2UB730RPO5B5E9X6U2LWL9FT_INDEX_2, Indexes.PRIMARY_KEY_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FilmRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FILM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FilmRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FilmRecord>> getKeys() {
        return Arrays.<UniqueKey<FilmRecord>>asList(Keys.CONSTRAINT_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FilmRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FilmRecord, ?>>asList(Keys.FKD2YJC1RU34H1SMWLA3FX7B6NX, Keys.FKN2UB730RPO5B5E9X6U2LWL9FT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Film as(String alias) {
        return new Film(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Film as(Name alias) {
        return new Film(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Film rename(String name) {
        return new Film(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Film rename(Name name) {
        return new Film(name, null);
    }
}
