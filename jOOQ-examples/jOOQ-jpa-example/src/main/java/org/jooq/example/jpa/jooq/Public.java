/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.jpa.jooq;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.example.jpa.jooq.tables.Actor;
import org.jooq.example.jpa.jooq.tables.Film;
import org.jooq.example.jpa.jooq.tables.FilmActor;
import org.jooq.example.jpa.jooq.tables.Language;
import org.jooq.impl.SchemaImpl;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1937000285;

    /**
     * The reference instance of <code>PUBLIC</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>PUBLIC.ACTOR</code>.
     */
    public final Actor ACTOR = org.jooq.example.jpa.jooq.tables.Actor.ACTOR;

    /**
     * The table <code>PUBLIC.FILM</code>.
     */
    public final Film FILM = org.jooq.example.jpa.jooq.tables.Film.FILM;

    /**
     * The table <code>PUBLIC.FILM_ACTOR</code>.
     */
    public final FilmActor FILM_ACTOR = org.jooq.example.jpa.jooq.tables.FilmActor.FILM_ACTOR;

    /**
     * The table <code>PUBLIC.LANGUAGE</code>.
     */
    public final Language LANGUAGE = org.jooq.example.jpa.jooq.tables.Language.LANGUAGE;

    /**
     * No further instances allowed
     */
    private Public() {
        super("PUBLIC", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.SYSTEM_SEQUENCE_4433876A_B02A_44B8_947E_9C2240443B3B,
            Sequences.SYSTEM_SEQUENCE_473BBBB1_4C40_47D6_B053_C4BE16B8A6FE,
            Sequences.SYSTEM_SEQUENCE_EB7910E6_C36C_4254_83A3_810E0B29176D);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Actor.ACTOR,
            Film.FILM,
            FilmActor.FILM_ACTOR,
            Language.LANGUAGE);
    }
}
