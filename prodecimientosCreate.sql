/* 

Este script contiene procedimientos almacenados para:
    >>> Country                    - DONE
    >>> District                   - DONE
    >>> EMAIL                      - DONE
    >>> Log_in                     - DONE
    >>> Parameter 		   - DONE
    >>> Person                     - DONE
    >>> Person Photo 		   - DONE
    >>> PersonxCategory            - DONE 
    >>> PersonxCountry             - DONE
    >>> Phone                      - DONE
    >>> Proposal                   - DONE
    >>> Proposal_photo             - DONE
    >>> ProposalxCategory          - DONE
    >>> Province                   - DONE
    >>> user_type                  - DONE
    >>> Vote                       - DONE   
    
*/

-- En esta seccion van los Create
-- _________________________________________________________________________________________________________________

create or replace procedure createCountry(pvName Varchar2) as

    begin
        insert into country (id_country, name)
        values(COUNTRY_SEQ.nextval, pvName);
    
    end createCountry;
-- _________________________________________________________________________________________________________________  
  
create or replace procedure createDistrict(pvName Varchar2) as

    begin
        insert into country (id_district, name)
        values(DISTRICT_SEQ.nextval, pvName);
    
    end createDistrict;
-- _________________________________________________________________________________________________________________

create or replace procedure createEmail(pvAddress varchar2, pnIdPerson number) as

    begin
        insert into email (address, id_person)
        values(pvAddress, pnIdPerson);

    end createEmail;
-- _________________________________________________________________________________________________________________

create or replace procedure createLogIn(pvPassword varchar2, pnIdUserType number) as

    begin
        insert into log_in (id_log_in, password, id_user_type)
        values(LOG_IN_SEQ.nextval, pvPassword, pnIdUserType);
    
    end createLogIn;
-- _________________________________________________________________________________________________________________

create or replace procedure createParameter(pvName varchar2, pnValue number) as

    begin
        insert into parameter (id_parameter, name, value)
        values(PARAMETER_SEQ.nextval, pvName, pnValue);
    
    end createParameter;
-- _________________________________________________________________________________________________________________

create or replace procedure createPerson
    (pvName varchar2, pvFirstLastName varchar2, 
     pvSecondLastName varchar2, pdDate date, 
     pnIdCommunity number, pnIdLogIn number) as

    begin
        insert into person (id_person, name, first_lastName, second_lastName, birthdate, id_community, id_log_in)
        values(PERSON_SEQ.nextval, pvName, pvFirstLastName, pvSecondLastName, pdDate, pnIdCommunity, pnIdLogIn);

    end createPerson;
-- _________________________________________________________________________________________________________________

create or replace procedure createPersonPhoto (pvContent varchar2, pnIdPerson number) as

    begin
        insert into person_photo (id_person_photo, content, id_person)
        values(person_photo_seq.nextval, pvContent, pnIdPerson);
    
    end createPersonPhoto;

-- _________________________________________________________________________________________________________________

create or replace procedure createPersonxCategory(pnIdPerson number, pnIdCategory number) as

    begin
        insert into personxcategory (id_person, id_category)
        values(pnIdPerson, pnIdCategory);
    
    end createPersonxCategory;
-- _________________________________________________________________________________________________________________

create or replace procedure createPersonxCountry(pnIdPerson number, pnIdCountry number) as

    begin
        insert into personxcountry (id_person, id_country)
        values(pnIdPerson, pnIdCountry);
    
    end createPersonxCountry;

-- _________________________________________________________________________________________________________________

create or replace procedure createPhone(pnPhone number, pnIdPerson number) as

    begin
        insert into phone (telephone, id_person)
        values(pnPhone, pnIdPerson);

    end createPhone;

-- _________________________________________________________________________________________________________________

create or replace procedure createProposal(pvTitle varchar2, pnBudget number, pvSummary varchar2, pnIdPerson number) as

    begin
        insert into proposal (id_proposal, tittle, budget, summary, post_time, id_person)
        values(PROPOSAL_SEQ.nextval, pvTitle, pnbudget, pvsummary, sysdate, pnidperson);

    end createProposal;

-- NOTA!! >>> La columna TITTLE esta mal escrita. Es TITLE!

-- _________________________________________________________________________________________________________________

create or replace procedure createProposalPhoto(pvContent varchar2, pnProposal number) as

    begin
        insert into proposal_photo (id_proposal_photo, content, id_proposal)
        values(PROPOSAL_PHOTO_SEQ.nextval, pvContent, pnProposal);
    
    end createProposalPhoto;
    
-- _________________________________________________________________________________________________________________

create or replace procedure createProposalxCategory(pnIdProposal number, pnIdCategory number) as

    begin
        insert into proposalxcategory (id_proposal, id_category)
        values(pnIdProposal, pnIdCategory);

    end createProposalxCategory;

-- _________________________________________________________________________________________________________________

create or replace procedure createProvince(pvName varchar2, pnIdCountry number) as

    begin
        insert into province (id_province, name, id_country)
        values(PROVINCE.nextval, pvName, pnidcountry);
    
    end createProvince;
    
-- _________________________________________________________________________________________________________________

create or replace procedure createUserType(pvName varchar2) as

    begin
        insert into user_type (id_user_type, name)
        values(USER_TYPE_SEQ.nextval, pvName);

    end createUserType;

-- _________________________________________________________________________________________________________________

