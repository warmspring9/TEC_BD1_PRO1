create or replace function getAllCanton return SYS_REFCURSOR
is
    TYPE ref_cursor is ref Cursor;
    v_ref ref_cursor;
begin
    open v_ref for select id_canton, name from canton;
    return v_ref;
    close v_ref;
end;

----
----

create or replace function getAllCategory return SYS_REFCURSOR
is
    TYPE ref_cursor is ref Cursor;
    v_ref ref_cursor;
begin
    open v_ref for select id_category, name from category;
    return v_ref;
    close v_ref;
end;

----
----

create or replace function getAllCommunity return SYS_REFCURSOR
is
    TYPE ref_cursor is ref Cursor;
    v_ref ref_cursor;
begin
    open v_ref for select id_community, name from community;
    return v_ref;
    close v_ref;
end;

----
----

create or replace function getAllCountry return SYS_REFCURSOR
is
    TYPE ref_cursor is ref Cursor;
    v_ref ref_cursor;
begin
    open v_ref for select id_country, name from country;
    return v_ref;
    close v_ref;
end;

----
----

create or replace function getAllProvince return SYS_REFCURSOR
is
    TYPE ref_cursor is ref Cursor;
    v_ref ref_cursor;
begin
    open v_ref for select id_province, name from province;
    return v_ref;
    close v_ref;
end;

----
----

create or replace function getProposalFeed(pIdCommunity varchar2) return SYS_REFCURSOR
is
    TYPE ref_cursor is ref Cursor;
    v_ref ref_cursor;
begin

	---Funcion que retorna todos los proposal según la comunidad--
	---Mauricio Muñoz Brenes--
    open v_ref for select * from proposal
        join person p on proposal.id_person=p.id_person
        where p.id_community = pIdCommunity;
    return v_ref;
end;

----
----

create or replace function getProposalProfile(pIdPerson varchar2) return SYS_REFCURSOR
is
    TYPE ref_cursor is ref Cursor;
    v_ref ref_cursor;
begin
	---Funcion que retorna todos los proposal según la persona--
	---Mauricio Muñoz Brenes--
    open v_ref for select id_proposal from proposal where id_person=pIdPerson;
    return v_ref;
end;