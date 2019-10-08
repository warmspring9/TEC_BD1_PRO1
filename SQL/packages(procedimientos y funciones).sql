
create or replace package packageCountry is

    procedure createCountry(pvName Varchar2);
    procedure deleteCountry(pnIdCountry number);
    procedure updateCountryName(pnIdCountry number, pvNewName varchar2);
    function getCountryName(pnIdCountry in number) return varchar2;
    
end packageCountry;
    
create or replace package body packageCountry as

    procedure createCountry(pvName Varchar2) as

        begin
            insert into country (id_country, name)
            values(COUNTRY_SEQ.nextval, pvName);
            commit;

        end createCountry;

    procedure deleteCountry(pnIdCountry number) as

        begin 
            delete from country where id_country = pnIdCountry;
            commit;

        end deleteCountry;

    procedure updateCountryName(pnIdCountry number, pvNewName varchar2) as

        begin 
            update country set name = pvNewName where id_country = pnIdCountry;
            commit;

        end updateCountryName;

    function getCountryName(pnIdCountry number) return varchar2 is

        vcCountryName varchar2(25);

        begin 
            select name 
            into vcCountryName
            from country
            where id_country = pnIdCountry;

            return(vcCountryName);

        end getCountryName;

    end packageCountry;
    
-- ________________________________________________________________________________________________

create or replace package packageDistrict is

    procedure createDistrict(pvName Varchar2);
    procedure deleteDistrict(pnIdDistrict number);
    procedure updateDistrictName(pnIdDistrict number, pvNewName varchar2);
    function getDistrictName(pnIdDistrict in number) return varchar2;
    
end packageDistrict;
    
create or replace package body packageDistrict as

    procedure createDistrict(pvName Varchar2) as
    
        begin
            insert into district (id_district, name)
            values(DISTRICT_SEQ.nextval, pvName);
        
        end createDistrict;

    procedure deleteDistrict(pnIdDistrict number) as

        begin 
            delete from district where id_district = pnIdDistrict;
            commit;

        end deleteDistrict;

    procedure updateDistrictName(pnIdDistrict number, pvNewName varchar2) as

        begin 
            update district set name = pvNewName where id_district = pnIdDistrict;
            commit;

        end updateDistrictName;

    function getDistrictName(pnIdDistrict number) return varchar2 is

        vcDistrictName varchar2(40);

        begin 
            select name 
            into vcDistrictName
            from district
            where id_district = pnIdDistrict;

            return(vcDistrictName);

        end getDistrictName;

    end packageDistrict;

-- ________________________________________________________________________________________________

create or replace package packageEmail is

    procedure createEmail(pvAddress varchar2, pnIdPerson number);
    procedure deleteEmail(pnIdPerson number);
    procedure updateEmailAddress(pnIdPerson number, pvNewAddress varchar2);
    function getEmailAddress(pnIdPerson in number) return varchar2;
    
end packageEmail;
   
create or replace package body packageEmail as

     procedure createEmail(pvAddress varchar2, pnIdPerson number) as
    
        begin
            insert into email (address, id_person)
            values(pvAddress, pnIdPerson);
    
        end createEmail;

    procedure deleteEmail(pnIdPerson number) as

        begin 
            delete from email where id_person = pnIdPerson;
            commit;

        end deleteEmail;

    procedure updateEmailAddress(pnIdPerson number, pvNewAddress varchar2) as

        begin 
            update email set address = pvNewAddress where id_person = pnIdPerson;
            commit;

        end updateEmailAddress;

    function getEmailAddress(pnIdPerson number) return varchar2 is

        vcEmailAddress varchar2(100);

        begin 
            select address
            into vcEmailAddress
            from email
            where id_person = pnIdPerson;

            return(vcEmailAddress);

        end getEmailAddress;

    end packageEmail;
   
-- ________________________________________________________________________________________________

create or replace package packageLogIn is

    procedure createLogIn(pvPassword varchar2, pnIdUserType number);
    procedure deleteLogIn(pnIdLogIn number);
    procedure updateLogInPassword(pnIdLogIn number, pvNewPassword varchar2);

end packageLogIn;

create or replace package body packageLogIn as

     procedure createLogIn(pvPassword varchar2, pnIdUserType number) as

    begin
        insert into log_in (id_log_in, password, id_user_type)
        values(LOG_IN_SEQ.nextval, pvPassword, pnIdUserType);

    end createLogIn;

    procedure deleteLogIn(pnIdLogIn number) as

        begin 
            delete from log_in where id_log_in = pnIdLogIn;
            commit;

        end deleteLogIn;

    procedure updateLogInPassword(pnIdLogIn number, pvNewPassword varchar2) as

        begin 
            update log_in set password = pvNewPassword where id_log_in = pnIdLogIn;
            commit;

        end updateLogInPassword;


    end packageLogIn;

-- ________________________________________________________________________________________________

create or replace package packageParameter is

    procedure createParameter(pvName varchar2, pnValue number);
    procedure deleteParameter(pnIdParameter number);
    procedure updateParameterName(pnIdParameter number, pvNewName varchar2);
    procedure updateParameterValue(pnIdParameter number, pvNewValue number);
    function getParameterName(pnIdParameter number) return varchar2;
    function getParameterValue(pnIdParameter number) return number;

end packageParameter;

create or replace package body packageParameter is

    procedure createParameter(pvName varchar2, pnValue number) as

        begin
            insert into parameter(id_parameter, name, value)
            values(PARAMETER_SEQ.nextval, pvName, pnValue);
    
        end createParameter;

    procedure deleteParameter(pnIdParameter number) as

        begin 
            delete from parameter where id_parameter = pnIdParameter;
            commit;

        end deleteParameter;

    procedure updateParameterName(pnIdParameter number, pvNewName varchar2) as

        begin 
            update parameter set name = pvNewName where id_parameter = pnIdParameter;
            commit;

        end updateParameterName;

    procedure updateParameterValue(pnIdParameter number, pvNewValue number) as

        begin 
            update parameter set value = pvNewValue where id_parameter = pnIdParameter;
            commit;

        end updateParameterValue;
    
    function getParameterName(pnIdParameter number) return varchar2 is
        vcName varchar2(100);
        
        begin
            select name
            into vcName
            from parameter
            where id_parameter = pnIdParameter;
            
            return(vcName);
            
        end getParameterName;
        
    function getParameterValue(pnIdParameter number) return number is
    
        vnValue number;
        
        begin 
            select value
            into vnValue
            from parameter
            where id_parameter = pnIdParameter;
        
            return(vnValue);
            
        end getParameterValue;
            
    end packageParameter;

-- ________________________________________________________________________________________________

create or replace package packagePerson is

    procedure createPerson(pvName varchar2, pvFirstLastName varchar2, 
     pvSecondLastName varchar2, pdDate date, 
     pnIdCommunity number, pnIdLogIn number);
    procedure deletePerson(pnIdPerson number);

    procedure updatePersonName(pnIdPerson number, pvNewName varchar2);
    procedure updatePersonFirstLastName(pnIdPerson number, pvNewFirstLastName varchar2);
    procedure updatePersonSecondLastName(pnIdPerson number, pvNewSecondLastName number);
    procedure updatePersonBirthdate(pnIdPerson number, pvNewBirthDate date);

    function getPersonFirstName(pnIdPerson number) return varchar2; 
    function getPersonFirstLastName(pnIdPerson number) return varchar2; 
    function getPersonSecondLastName(pnIdPerson number) return varchar2; 
    function getPersonBirthdate(pnIdPerson number) return date;
    function getPersonIdComunity(pnIdPerson number) return number;    
    function getPersonIdLogIn(pnIdPerson number) return number;


end packagePerson;

create or replace package body packagePerson is

    procedure createPerson
    (pvName varchar2, pvFirstLastName varchar2, 
     pvSecondLastName varchar2, pdDate date, 
     pnIdCommunity number, pnIdLogIn number) as

    begin
        insert into person (id_person, name, first_lastName, second_lastName, birthdate, id_community, id_log_in)
        values(PERSON_SEQ.nextval, pvName, pvFirstLastName, pvSecondLastName, pdDate, pnIdCommunity, pnIdLogIn);

    end createPerson;

    procedure deletePerson(pnIdPerson number) as

        begin 
            delete from person where id_person = pnIdPerson;
            commit;

        end deletePerson;

    procedure updatePersonName(pnIdPerson number, pvNewName varchar2) as

        begin 
            update person set name = pvNewName where id_person = pnIdPerson;
            commit;

        end updatePersonName;

    procedure updatePersonFirstLastName(pnIdPerson number, pvNewFirstLastName varchar2) as

        begin 
            update person set first_lastname = pvNewFirstLastName where id_person = pnIdPerson;
            commit;

        end updatePersonFirstLastName;

    procedure updatePersonSecondLastName(pnIdPerson number, pvNewSecondLastName number) as

        begin 
            update person set second_lastname = pvNewSecondLastName where id_person = pnIdPerson;
            commit;

        end updatePersonSecondLastName;

    procedure updatePersonBirthdate(pnIdPerson number, pvNewBirthdate date) as

        begin 
            update person set birthdate = pvNewBirthdate where id_person = pnIdPerson;
            commit;

        end updatePersonBirthdate;




    function getPersonFirstName(pnIdPerson number) return varchar2 is
        vcName varchar2(100);

        begin
            select name
            into vcName
            from person
            where id_person = pnIdPerson;

            return(vcName);

        end getPersonFirstName;

    function getPersonFirstLastName(pnIdPerson number) return varchar2 is
        vcFirstLastName varchar2(100);

        begin
            select first_lastname
            into vcFirstLastName
            from person
            where id_person = pnIdPerson;

            return(vcFirstLastName);

        end getPersonFirstLastName;

    function getPersonSecondLastName(pnIdPerson number) return varchar2 is
        vcSecondLastName varchar2(100);

        begin
            select second_lastname
            into vcSecondLastName
            from person
            where id_person = pnIdPerson;

            return(vcSecondLastName);

        end getPersonSecondLastName;       

    function getPersonBirthdate(pnIdPerson number) return date is

        vdBirthdate date;

        begin 
            select birthdate
            into vdBirthdate
            from person
            where id_person = pnIdPerson;

            return(vdBirthdate);

        end getPersonBirthdate;

    function getPersonIdComunity(pnIdPerson number) return number is

        vdIdCommunity number;

        begin 
            select id_community
            into vdIdCommunity
            from person
            where id_person = pnIdPerson;

            return(vdIdCommunity);

        end getPersonIdComunity;

    function getPersonIdLogIn(pnIdPerson number) return number is

        vdIdLogIn number;

        begin 
            select id_log_in
            into vdIdLogIn
            from person
            where id_person = pnIdPerson;

            return(vdIdLogIn);

        end getPersonIdLogIn;      


    end packagePerson;
-- ________________________________________________________________________________________________

create or replace package packagePersonPhoto is

    procedure createPersonPhoto(pvContent varchar2, pnIdPerson number);
    procedure deletePersonPhoto(pnIdPersonPhoto number);

    procedure updatePersonPhoto(pnIdPersonPhoto number, pvNewContent varchar2);

    function getPersonPhotoContent(pnIdPersonPhoto number) return varchar2; 


end packagePersonPhoto;

create or replace package body packagePersonPhoto is

   procedure createPersonPhoto(pvContent varchar2, pnIdPerson number) as
        begin
            insert into person_photo (id_person_photo, content, id_person)
            values(person_photo_seq.nextval, pvContent, pnIdPerson);

        end createPersonPhoto;

    procedure deletePersonPhoto(pnIdPersonPhoto number) as

        begin 
            delete from person_photo where id_person_photo = pnIdPersonPhoto;
            commit;

        end deletePersonPhoto;

    procedure updatePersonPhoto(pnIdPersonPhoto number, pvNewContent varchar2) as

        begin 
            update person_photo set content = pvNewContent where id_person_photo = pnIdPersonPhoto;
            commit;

        end updatePersonPhoto;


    function getPersonPhotoContent(pnIdPersonPhoto number) return varchar2 is
        vcContent varchar2(100);

        begin
            select content
            into vcContent
            from person_photo
            where id_person_photo = pnIdPersonPhoto;

            return(vcContent);

        end getPersonPhotoContent;



    end packagePersonPhoto;
-- ________________________________________________________________________________________________

create or replace package packagePersonxCategory is

    procedure createPersonxCategory(pnIdPerson number, pnIdCategory number);

    procedure deletePersonXCategory(pnIdPerson number, pnIdCategory number);

end packagePersonxCategory;
*/
create or replace package body packagePersonxCategory is

   procedure createPersonxCategory(pnIdPerson number, pnIdCategory number) as

    begin
        insert into personxcategory (id_person, id_category)
        values(pnIdPerson, pnIdCategory);

    end createPersonxCategory;

    procedure deletePersonxCategory(pnIdPerson number, pnIdCategory number) as

        begin 
            delete from personxcategory where id_person = pnIdPerson and id_category = pnIdCategory;
            commit;

        end deletePersonxCategory;

    end packagePersonxCategory;