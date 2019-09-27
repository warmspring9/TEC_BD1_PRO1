create table password_changes(
    id_password_changes NUMBER(6),
    id_log_in NUMBER(6),
    previous_password VARCHAR2(100),
    current_password VARCHAR2(100),
    change_date date,
    creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20)
    );
    
ALTER TABLE Password_changes 
    ADD CONSTRAINT password_changes_PK PRIMARY KEY (id_password_changes)
    USING index
    TABLESPACE PRO_IND PCTFREE 20
    STORAGE (initial 10K NEXT 10K PCTINCREASE 0);

CREATE SEQUENCE password_changes_seq
  MINVALUE 1
  START WITH 1
  INCREMENT BY 1
  CACHE 20;

create or replace trigger beforeUpdatePasswordChanges
before update
on password_changes
for each row
  begin 
    :new.last_modified_user:=user;
    :new.last_modified_date:=sysdate;
    
  end beforeUpdatePasswordChanges;

create or replace trigger beforeInsertPasswordChanges
before insert
on Password_Changes
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertPasswordChanges;

create or replace trigger beforeUpdatePassword
before insert or update of password on log_in
for each row 
  begin 
    
    insert into password_changes(id_password_changes, id_log_in, previous_password, current_password, change_date)
                                  
    values(PASSWORD_CHANGES_SEQ.nextval, :old.id_log_in,:old.password,:new.password, sysdate);
                                      
    end beforeUpdatePassword;
