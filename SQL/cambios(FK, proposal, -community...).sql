alter table person modify id_person number(9,0);
alter table proposal modify id_person number(9,0);
alter table log_in modify id_log_in number(9,0);
alter table person modify id_log_in number(9,0);
ALTER TABLE PERSON ADD CONSTRAINT PERSON_DISTRICT_FK FOREIGN KEY (ID_DISTRICT) REFERENCES DISTRICT(ID_DISTRICT);
alter table proposal add id_district number(6);
alter table proposal add constraint district_proposal_fk foreign key (id_district) references district(id_district);






