SELECT p.name, concat(p.FIRST_LASTNAME,' ',p.SECOND_LASTNAME),p.id_person,a.username,a.b from
    (select DISTINCT USERNAME, (sysdate - pl.log_time) B from PASSWORD_log pl
    where (sysdate - pl.log_time) <= 10 ) a
    join PERSON p on a.username = p.USERNAME
    order by a.b;
--deberia funcionar :v falta consultas
SELECT a, b from 
    (select c.name a, count(c.id_community) b from proposal p 
     join person per on p.id_person = per.id_person
     join community c on per.id_community = c.id_community
    group by c.id_community
    order by b desc;) 
    where numrow >= (select value from parameter where id_parameter = 1);
 
 /*METER EN PROCEDURE*/
 SELECT S.A,S.B,S.C,S.D,S.E FROM (SELECT P.TITLE A, P.SUMMARY B, P.ID_PERSON C, P.POST_TIME D, COUNT(V.ID_VOTE) E,P_ID_PROPOSAL F FROM PROPOSAL P
 JOIN VOTE V ON P.ID_PROPOSAL = V.ID_PROPOSAL
 GROUP BY V.ID_VOTE) S
 JOIN PROPOSALXCATEGORY PC ON S.F = PC.ID_PROPOSAL
 JOIN CATEGORY C ON PC.ID_CATEGORY = C.ID_CATEGORY
 WHERE C.NAME = PNAME, S.D = PDATE, S.E = PVOTE;
 
 /*FALTA UNO*/
 
 /*METER EN PROCEDURE*/
 SELECT * FROM PROPOSAL
 WHERE ID_PERSON = P_ID_PERSON;
 
 
