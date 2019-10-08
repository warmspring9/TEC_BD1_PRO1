
alter table Canton
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertCanton
before insert
on pro.Canton
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertCanton;
  
create or replace trigger pro.beforeUpdateCanton
before update
on pro.Canton
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdateCanton;
  
  
alter table Category
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertCategory
before insert
on pro.Category
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertCategory;
  
create or replace trigger pro.beforeUpdateCategory
before update
on pro.Category
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdateCategory;
  
alter table Commentary
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertCommentary
before insert
on pro.Commentary
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertCommentary;
  
create or replace trigger pro.beforeUpdateCommentary
before update
on pro.Commentary
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdateCommentary;
  
  
alter table Community
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertCommunity
before insert
on pro.Community
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertCommunity;
  
create or replace trigger pro.beforeUpdateCommunity
before update
on pro.Community
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdateCommunity;
  
 alter table Country
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertCountry
before insert
on pro.Country
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertCountry;

create or replace trigger pro.beforeUpdateCountry
before update
on pro.Country
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdateCountry; 
  
alter table District
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertDistrict
before insert
on pro.District
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertDistrict;

create or replace trigger pro.beforeUpdateDistrict
before update
on pro.District
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdateDistrict;  


alter table Email
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertEmail
before insert
on pro.Email
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertEmail;

create or replace trigger pro.beforeUpdateEmail
before update
on pro.Email
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdateEmail; 
  
alter table Parameter
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertParameter
before insert
on pro.Parameter
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertParameter;

create or replace trigger pro.beforeUpdateParameter
before update
on pro.Parameter
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdateParameter;
  
alter table Person
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertPerson
before insert
on pro.Person
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertPerson;

create or replace trigger pro.beforeUpdatePerson
before update
on pro.Person
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdatePerson;
  
alter table Person_Photo
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertPersonPhoto
before insert
on pro.Person_Photo
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertPersonPhoto;

create or replace trigger pro.beforeUpdatePersonPhoto
before update
on pro.Person_Photo
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdatePersonPhoto;
  
alter table PersonXCategory
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertPersonXCategory
before insert
on pro.PersonXCategory
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertPersonXCategory;

create or replace trigger pro.beforeUpdatePersonXCategory
before update
on pro.PersonXCategory
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdatePersonXCategory;
  
alter table PersonXCountry
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertPersonXCountry
before insert
on pro.PersonXCountry
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertPersonXCountry;

create or replace trigger pro.beforeUpdatePersonXCountry
before update
on pro.PersonXCountry
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdatePersonXCountry;
  
alter table Phone
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertPhone
before insert
on pro.Phone
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertPhone;

create or replace trigger pro.beforeUpdatePhone
before update
on pro.Phone
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdatePhone;
  
alter table Proposal
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertProposal
before insert
on pro.Proposal
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertProposal;

create or replace trigger pro.beforeUpdateProposal
before update
on pro.Proposal
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdateProposal;
  
alter table Proposal_Photo
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertProposalPhoto
before insert
on pro.Proposal_Photo
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertProposalPhoto;

create or replace trigger pro.beforeUpdateProposalPhoto
before update
on pro.Proposal_Photo
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdateProposalPhoto;
  
alter table ProposalXCategory
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertProposalXCategory
before insert
on pro.ProposalXCategory
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertProposalXCategory;

create or replace trigger pro.beforeUpdateProposalXCategory
before update
on pro.ProposalXCategory
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdateProposalXCategory;
  
alter table Province
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertProvince
before insert
on pro.Province
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertProvince;

create or replace trigger pro.beforeUpdateProvince
before update
on pro.Province
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdateProvince;
  
alter table User_Type
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertUserType
before insert
on pro.User_Type
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertUserType;

create or replace trigger pro.beforeUpdateUserType
before update
on pro.User_Type
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdateUserType;
  
alter table Vote
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertVote
before insert
on pro.Vote
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertVote;

create or replace trigger pro.beforeUpdateVote
before update
on pro.Vote
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdateVote;
  
  

alter table Log_in
add (creation_date date,
    user_creation varchar2(20),
    last_modified_date date,
    last_modified_user varchar2(20));
    
create or replace trigger pro.beforeInsertLogin
before insert
on pro.Log_in
for each row
  begin 
    :new.user_creation:=user;
    :new.creation_date:=sysdate;
    
  end beforeInsertLogin;

create or replace trigger pro.beforeUpdateLogin
before update
on pro.Log_in
for each row
  begin 
      :new.last_modified_user:=user;
      :new.last_modified_date:=sysdate;
    
  end beforeUpdateLogin;