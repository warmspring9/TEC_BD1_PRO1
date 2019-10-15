--reporte 1 admin
CREATE OR REPLACE PROCEDURE REP_PassChange_PR
(
    Pusername in VARCHAR2 DEFAULT '',
    PfirstLast in VARCHAR2 DEFAULT '',
    PsecondLast in VARCHAR2 DEFAULT '',
    Pid in NUMBER DEFAULT 0,
    PassChange_CURSOR out sys_refcursor,
    total out NUMBER
)
AS
BEGIN
    /*
    Descripcion: Retorna todos los usuarios que no han cambiado sus contraseñas en 10 dias
    Por: Nicolas Reyes
    09/10/2019    
    */
    OPEN PassChange_CURSOR FOR
    SELECT A.ID_LOG_IN,p.name,p.first_lastname,p.second_lastname,p.id_person from
    (select id_log_in from password_changes pl
    where (sysdate-pl.change_date) > 10 ) a
    join Log_In lg on a.id_log_in = LG.Username
    join PERSON p on lg.Username = p.id_log_in
    where (a.id_log_in = Pusername OR Pusername = '') AND
    (p.first_lastname = PfirstLast OR PfirstLast = '') AND
    (p.second_lastname = PsecondLast OR PsecondLast = '') AND
    (p.id_person = Pid OR Pid = 0);


END;
/

CREATE OR REPLACE PROCEDURE REP_TotPassChange_PR
(
    Pusername in VARCHAR2 DEFAULT '',
    PfirstLast in VARCHAR2 DEFAULT '',
    PsecondLast in VARCHAR2 DEFAULT '',
    Pid in NUMBER DEFAULT 0,
    total out NUMBER
)
AS
BEGIN
    /*
    Descripcion: Retorna el total de usuarios que no han cambiado sus contraseñas en 10 dias
    Por: Nicolas Reyes
    09/10/2019    
    */
    SELECT COUNT(a.id_log_in) into total from
    (select id_log_in from password_changes pl
    where (sysdate-pl.change_date) > 10 ) a
    join Log_In lg on a.id_log_in = LG.Username
    join PERSON p on lg.Username = p.id_log_in
    where (a.id_log_in = Pusername OR Pusername = '') AND
    (p.first_lastname = PfirstLast OR PfirstLast = '') AND
    (p.second_lastname = PsecondLast OR PsecondLast = '') AND
    (p.id_person = Pid OR Pid = 0);
END;
/

--reporte 2 admin
insert into parameter values (1,'reportAdmin',5);

CREATE OR REPLACE PROCEDURE REP_TopNComm_PR
(
    TopNComm_CURSOR out sys_refcursor
)
AS
BEGIN
    /*
    Descripcion: Retorna el top n communidades que mas propuestas tienen
    Por: Nicolas Reyes
    09/10/2019    
    */
    OPEN TopNComm_CURSOR FOR
    SELECT a, b from 
    (select c.id_community a, count(c.id_community) b from proposal p 
     join person per on p.id_person = per.id_person
     join community c on per.id_community = c.id_community
    group by c.id_community
    order by b desc) 
    where rownum <= (select value from parameter where id_parameter = 1);
 END;
/

 /*ESTE HAY QUE FORMATEARLO PARA QUE QUEDE BONITO PORQUE REPITE LOS PROPOSALS CUANDO TIENEN MUCHAS CATEGORIAS*/
CREATE OR REPLACE PROCEDURE REP_PROPXCATEGORY_PR
(
    PCOM in NUMBER DEFAULT 0,
    PVOTES in NUMBER DEFAULT 0,
    PCATEGORY in NUMBER DEFAULT 0,
    PINICIALDATE in DATE DEFAULT TO_DATE('1999/00/00','YYYY/MM/DD'),
    PDAYSBETWEEN in number DEFAULT 99999,
    PROPCATEG_CURSOR out sys_refcursor
)
AS
BEGIN
    /*
    Descripcion: Retorna las propuestas por categoria 
    Por: Nicolas Reyes
    09/10/2019    
    */
    OPEN PROPCATEG_CURSOR FOR
    SELECT PROPO.TITLE, C.NAME, B FROM (SELECT P.ID_PROPOSAL A, COUNT(V.ID_PROPOSAL) B FROM PROPOSAL P
        LEFT JOIN VOTE V ON P.ID_PROPOSAL = V.ID_PROPOSAL
        JOIN PERSON PER ON P.ID_PERSON = PER.ID_PERSON 
        WHERE PER.ID_COMMUNITY = PCOM OR PCOM = 0
        GROUP BY P.ID_PROPOSAL
        HAVING COUNT(V.ID_PROPOSAL) >= PVOTES
        ORDER BY P.ID_PROPOSAL) PROP
    JOIN PROPOSAL PROPO ON A=PROPO.ID_PROPOSAL
    LEFT JOIN PROPOSALXCATEGORY PXC ON A = PXC.ID_PROPOSAL
    JOIN CATEGORY C ON PXC.ID_CATEGORY=C.ID_CATEGORY
    WHERE (C.ID_CATEGORY=PCATEGORY OR PCATEGORY = 0) AND (PROPO.POST_TIME>=PINICIALDATE AND PROPO.POST_TIME<=PINICIALDATE+PDAYSBETWEEN);  
 END;
 /

 CREATE OR REPLACE PROCEDURE REP_PROPXCATEGTOTAL_PR
(
    PCOM in NUMBER DEFAULT 0,
    PVOTES in NUMBER DEFAULT 0,
    PCATEGORY in NUMBER DEFAULT 0,
    PINICIALDATE in DATE DEFAULT TO_DATE('1999/00/00','YYYY/MM/DD'),
    PDAYSBETWEEN in number DEFAULT 99999,
    total out NUMBER
)
AS
BEGIN
    /*
    Descripcion: Retorna el total de propuestas de cada categoria 
    Por: Nicolas Reyes
    09/10/2019    
    */
    SELECT COUNT(PROP.A) INTO total FROM (SELECT P.ID_PROPOSAL A, COUNT(V.ID_PROPOSAL) B FROM PROPOSAL P
        LEFT JOIN VOTE V ON P.ID_PROPOSAL = V.ID_PROPOSAL
        JOIN PERSON PER ON P.ID_PERSON = PER.ID_PERSON 
        WHERE PER.ID_COMMUNITY = PCOM OR PCOM = 0
        GROUP BY P.ID_PROPOSAL
        HAVING COUNT(V.ID_PROPOSAL) >= PVOTES
        ORDER BY P.ID_PROPOSAL) PROP
    JOIN PROPOSAL PROPO ON A=PROPO.ID_PROPOSAL
    LEFT JOIN PROPOSALXCATEGORY PXC ON A = PXC.ID_PROPOSAL
    JOIN CATEGORY C ON PXC.ID_CATEGORY=C.ID_CATEGORY
    WHERE (C.ID_CATEGORY=PCATEGORY OR PCATEGORY = 0) AND (PROPO.POST_TIME>=PINICIALDATE AND PROPO.POST_TIME<=PINICIALDATE+PDAYSBETWEEN);  
 END;
 /

 /*Reporte de usuarios dos*/
insert into parameter values (2,'reportUsers',5);

CREATE OR REPLACE PROCEDURE REP_TOPNPROP_PR
(
    TopNComm_CURSOR out sys_refcursor
)
AS
BEGIN
    /*
    Descripcion: Retorna las n propuestas con mas votos 
    Por: Nicolas Reyes
    09/10/2019    
    */
    OPEN TopNComm_CURSOR FOR
    SELECT P.ID_PROPOSAL A, COUNT(V.ID_PROPOSAL) B FROM PROPOSAL P
    FULL JOIN VOTE V ON P.ID_PROPOSAL = V.ID_PROPOSAL
    WHERE ROWNUM <= (select value from parameter where id_parameter = 2)
    GROUP BY P.ID_PROPOSAL
    ORDER BY B DESC;
END;
 /*REPORTE USUARIO TRES*/
CREATE OR REPLACE PROCEDURE REP_OwnProp_PR
(
    NPer in Number default 1,
    PersonalProp_CURSOR out sys_refcursor
)
AS
BEGIN
    /*
    Descripcion: Retorna todas las propuestas del usuario 
    Por: Nicolas Reyes
    09/10/2019    
    */
    OPEN PersonalProp_CURSOR FOR
    SELECT * FROM PROPOSAL
    WHERE ID_PERSON = NPer;
END; 
 
