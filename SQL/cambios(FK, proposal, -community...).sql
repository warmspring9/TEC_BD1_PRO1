alter table person modify id_person number(9,0);
alter table proposal modify id_person number(9,0);
<<<<<<< HEAD
alter table log_in modify id_log_in number(9,0);
=======
alter table log_in modify USERNAME number(9,0);
alter table person modify ID_LOG_IN number(9,0);
ALTER TABLE COMMUNITY
	ADD CONSTRAINT COMMUNITY_CANTON_FK FOREIGN KEY
	(ID_CANTON) REFERENCES CANTON(ID_CANTON);
>>>>>>> master


alter table person drop constraint person_district_fk;
alter table proposal drop constraint district_proposal_fk;
alter table person add constraint person_community_fk foreign key (ID_Community) REFERENCES Community(ID_Community);




