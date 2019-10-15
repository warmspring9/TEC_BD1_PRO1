alter table person modify id_person number(9,0);
alter table proposal modify id_person number(9,0);
alter table log_in modify id_log_in number(9,0);


alter table person drop constraint person_district_fk;
alter table proposal drop constraint district_proposal_fk;
alter table person add constraint person_community_fk foreign key (ID_Community) REFERENCES Community(ID_Community);




