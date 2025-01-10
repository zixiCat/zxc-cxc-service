/*
 * This file is generated by jOOQ.
 */
package com.zxc.cxc.web.jooq.tables;


import com.zxc.cxc.web.jooq.Keys;
import com.zxc.cxc.web.jooq.Zixidatabase;
import com.zxc.cxc.web.jooq.tables.records.HomePageInfoRecord;

import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HomePageInfo extends TableImpl<HomePageInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>zixiDatabase.home_page_info</code>
     */
    public static final HomePageInfo HOME_PAGE_INFO = new HomePageInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HomePageInfoRecord> getRecordType() {
        return HomePageInfoRecord.class;
    }

    /**
     * The column <code>zixiDatabase.home_page_info.id</code>. ID
     */
    public final TableField<HomePageInfoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "ID");

    /**
     * The column <code>zixiDatabase.home_page_info.intro</code>. Intro
     */
    public final TableField<HomePageInfoRecord, String> INTRO = createField(DSL.name("intro"), SQLDataType.VARCHAR(30), this, "Intro");

    /**
     * The column <code>zixiDatabase.home_page_info.sub_intro</code>. Sub Intro
     */
    public final TableField<HomePageInfoRecord, String> SUB_INTRO = createField(DSL.name("sub_intro"), SQLDataType.VARCHAR(200), this, "Sub Intro");

    /**
     * The column <code>zixiDatabase.home_page_info.avatar</code>. Avatar
     */
    public final TableField<HomePageInfoRecord, String> AVATAR = createField(DSL.name("avatar"), SQLDataType.VARCHAR(200), this, "Avatar");

    /**
     * The column <code>zixiDatabase.home_page_info.create_time</code>. Creation
     * Time
     */
    public final TableField<HomePageInfoRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "Creation Time");

    /**
     * The column <code>zixiDatabase.home_page_info.update_time</code>. Update
     * Time
     */
    public final TableField<HomePageInfoRecord, LocalDateTime> UPDATE_TIME = createField(DSL.name("update_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "Update Time");

    /**
     * The column <code>zixiDatabase.home_page_info.deleted</code>. Logical
     * Deletion
     */
    public final TableField<HomePageInfoRecord, Byte> DELETED = createField(DSL.name("deleted"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "Logical Deletion");

    private HomePageInfo(Name alias, Table<HomePageInfoRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private HomePageInfo(Name alias, Table<HomePageInfoRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>zixiDatabase.home_page_info</code> table
     * reference
     */
    public HomePageInfo(String alias) {
        this(DSL.name(alias), HOME_PAGE_INFO);
    }

    /**
     * Create an aliased <code>zixiDatabase.home_page_info</code> table
     * reference
     */
    public HomePageInfo(Name alias) {
        this(alias, HOME_PAGE_INFO);
    }

    /**
     * Create a <code>zixiDatabase.home_page_info</code> table reference
     */
    public HomePageInfo() {
        this(DSL.name("home_page_info"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zixidatabase.ZIXIDATABASE;
    }

    @Override
    public UniqueKey<HomePageInfoRecord> getPrimaryKey() {
        return Keys.KEY_HOME_PAGE_INFO_PRIMARY;
    }

    @Override
    public HomePageInfo as(String alias) {
        return new HomePageInfo(DSL.name(alias), this);
    }

    @Override
    public HomePageInfo as(Name alias) {
        return new HomePageInfo(alias, this);
    }

    @Override
    public HomePageInfo as(Table<?> alias) {
        return new HomePageInfo(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public HomePageInfo rename(String name) {
        return new HomePageInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HomePageInfo rename(Name name) {
        return new HomePageInfo(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public HomePageInfo rename(Table<?> name) {
        return new HomePageInfo(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public HomePageInfo where(Condition condition) {
        return new HomePageInfo(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public HomePageInfo where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public HomePageInfo where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public HomePageInfo where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public HomePageInfo where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public HomePageInfo where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public HomePageInfo where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public HomePageInfo where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public HomePageInfo whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public HomePageInfo whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
