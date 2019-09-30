create or replace package packageCanton is
    procedure createCanton(pvName varchar2, pnId_province number);
    procedure deleteCanton(pnId_Canton NUMBER);
    procedure updateCantonName(pnId_canton number, pvName varchar2);

    end packageCanton;
    
create or replace package body packageCanton as
    procedure createCanton(pvName varchar2, pnId_province number) is
        begin
            insert into canton(id_canton, name, id_province)
            values(canton_seq.nextval, pvName, pnId_province);
            commit;
        end;

    procedure deleteCanton(pnId_Canton number) is
        begin
            delete from Canton where id_Canton=pnId_Canton;
            commit;
        end;

    procedure updateCantonName(pnId_Canton number, pvName varchar2) is
        begin
            update Canton set name=pvName where id_canton=pnId_Canton;
            commit;
        end;

    end packageCanton;
    
----------------------------------------

create or replace package packageCategory is
    procedure createCategory(pvName varchar2, pnId_Category number);
    procedure deleteCategory(pnId_Category NUMBER);
    procedure updateCategoryName(pnId_category number, pvName varchar2);

    end packageCategory;
    
create or replace package body packageCategory as
    procedure createCategory(pvName varchar2, pnId_category number) is
        begin
            insert into category(id_category, name)
            values(category_seq.nextval, pvName);
            commit;
        end;

    procedure deleteCategory(pnId_Category number) is
        begin
            delete from Category where id_Category=pnId_Category;
            commit;
        end;

    procedure updateCategoryName(pnId_Category number, pvName varchar2) is
        begin
            update Category set name=pvName where id_category=pnId_Category;
            commit;
        end;

    end packageCategory;
    
-------------------------

create or replace package packageCommentary is
    procedure createCommentary( pnId_Comment number,pvContent varchar2, pnId_Proposal number, pnId_Person number);
    procedure deleteCommentary(pnId_Comment NUMBER);
    procedure updateCommentaryContent(pnId_Comment number, pvContent varchar2);
    end packageCommentary;
    
create or replace package body packageCommentary as
    procedure createCommentary(pnId_Comment number, pvContent varchar2, pnId_Proposal number, pnId_Person number) is
        begin
            insert into commentary(id_comment, content, id_Proposal, id_Person)
            values(comment_seq.nextval, pvContent, pnId_Proposal, pnId_Person);
            commit;
        end;

    procedure deleteCommentary(pnId_Comment number) is
        begin
            delete from Commentary where id_Comment=pnId_Comment;
            commit;
        end;

    procedure updateCommentaryContent(pnId_Comment number, pvContent varchar2) is
        begin
            update Commentary set content=pvContent where Id_Comment=pnId_Comment;
            commit;
        end;

    end packageCommentary;
    
-------------------------------------

create or replace package packageCommunity is
    procedure createCommunity(pnId_Community number,pvName varchar2, pnId_District number);
    procedure deleteCommunity(pnId_Community NUMBER);
    procedure updateCommunityName(pnId_Community number, pvName varchar2);
    end packageCommunity;
    
create or replace package body packageCommunity as
    procedure createCommunity(pnId_Community number, pvName varchar2, pnId_District number) is
        begin
            insert into community(id_community, name, id_District)
            values(community_seq.nextval, pvName, pnId_District);
            commit;
        end;

    procedure deleteCommunity(pnId_Community number) is
        begin
            delete from Community where id_Community=pnId_Community;
            commit;
        end;

    procedure updateCommunityName(pnId_Community number, pvName varchar2) is
        begin
            update Community set name=pvName where Id_Community=pnId_Community;
            commit;
        end;

    end packageCommunity;