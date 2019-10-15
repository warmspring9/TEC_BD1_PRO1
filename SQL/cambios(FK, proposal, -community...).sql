alter table person modify id_person number(9,0);
alter table proposal modify id_person number(9,0);
alter table log_in modify USERNAME number(9,0);
alter table person modify ID_LOG_IN number(9,0);
ALTER TABLE COMMUNITY
	ADD CONSTRAINT COMMUNITY_CANTON_FK FOREIGN KEY
	(ID_CANTON) REFERENCES CANTON(ID_CANTON);






