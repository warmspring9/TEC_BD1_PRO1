
------------------------Canton------------------
create or replace package packageCanton is
    procedure createCanton(pvName varchar2, pnId_province number);
    procedure deleteCanton(pnId_Canton NUMBER);
    procedure updateCantonName(pnId_canton number, pvName varchar2);
    function getName(pnId_canton number) return varchar2;
    function getIdProvince(pnId_canton number) return number;
    function getIdCanton(pvName varchar2) return number;

    end packageCanton;
    
create or replace package body packageCanton as
    procedure createCanton(pvName varchar2, pnId_province number) is
        begin
            insert into canton(id_canton, name, id_province)
            values(canton_seq.nextval, pvName, pnId_province);
            commit;
        end createCanton;

    procedure deleteCanton(pnId_Canton number) is
        begin
            delete from Canton where id_Canton=pnId_Canton;
            commit;
        end deleteCanton;

    procedure updateCantonName(pnId_Canton number, pvName varchar2) is
        begin
            update Canton set name=pvName where id_canton=pnId_Canton;
            commit;
        end updateCantonName;

    function getName(pnId_Canton number) return varchar2 is
        nName varchar2(20);

       begin
              select Name
              into nName
              from Canton
              where id_Canton=pnId_Canton;
              return(nName);
        end getName;

    function getIdProvince(pnId_Canton number) return number is
        nIdProvince number;

       begin
              select id_province
              into nIdProvince
              from Canton
              where id_Canton=pnId_Canton;
              return(nIdProvince);
        end getIdProvince;
        
     function getIdCanton(pvName varchar2) return number is nIdCanton number;
    
    begin 
    
        select id_canton
        into nIdCanton
        from Canton
        where name = pvName;
        return(nIdCanton);
        
    end getIdCanton;

    end packageCanton;

-----------------Category-----------------------
create or replace package packageCategory is
    procedure createCategory(pvName varchar2);
    procedure deleteCategory(pnId_Category NUMBER);
    procedure updateCategoryName(pnId_category number, pvName varchar2);
    function getName(pnId_category number) return varchar2;
    function getIdCategory(pvName varchar2) return number;

    end packageCategory;
    
create or replace package body packageCategory as
    procedure createCategory(pvName varchar2) is
        begin
            insert into category(id_category, name)
            values(category_seq.nextval, pvName);
            commit;
        end createCategory;

    procedure deleteCategory(pnId_Category number) is
        begin
            delete from Category where id_Category=pnId_Category;
            commit;
        end deleteCategory;

    procedure updateCategoryName(pnId_Category number, pvName varchar2) is
        begin
            update Category set name=pvName where id_category=pnId_Category;
            commit;
        end updateCategoryName;

    function getName(pnId_Category number) return varchar2 is
        nName varchar2(20);
        begin
              select Name
              into nName
              from Category
              where id_Category=pnId_Category;
              return(nName);
        end getName;

        function getIdCategory(pvName varchar2) return number is nIdCategory number;
    
        begin 
    
        select id_category
        into nIdCategory
        from Category
        where name = pvName;
        return(nIdCategory);
        
        end getIdCategory;

    end packageCategory;
-----------------Commentary-----------------------

create or replace package packageCommentary is
    procedure createCommentary(pvContent varchar2, pnId_Proposal number, pnId_Person number);
    procedure deleteCommentary(pnId_Comment NUMBER);
    procedure updateCommentaryContent(pnId_Comment number, pvContent varchar2);
    function getContent(pnId_Comment number) return varchar2;
    function getPostTime(pnId_Comment number) return Date;
    function getIdProposal(pnId_Comment number) return number;
    function getIdPerson(pnId_Comment number) return number;
    
    
    end packageCommentary;
    
create or replace package body packageCommentary as
    procedure createCommentary(pvContent varchar2, pnId_Proposal number, pnId_Person number) is
        begin
            insert into commentary(id_comment, content, id_Proposal, id_Person)
            values(comment_seq.nextval, pvContent, pnId_Proposal, pnId_Person);
            commit;
        end createCommentary;

    procedure deleteCommentary(pnId_Comment number) is
        begin
            delete from Commentary where id_Comment=pnId_Comment;
            commit;
        end deleteCommentary;

    procedure updateCommentaryContent(pnId_Comment number, pvContent varchar2) is
        begin
            update Commentary set content=pvContent where Id_Comment=pnId_Comment;
            commit;
        end updateCommentaryContent;
        
    function getContent(pnId_Comment number) return varchar2 is
        nContent varchar2(100);
        begin
            select Content 
            into nContent
            from Commentary
            where id_Comment=pnId_Comment;
            
            return(nContent);
        end getContent;
            
            
    function getPostTime(pnId_Comment number) return Date is
        nPostTime date;
        begin
            select  post_time
            into nPostTime
            from Commentary
            where id_Comment=pnId_Comment;
            
            return(nposttime);
        end getPostTime;
        
    function getIdProposal(pnId_Comment number) return number is
        nIdProposal number;
        begin
            select  id_proposal
            into nIdProposal
            from Commentary
            where id_Comment=pnId_Comment;
            
            return(nIdProposal);
        end getIdProposal;
        
    function getIdPerson(pnId_Comment number) return number is
        nIdPerson number;
        begin
            select  id_person
            into nIdPerson
            from Commentary
            where id_Comment=pnId_Comment;
            
            return(nIdPerson);
        end getIdPerson;
    
    
    end packageCommentary;
 
------------------Community-------------------

create or replace package packageCommunity is
    procedure createCommunity(pvName varchar2, pnId_District number);
    procedure deleteCommunity(pnId_Community NUMBER);
    procedure updateCommunityName(pnId_Community number, pvName varchar2);
    function getName(pnId_Community number) return varchar2;
    function getIdCanton(pnId_Community number) return number;
    function getIdCommunity(pvName varchar2) return number;
    end packageCommunity;
    
create or replace package body packageCommunity as
    procedure createCommunity(pvName varchar2, pnId_District number) is
        begin
            insert into community(id_community, name, id_Canton)
            values(community_seq.nextval, pvName, pnId_District);
            commit;
        end createCommunity;

    procedure deleteCommunity(pnId_Community number) is
        begin
            delete from Community where id_Community=pnId_Community;
            commit;
        end deleteCommunity;

    procedure updateCommunityName(pnId_Community number, pvName varchar2) is
        begin
            update Community set name=pvName where Id_Community=pnId_Community;
            commit;
        end updateCommunityName;

    function getName(pnId_Community number) return varchar2 is
        nName varchar2(30);
        begin
            select Name
            into nName
            from Community
            where id_Community=pnId_Community;

            return(nName);
        end getName;

    function getIdCanton(pnId_Community number) return number is
        nIdDistrict number;
        begin
            select id_Canton
            into nIdDistrict
            from Community
            where id_Community=pnId_Community;

            return(nIdDistrict);
        end getIdCanton;
        
        function getIdCommunity(pvName varchar2) return number is nIdCommunity number;
    
    begin 
    
        select id_community
        into nIdCommunity
        from Community
        where name = pvName;
        return(nIdCommunity);
        
    end getIdCommunity;

    end packageCommunity;

-------------PersonXCountry------------------------
create or replace package packagePersonXCountry is
    procedure createPersonxCountry(pnIdPerson number, pnIdCountry number);
    procedure deletePersonxCountry(pnIdPerson number, pnIdCountry number);
    
    end packagePersonXCountry;

create or replace package body packagePersonXCountry as
    procedure createPersonxCountry(pnIdPerson number, pnIdCountry number) is
    begin
        insert into personxcountry (Id_person, Id_country)
        values(pnIdPerson, pnIdCountry);
        commit;
    end createPersonxCountry;

    procedure deletePersonxCountry(pnIdPerson number, pnIdCountry number) is
        begin
            delete from personXCountry where id_person=pnIdperson and id_country=pnIdCountry;
            commit;
        end deletePersonxCountry;

    end packagePersonXCountry;

----------Proposal---------------------
create or replace package packageProposal is
    procedure createProposal(pvTitle varchar2, pnBudget number, pvSummary varchar2, pnId_person number, pnId_district number);
    procedure deleteProposal(pnId_Proposal number);
    procedure updateTitle(pnId_Proposal number, pvTitle varchar2);
    procedure updateBudget(pnId_Proposal number, pnBudget varchar2);
    procedure updateSummary(pnId_Proposal number, pvSummary varchar2);
    function getTitle(pnId_Proposal number) return varchar2;
    function getBudget(pnId_Proposal number) return number;
    function getSummary(pnId_Proposal number) return varchar2;
    function getPostTime(pnId_Proposal number) return date;
    function getIdPerson(pnId_Proposal number) return number;
    function getIdDistrict(pnId_Proposal number) return number;
    end packageProposal;

create or replace package body packageProposal as
    procedure createProposal(pvTitle varchar2, pnBudget number, pvSummary varchar2, pnId_person number, pnId_district number) is
        begin
            insert into proposal(id_proposal, title, budget, summary, post_time, id_person, id_district)
            values(proposal_seq.nextval, pvTitle, pnBudget, pvSummary, sysdate, pnId_person, pnId_district);
            commit;
        end createProposal;

    procedure deleteProposal(pnId_Proposal number) is
        begin
            delete from Proposal where id_Proposal=pnId_Proposal;
            commit;
        end deleteProposal;

    procedure updateTitle(pnId_Proposal number, pvTitle varchar2) is
        begin
            update Proposal set title=pvTitle where Id_Proposal=pnId_Proposal;
            commit;
        end updateTitle;

    procedure updateBudget(pnId_Proposal number, pnBudget varchar2) is
        begin
            update Proposal set budget=pnBudget where Id_Proposal=pnId_Proposal;
            commit;
        end updateBudget;

    procedure updateSummary(pnId_Proposal number, pvSummary varchar2) is
        begin
            update Proposal set summary=pvSummary where Id_Proposal=pnId_Proposal;
            commit;
        end updateSummary;

    function getTitle(pnId_Proposal number) return varchar2 is
        nTitle varchar2(30);
        begin
            select title
            into nTitle
            from Proposal
            where id_Proposal=pnId_Proposal;

            return(nTitle);
        end getTitle;

    function getBudget(pnId_Proposal number) return number is
        nBudget NUMBER;
        begin
            select budget
            into nbudget
            from Proposal
            where id_Proposal=pnId_Proposal;

            return(nBudget);
        end getBudget;

    function getSummary(pnId_Proposal number) return varchar2 is
        nSummary varchar2(200);
        begin
            select summary
            into nSummary
            from Proposal
            where id_Proposal=pnId_Proposal;

            return(nSummary);
        end getSummary;

    function getPostTime(pnId_Proposal number) return DATE is
        nPostTime date;
        begin
            select post_time
            into nPostTime
            from Proposal
            where id_Proposal=pnId_Proposal;

            return(nPostTime);
        end getPostTime;

        function getIdPerson(pnId_Proposal number) return NUMBER is
        nIdPerson number;
        begin
            select id_person
            into nIdPerson
            from Proposal
            where id_Proposal=pnId_Proposal;

            return(nIdPerson);
        end getIdPerson;
        
        function getIdDistrict(pnId_Proposal number) return NUMBER is
        nIdDistrict number;
        begin
            select id_district
            into nIdDistrict
            from Proposal
            where id_Proposal=pnId_Proposal;

            return(nIdDistrict);
        end getIdDistrict;

    end packageProposal;
    
    
----------Proposal_Photo---------------------
create or replace package packageProposalPhoto is
    procedure createProposalPhoto(pvContent varchar2, pnIdProposal number);
    procedure deleteProposalPhoto(pnId_ProposalPhoto number);
    procedure updateContent(pnId_ProposalPhoto number, pvContent varchar2);
    function getContent(pnId_ProposalPhoto number) return varchar2;
    function getIdProposal(pnId_ProposalPhoto number) return number;
    end packageProposalPhoto;

create or replace package body packageProposalPhoto as
    procedure createProposalPhoto(pvContent varchar2, pnIdProposal number) is
        begin
            insert into Proposal_Photo(id_proposal_photo, content, id_proposal)
            values(proposal_Photo_seq.nextval, pvContent, pnIdproposal);
            commit;
        end createProposalPhoto;

    procedure deleteProposalPhoto(pnId_ProposalPhoto number) is
        begin
            delete from Proposal_Photo where id_Proposal_Photo=pnId_ProposalPhoto;
            commit;
        end deleteProposalPhoto;

    procedure updateContent(pnId_ProposalPhoto number, pvContent varchar2) is
        begin
            update Proposal_Photo set content=pvContent where Id_Proposal_Photo=pnId_ProposalPhoto;
            commit;
        end updateContent;
        
    function getContent(pnId_ProposalPhoto number) return varchar2 is
        nContent varchar2(40);
        begin
            select content
            into nContent
            from Proposal_Photo
            where id_Proposal_Photo=pnId_ProposalPhoto;
            
            return(nContent);
        end getContent;
        
    function getIdProposal(pnId_ProposalPhoto number) return number is
        nIdProposal NUMBER;
        begin
            select id_proposal
            into nIdProposal
            from Proposal_Photo
            where id_Proposal_Photo=pnId_ProposalPhoto;
            
            return(nIdProposal);
        end getIdProposal;

    end packageProposalPhoto;

-------------PersonXCountry------------------------
create or replace package packageProposalXCategory is
    procedure createProposalXCategory(pnIdProposal number, pnIdCategory number);
    procedure deleteProposalXCategory(pnIdProposal number, pnIdCategory number);
    
    end packageProposalXCategory;

create or replace package body packageProposalXCategory as
    procedure createProposalXCategory(pnIdProposal number, pnIdCategory number) is
    begin
        insert into proposalxCategory(Id_proposal, Id_category)
        values(pnIdProposal, pnIdCategory);
        commit;
    end createProposalxCategory;

    procedure deleteProposalXCategory(pnIdProposal number, pnIdCategory number) is
        begin
            delete from proposalxcategory where id_proposal=pnIdProposal and id_category=pnidcategory;
            commit;
        end deleteProposalXCategory;

    end packageProposalXCategory;
    

----------------Province-------------------
create or replace package packageProvince is
    procedure createProvince(pvName varchar2, pnId_country number);
    procedure deleteProvince(pnId_Province NUMBER);
    procedure updateProvinceName(pnId_Province number, pvName varchar2);
    function getName(pnId_Province number) return varchar2;
    function getIdCountry(pnId_Province number) return number;

    end packageProvince;

create or replace package body packageProvince as
    procedure createProvince(pvName varchar2, pnId_country number) is
        begin
            insert into province(id_province, name, id_country)
            values(province_seq.nextval, pvName, pnId_country);
            commit;
        end createProvince;

    procedure deleteProvince(pnId_province number) is
        begin
            delete from province where id_province=pnId_province;
            commit;
        end deleteProvince;

    procedure updateProvinceName(pnId_Province number, pvName varchar2) is
        begin
            update Province set name=pvName where id_province=pnId_province;
            commit;
        end updateProvinceName;
        
    function getName(pnId_province number) return varchar2 is
        nName varchar2(20);

       begin
              select Name
              into nName
              from Province
              where id_Province=pnId_Province;
              return(nName);
        end getName;
    
    function getIdCountry(pnId_province number) return number is
        nIdCountry number;

       begin
              select id_country
              into nIdCountry
              from Province
              where id_province=pnId_province;
              return(nIdCountry);
        end getIdCountry;

    end packageProvince; 

--------------USER_TYPE-------------------------

create or replace package packageUserType is
    procedure createUserType(pvName varchar2);
    procedure deleteUserType(pnId_UserType NUMBER);
    procedure updateUserTypeName(pnId_UserType number, pvName varchar2);
    function getName(pnId_UserType number) return varchar2;

    end packageUserType;

create or replace package body packageUserType as
    
    procedure createUserType(pvName varchar2) as
        begin
            insert into user_type (id_user_type, name)
            values(USER_TYPE_SEQ.nextval, pvName);
            commit;
        end createUserType;

    procedure deleteUserType(pnId_userType number) is
        begin
            delete from User_Type where id_user_type=pnId_userType;
            commit;
        end deleteUserType;

    procedure updateUserTypeName(pnId_UserType number, pvName varchar2) is
        begin
            update User_type set name=pvName where id_user_type=pnId_userType;
            commit;
        end updateUserTypeName;
        
    function getName(pnId_UserType number) return varchar2 is
        nName varchar2(20);
       begin
              select Name
              into nName
              from user_type
              where id_user_type=pnId_userType;
              return(nName);
        end getName;

    end packageUserType; 
    
    
-----------------Voto------------------------

create or replace package packageVote is
    procedure createVote(pnEmote NUMBER);
    procedure deleteVote(pnId_Vote NUMBER);
    procedure updateEmote(pnId_Vote number, pnEmote number);
    function getEmote(pnId_Vote number) return number;
    function getIdProposal(pnId_Vote number) return number;
    function getIdPerson(pnId_Vote number) return number;

    end packageVote;

create or replace package body packageVote as
    
    procedure createVote(pnEmote number) as
        begin
            insert into Vote(id_vote, emote)
            values(VOTE_SEQ.nextval, pnEmote);
            commit;
        end createVote;

    procedure deleteVote(pnId_Vote number) is
        begin
            delete from Vote where id_vote=pnId_Vote;
            commit;
        end deleteVote;

    procedure updateEmote(pnId_Vote number, pnEmote number) is
        begin
            update Vote set emote=pnEmote where id_vote=pnId_vote;
            commit;
        end updateEmote;
        
    function getEmote(pnId_vote number) return number is
        nEmote number;
       begin
              select emote
              into nEmote
              from vote
              where id_vote=pnId_vote;
              return(nEmote);
        end getEmote;
        
    function getIdProposal(pnId_vote number) return number is
        nIdProposal number;
       begin
              select id_proposal
              into nIdProposal
              from vote
              where id_vote=pnId_vote;
              return(nIdProposal);
        end getIdProposal;
        
    function getIdPerson(pnId_vote number) return number is
        nIdPerson number;
       begin
              select id_person
              into nIdPerson
              from vote
              where id_vote=pnId_vote;
              return(nIdPerson);
        end getIdPerson;

    end packageVote;
    
----------------------Phone---------------------------

create or replace package packagePhone is
    procedure createPhone(pvTelephone varchar2, pnIdPerson number);
    procedure deletePhone(pvTelephone varchar2);
    procedure updatePhone(pvTelephone varchar2, pvNTelephone varchar2);
    function getIdPerson(pvTelephone varchar2) return number;
    function getTelephone(pnId number) return varchar2;

    end packagePhone;

create or replace package body packagePhone as
    
    procedure createPhone(pvTelephone varchar2, pnIdPerson number) as
        begin
            insert into Phone(Telephone, id_person)
            values(pvTelephone, pnidperson);
            commit;
        end createPhone;

    procedure deletePhone(pvTelephone varchar2) is
        begin
            delete from Phone where Telephone=pvTelephone;
            commit;
        end deletePhone;

    procedure updatePhone(pvTelephone varchar2, pvNTelephone varchar2) is
        begin
            update Phone set Telephone=pvNTelephone where Telephone=pvTelephone;
            commit;
        end updatePhone;

    function getIdPerson(pvTelephone varchar2) return number is
        nIdPerson number;
       begin
              select id_person
              into nIdPerson
              from Phone
              where Telephone=pvTelephone;
              return(nIdPerson);
        end getIdPerson;
        
        function getTelephone(pnId number) return varchar2 is
        nTelephone varchar2(40);
       begin
              select telephone
              into nTelephone
              from Phone
              where pnId=id_person;
              return(nTelephone);
        end getTelephone;

    end packagePhone;

-----------------------------------------
create or replace package packageCountry is

    procedure createCountry(pvName Varchar2);
    procedure deleteCountry(pnIdCountry number);
    procedure updateCountryName(pnIdCountry number, pvNewName varchar2);
    function getCountryName(pnIdCountry in number) return varchar2;
    function getIdCountry(pvName varchar2) return number;

end packageCountry;
    
create or replace package body packageCountry as

    procedure createCountry(pvName Varchar2) as

        begin
            insert into country (id_country, name)
            values(COUNTRY_SEQ.nextval, pvName);
            commit;

        end createCountry;
        
    function getIdCountry(pvName varchar2) return number is nIdCountry number;
    
    begin 
    
        select id_country
        into nIdCountry
        from country
        where name = pvName;
        return(nIdCountry);
        
    end getIdCountry;


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

    procedure createLogIn(pnIdLogin number, pvPassword varchar2, pnIdUserType number);
    procedure deleteLogIn(pnIdLogIn number);
    procedure updateLogInPassword(pnIdLogIn number, pvNewPassword varchar2);
    function getLogInUserType(pnIdLogin number) return number;
    function getLogInPassword(pnIdLogin number) return varchar2;

end packageLogIn;

create or replace package body packageLogIn as

     procedure createLogIn(pnIdLogIn number, pvPassword varchar2, pnIdUserType number) as

    begin
        insert into log_in (id_log_in, password, id_user_type)
        values(pnIdLogIn, pvPassword, pnIdUserType);

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

    function getLogInUserType(pnIdLogin number) return number is

        vcUserType number;

        begin 
            select id_user_type
            into vcUserType
            from log_in
            where id_Log_in = pnIdLogin;

            return(vcUserType);
        end getLogInUserType;

    function getLogInPassword(pnIdLogin number) return varchar2 is

        vcPassword varchar2(30);

        begin 
            select password
            into vcPassword
            from log_in
            where id_Log_in = pnIdLogin;

            return(vcPassword);
        end getLogInPassword;

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

    procedure createPerson(pnIdPerson number, pvName varchar2, pvFirstLastName varchar2, 
     pvSecondLastName varchar2, pdDate date, 
     pnIdCommunity number);
    procedure deletePerson(pnIdPerson number);

    procedure updatePersonName(pnIdPerson number, pvNewName varchar2);
    procedure updatePersonFirstLastName(pnIdPerson number, pvNewFirstLastName varchar2);
    procedure updatePersonSecondLastName(pnIdPerson number, pvNewSecondLastName varchar2);
    procedure updatePersonBirthdate(pnIdPerson number, pvNewBirthDate date);

    function getPersonFirstName(pnIdPerson number) return varchar2; 
    function getPersonFirstLastName(pnIdPerson number) return varchar2; 
    function getPersonSecondLastName(pnIdPerson number) return varchar2; 
    function getPersonBirthdate(pnIdPerson number) return date;
    function getPersonIdCommunity(pnIdPerson number) return number;    
    function getPersonIdLogIn(pnIdPerson number) return number;


end packagePerson;

create or replace package body packagePerson is

    procedure createPerson
    (pnIdPerson number, pvName varchar2, pvFirstLastName varchar2, 
     pvSecondLastName varchar2, pdDate date, 
     pnIdCommunity number) as

    begin
        insert into person (id_person, name, first_lastName, second_lastName, birthdate, id_community, id_log_in)
        values(pnIdPerson, pvName, pvFirstLastName, pvSecondLastName, pdDate, pnIdCommunity, pnIdPerson);

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

    procedure updatePersonSecondLastName(pnIdPerson number, pvNewSecondLastName varchar2) as

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

    function getPersonIdCommunity(pnIdPerson number) return number is

        vdIdCommunity number;

        begin 
            select id_community
            into vdIdCommunity
            from person
            where id_person = pnIdPerson;

            return(vdIdCommunity);

        end getPersonIdCommunity;

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


create or replace package packageCanton is
    procedure createCanton(pvName varchar2, pnId_province number);
    procedure deleteCanton(pnId_Canton NUMBER);
    procedure updateCantonName(pnId_canton number, pvName varchar2);
    function getName(pnId_canton number) return varchar2;
    function getIdProvince(pnId_canton number) return number;

    end packageCanton;
    
create or replace package body packageCanton as
    procedure createCanton(pvName varchar2, pnId_province number) is
        begin
            insert into canton(id_canton, name, id_province)
            values(canton_seq.nextval, pvName, pnId_province);
            commit;
        end createCanton;

    procedure deleteCanton(pnId_Canton number) is
        begin
            delete from Canton where id_Canton=pnId_Canton;
            commit;
        end deleteCanton;

    procedure updateCantonName(pnId_Canton number, pvName varchar2) is
        begin
            update Canton set name=pvName where id_canton=pnId_Canton;
            commit;
        end updateCantonName;
        
    function getName(pnId_Canton number) return varchar2 is
        nName varchar2(20);

       begin
              select Name
              into nName
              from Canton
              where id_Canton=pnId_Canton;
              return(nName);
        end getName;
    
    function getIdProvince(pnId_Canton number) return number is
        nIdProvince number;

       begin
              select id_province
              into nIdProvince
              from Canton
              where id_Canton=pnId_Canton;
              return(nIdProvince);
        end getIdProvince;

    end packageCanton;  

create or replace package packageCategory is
    procedure createCategory(pvName varchar2, pnId_Category number);
    procedure deleteCategory(pnId_Category NUMBER);
    procedure updateCategoryName(pnId_category number, pvName varchar2);
    function getName(pnId_category number) return varchar2;

    end packageCategory;
    
create or replace package body packageCategory as
    procedure createCategory(pvName varchar2, pnId_category number) is
        begin
            insert into category(id_category, name)
            values(category_seq.nextval, pvName);
            commit;
        end createCategory;

    procedure deleteCategory(pnId_Category number) is
        begin
            delete from Category where id_Category=pnId_Category;
            commit;
        end deleteCategory;

    procedure updateCategoryName(pnId_Category number, pvName varchar2) is
        begin
            update Category set name=pvName where id_category=pnId_Category;
            commit;
        end updateCategoryName;
        
    function getName(pnId_Category number) return varchar2 is
        nName varchar2(20);
        begin
              select Name
              into nName
              from Category
              where id_Category=pnId_Category;
              return(nName);
        end getName;

    end packageCategory;


create or replace package packageCommentary is
    procedure createCommentary(pvContent varchar2, pnId_Proposal number, pnId_Person number);
    procedure deleteCommentary(pnId_Comment NUMBER);
    procedure updateCommentaryContent(pnId_Comment number, pvContent varchar2);
    function getContent(pnId_Comment number) return varchar2;
    function getPostTime(pnId_Comment number) return Date;
    function getIdProposal(pnId_Comment number) return number;
    function getIdPerson(pnId_Comment number) return number;
    
    
    end packageCommentary;
    
create or replace package body packageCommentary as
    procedure createCommentary(pvContent varchar2, pnId_Proposal number, pnId_Person number) is
        begin
            insert into commentary(id_comment, content, id_Proposal, id_Person)
            values(comment_seq.nextval, pvContent, pnId_Proposal, pnId_Person);
            commit;
        end createCommentary;

    procedure deleteCommentary(pnId_Comment number) is
        begin
            delete from Commentary where id_Comment=pnId_Comment;
            commit;
        end deleteCommentary;

    procedure updateCommentaryContent(pnId_Comment number, pvContent varchar2) is
        begin
            update Commentary set content=pvContent where Id_Comment=pnId_Comment;
            commit;
        end updateCommentaryContent;
        
    function getContent(pnId_Comment number) return varchar2 is
        nContent varchar2(100);
        begin
            select Content 
            into nContent
            from Commentary
            where id_Comment=pnId_Comment;
            
            return(nContent);
        end getContent;
            
            
    function getPostTime(pnId_Comment number) return Date is
        nPostTime date;
        begin
            select  post_time
            into nPostTime
            from Commentary
            where id_Comment=pnId_Comment;
            
            return(nposttime);
        end getPostTime;
        
    function getIdProposal(pnId_Comment number) return number is
        nIdProposal number;
        begin
            select  id_proposal
            into nIdProposal
            from Commentary
            where id_Comment=pnId_Comment;
            
            return(nIdProposal);
        end getIdProposal;
        
    function getIdPerson(pnId_Comment number) return number is
        nIdPerson number;
        begin
            select  id_person
            into nIdPerson
            from Commentary
            where id_Comment=pnId_Comment;
            
            return(nIdPerson);
        end getIdPerson;
    
    
    end packageCommentary;


create or replace package packageCommunity is
    procedure createCommunity(pvName varchar2, pnId_District number);
    procedure deleteCommunity(pnId_Community NUMBER);
    procedure updateCommunityName(pnId_Community number, pvName varchar2);
    function getName(pnId_Community number) return varchar2;
    function getIdCanton(pnId_Community number) return number;
    end packageCommunity;
    
create or replace package body packageCommunity as
    procedure createCommunity(pvName varchar2, pnId_District number) is
        begin
            insert into community(id_community, name, id_Canton)
            values(community_seq.nextval, pvName, pnId_District);
            commit;
        end createCommunity;

    procedure deleteCommunity(pnId_Community number) is
        begin
            delete from Community where id_Community=pnId_Community;
            commit;
        end deleteCommunity;

    procedure updateCommunityName(pnId_Community number, pvName varchar2) is
        begin
            update Community set name=pvName where Id_Community=pnId_Community;
            commit;
        end updateCommunityName;

    function getName(pnId_Community number) return varchar2 is
        nName varchar2(30);
        begin
            select Name
            into nName
            from Community
            where id_Community=pnId_Community;

            return(nName);
        end getName;

    function getIdCanton(pnId_Community number) return number is
        nIdDistrict number;
        begin
            select id_Canton
            into nIdDistrict
            from Community
            where id_Community=pnId_Community;

            return(nIdDistrict);
        end getIdCanton;

    end packageCommunity;

create or replace package packagePersonXCountry is
    procedure createPersonxCountry(pnIdPerson number, pnIdCountry number);
    procedure deletePersonxCountry(pnIdPerson number, pnIdCountry number);
    
    end packagePersonXCountry;

create or replace package body packagePersonXCountry as
    procedure createPersonxCountry(pnIdPerson number, pnIdCountry number) is
    begin
        insert into personxcountry (Id_person, Id_country)
        values(pnIdPerson, pnIdCountry);
        commit;
    end createPersonxCountry;

    procedure deletePersonxCountry(pnIdPerson number, pnIdCountry number) is
        begin
            delete from personXCountry where id_person=pnIdperson and id_country=pnIdCountry;
            commit;
        end deletePersonxCountry;

    end packagePersonXCountry;

create or replace package packageProposal is
    procedure createProposal(pvTitle varchar2, pnBudget number, pvSummary varchar2, pnId_person number, pnCategory number);
    procedure deleteProposal(pnId_Proposal number);
    procedure updateTitle(pnId_Proposal number, pvTitle varchar2);
    procedure updateBudget(pnId_Proposal number, pnBudget varchar2);
    procedure updateSummary(pnId_Proposal number, pvSummary varchar2);
    function getTitle(pnId_Proposal number) return varchar2;
    function getBudget(pnId_Proposal number) return number;
    function getSummary(pnId_Proposal number) return varchar2;
    function getPostTime(pnId_Proposal number) return date;
    function getIdPerson(pnId_Proposal number) return number;
    end packageProposal;

create or replace package body packageProposal as
    procedure createProposal(pvTitle varchar2, pnBudget number, pvSummary varchar2, pnId_person number, pnCategory number) is
        begin
            insert into proposal(id_proposal, title, budget, summary, post_time, id_person)
            values(proposal_seq.nextval , pvTitle, pnBudget, pvSummary, sysdate, pnId_person);
            
            insert into proposalxcategory(id_proposal, id_category) values (proposal_seq.currVal, pnCategory);
            commit;
        end createProposal;

    procedure deleteProposal(pnId_Proposal number) is
        begin
            delete from Proposal where id_Proposal=pnId_Proposal;
            commit;
        end deleteProposal;

    procedure updateTitle(pnId_Proposal number, pvTitle varchar2) is
        begin
            update Proposal set title=pvTitle where Id_Proposal=pnId_Proposal;
            commit;
        end updateTitle;

    procedure updateBudget(pnId_Proposal number, pnBudget varchar2) is
        begin
            update Proposal set budget=pnBudget where Id_Proposal=pnId_Proposal;
            commit;
        end updateBudget;

    procedure updateSummary(pnId_Proposal number, pvSummary varchar2) is
        begin
            update Proposal set summary=pvSummary where Id_Proposal=pnId_Proposal;
            commit;
        end updateSummary;

    function getTitle(pnId_Proposal number) return varchar2 is
        nTitle varchar2(30);
        begin
            select title
            into nTitle
            from Proposal
            where id_Proposal=pnId_Proposal;

            return(nTitle);
        end getTitle;

    function getBudget(pnId_Proposal number) return number is
        nBudget NUMBER;
        begin
            select budget
            into nbudget
            from Proposal
            where id_Proposal=pnId_Proposal;

            return(nBudget);
        end getBudget;

    function getSummary(pnId_Proposal number) return varchar2 is
        nSummary varchar2(200);
        begin
            select summary
            into nSummary
            from Proposal
            where id_Proposal=pnId_Proposal;

            return(nSummary);
        end getSummary;

    function getPostTime(pnId_Proposal number) return DATE is
        nPostTime date;
        begin
            select post_time
            into nPostTime
            from Proposal
            where id_Proposal=pnId_Proposal;

            return(nPostTime);
        end getPostTime;

        function getIdPerson(pnId_Proposal number) return NUMBER is
        nIdPerson number;
        begin
            select id_person
            into nIdPerson
            from Proposal
            where id_Proposal=pnId_Proposal;

            return(nIdPerson);
        end getIdPerson;
        

    end packageProposal;

create or replace package packageProposalPhoto is
    procedure createProposalPhoto(pvContent varchar2, pnIdProposal number);
    procedure deleteProposalPhoto(pnId_ProposalPhoto number);
    procedure updateContent(pnId_ProposalPhoto number, pvContent varchar2);
    function getContent(pnId_ProposalPhoto number) return varchar2;
    function getIdProposal(pnId_ProposalPhoto number) return number;
    end packageProposalPhoto;

create or replace package body packageProposalPhoto as
    procedure createProposalPhoto(pvContent varchar2, pnIdProposal number) is
        begin
            insert into Proposal_Photo(id_proposal_photo, content, id_proposal)
            values(proposal_Photo_seq.nextval, pvContent, pnIdproposal);
            commit;
        end createProposalPhoto;

    procedure deleteProposalPhoto(pnId_ProposalPhoto number) is
        begin
            delete from Proposal_Photo where id_Proposal_Photo=pnId_ProposalPhoto;
            commit;
        end deleteProposalPhoto;

    procedure updateContent(pnId_ProposalPhoto number, pvContent varchar2) is
        begin
            update Proposal_Photo set content=pvContent where Id_Proposal_Photo=pnId_ProposalPhoto;
            commit;
        end updateContent;
        
    function getContent(pnId_ProposalPhoto number) return varchar2 is
        nContent varchar2(40);
        begin
            select content
            into nContent
            from Proposal_Photo
            where id_Proposal_Photo=pnId_ProposalPhoto;
            
            return(nContent);
        end getContent;
        
    function getIdProposal(pnId_ProposalPhoto number) return number is
        nIdProposal NUMBER;
        begin
            select id_proposal
            into nIdProposal
            from Proposal_Photo
            where id_Proposal_Photo=pnId_ProposalPhoto;
            
            return(nIdProposal);
        end getIdProposal;

    end packageProposalPhoto;

create or replace package packageProvince is
    procedure createProvince(pvName varchar2, pnId_country number);
    procedure deleteProvince(pnId_Province NUMBER);
    procedure updateProvinceName(pnId_Province number, pvName varchar2);
    function getName(pnId_Province number) return varchar2;
    function getIdCountry(pnId_Province number) return number;
    function getIdProvince(pvName varchar2) return number;
    end packageProvince;

create or replace package body packageProvince as

    function getIdProvince(pvName varchar2) return number is nIdProvince number;

    begin 

        select id_province
        into nIdProvince
        from province
        where name = pvName;
        return(nIdProvince);

    end getIdProvince;

    
    procedure createProvince(pvName varchar2, pnId_country number) is
        begin
            insert into province(id_province, name, id_country)
            values(province_seq.nextval, pvName, pnId_country);
            commit;
        end createProvince;

    procedure deleteProvince(pnId_province number) is
        begin
            delete from province where id_province=pnId_province;
            commit;
        end deleteProvince;

    procedure updateProvinceName(pnId_Province number, pvName varchar2) is
        begin
            update Province set name=pvName where id_province=pnId_province;
            commit;
        end updateProvinceName;

    function getName(pnId_province number) return varchar2 is
        nName varchar2(20);

       begin
              select Name
              into nName
              from Province
              where id_Province=pnId_Province;
              return(nName);
        end getName;

    function getIdCountry(pnId_province number) return number is
        nIdCountry number;

       begin
              select id_country
              into nIdCountry
              from Province
              where id_province=pnId_province;
              return(nIdCountry);
        end getIdCountry;

    end packageProvince;

create or replace package packageUserType is
    procedure createUserType(pvName varchar2);
    procedure deleteUserType(pnId_UserType NUMBER);
    procedure updateUserTypeName(pnId_UserType number, pvName varchar2);
    function getName(pnId_UserType number) return varchar2;

    end packageUserType;

create or replace package body packageUserType as
    
    procedure createUserType(pvName varchar2) as
        begin
            insert into user_type (id_user_type, name)
            values(USER_TYPE_SEQ.nextval, pvName);
            commit;
        end createUserType;

    procedure deleteUserType(pnId_userType number) is
        begin
            delete from User_Type where id_user_type=pnId_userType;
            commit;
        end deleteUserType;

    procedure updateUserTypeName(pnId_UserType number, pvName varchar2) is
        begin
            update User_type set name=pvName where id_user_type=pnId_userType;
            commit;
        end updateUserTypeName;
        
    function getName(pnId_UserType number) return varchar2 is
        nName varchar2(20);
       begin
              select Name
              into nName
              from user_type
              where id_user_type=pnId_userType;
              return(nName);
        end getName;

    end packageUserType; 

create or replace package packageVote is
    procedure createVote(pnEmote NUMBER);
    procedure deleteVote(pnId_Vote NUMBER);
    procedure updateEmote(pnId_Vote number, pnEmote number);
    function getEmote(pnId_Vote number) return number;
    function getIdProposal(pnId_Vote number) return number;
    function getIdPerson(pnId_Vote number) return number;

    end packageVote;

create or replace package body packageVote as
    
    procedure createVote(pnEmote number) as
        begin
            insert into Vote(id_vote, emote)
            values(VOTE_SEQ.nextval, pnEmote);
            commit;
        end createVote;

    procedure deleteVote(pnId_Vote number) is
        begin
            delete from Vote where id_vote=pnId_Vote;
            commit;
        end deleteVote;

    procedure updateEmote(pnId_Vote number, pnEmote number) is
        begin
            update Vote set emote=pnEmote where id_vote=pnId_vote;
            commit;
        end updateEmote;
        
    function getEmote(pnId_vote number) return number is
        nEmote number;
       begin
              select emote
              into nEmote
              from vote
              where id_vote=pnId_vote;
              return(nEmote);
        end getEmote;
        
    function getIdProposal(pnId_vote number) return number is
        nIdProposal number;
       begin
              select id_proposal
              into nIdProposal
              from vote
              where id_vote=pnId_vote;
              return(nIdProposal);
        end getIdProposal;
        
    function getIdPerson(pnId_vote number) return number is
        nIdPerson number;
       begin
              select id_person
              into nIdPerson
              from vote
              where id_vote=pnId_vote;
              return(nIdPerson);
        end getIdPerson;

    end packageVote;

create or replace package packagePhone is
    procedure createPhone(pvTelephone varchar2, pnIdPerson number);
    procedure deletePhone(pvTelephone varchar2);
    procedure updatePhone(pvTelephone varchar2, pvNTelephone varchar2);
    function getIdPerson(pvTelephone varchar2) return number;

    end packagePhone;

create or replace package body packagePhone as
    
    procedure createPhone(pvTelephone varchar2, pnIdPerson number) as
        begin
            insert into Phone(Telephone, id_person)
            values(pvTelephone, pnidperson);
            commit;
        end createPhone;

    procedure deletePhone(pvTelephone varchar2) is
        begin
            delete from Phone where Telephone=pvTelephone;
            commit;
        end deletePhone;

    procedure updatePhone(pvTelephone varchar2, pvNTelephone varchar2) is
        begin
            update Phone set Telephone=pvNTelephone where Telephone=pvTelephone;
            commit;
        end updatePhone;
        
    function getIdPerson(pvTelephone varchar2) return number is
        nIdPerson number;
       begin
              select id_person
              into nIdPerson
              from Phone
              where Telephone=pvTelephone;
              return(nIdPerson);
        end getIdPerson;

    end packagePhone;

create or replace package packageProposalXCategory is
    procedure createProposalXCategory(pnIdProposal number, pnIdCategory number);
    procedure deleteProposalXCategory(pnIdProposal number, pnIdCategory number);
    
    end packageProposalXCategory;

create or replace package body packageProposalXCategory as
    procedure createProposalXCategory(pnIdProposal number, pnIdCategory number) is
    begin
        insert into proposalxCategory(Id_proposal, Id_category)
        values(pnIdProposal, pnIdCategory);
        commit;
    end createProposalxCategory;

    procedure deleteProposalXCategory(pnIdProposal number, pnIdCategory number) is
        begin
            delete from proposalxcategory where id_proposal=pnIdProposal and id_category=pnidcategory;
            commit;
        end deleteProposalXCategory;

    end packageProposalXCategory;
