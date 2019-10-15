COMMENT ON COLUMN CANTON.ID_CANTON IS ' commentario en la columna ID_CANT
ON de tipo NUMBER';

COMMENT ON COLUMN CANTON.NAME IS ' commentario en la columna NAME de tipo
 VARCHAR2';

COMMENT ON COLUMN CANTON.ID_PROVINCE IS ' commentario en la columna ID_PR
OVINCE de tipo NUMBER';

COMMENT ON COLUMN CATEGORY.ID_CATEGORY IS ' commentario en la columna ID_
CATEGORY de tipo NUMBER';

COMMENT ON COLUMN CATEGORY.NAME IS ' commentario en la columna NAME de ti
po VARCHAR2';

COMMENT ON COLUMN COMMENTARY.ID_COMMENT IS ' commentario en la columna ID
_COMMENT de tipo NUMBER';

COMMENT ON COLUMN COMMENTARY.CONTENT IS ' commentario en la columna CONTE
NT de tipo VARCHAR2';

COMMENT ON COLUMN COMMENTARY.POST_TIME IS ' commentario en la columna POS                           
T_TIME de tipo DATE';

COMMENT ON COLUMN COMMENTARY.ID_PROPOSAL IS ' commentario en la columna I
D_PROPOSAL de tipo NUMBER';

COMMENT ON COLUMN COMMENTARY.ID_PERSON IS ' commentario en la columna ID_
PERSON de tipo NUMBER';

COMMENT ON COLUMN COMMUNITY.ID_COMMUNITY IS ' commentario en la columna I
D_COMMUNITY de tipo NUMBER';


 
                           
COMMENT ON COLUMN COMMUNITY.NAME IS ' commentario en la columna NAME de t
ipo VARCHAR2';

COMMENT ON COLUMN COMMUNITY.ID_DISTRICT IS ' commentario en la columna ID
_DISTRICT de tipo NUMBER';

COMMENT ON COLUMN COUNTRY.ID_COUNTRY IS ' commentario en la columna ID_CO
UNTRY de tipo NUMBER';

COMMENT ON COLUMN COUNTRY.NAME IS ' commentario en la columna NAME de tip
o VARCHAR2';

 
                           

COMMENT ON COLUMN DAILY_LOG.ID_PROPOSAL IS ' commentario en la columna ID
_PROPOSAL de tipo NUMBER';

COMMENT ON COLUMN DAILY_LOG.ID_PERSON IS ' commentario en la columna ID_P
ERSON de tipo NUMBER';

COMMENT ON COLUMN DAILY_LOG.ID_COMMUNITY IS ' commentario en la columna I
D_COMMUNITY de tipo NUMBER';

COMMENT ON COLUMN DISTRICT.ID_DISTRICT IS ' commentario en la columna ID_                           
DISTRICT de tipo NUMBER';

COMMENT ON COLUMN DISTRICT.NAME IS ' commentario en la columna NAME de ti
po VARCHAR2';

COMMENT ON COLUMN DISTRICT.ID_CANTON IS ' commentario en la columna ID_CA
NTON de tipo NUMBER';

COMMENT ON COLUMN EMAIL.ADDRESS IS ' commentario en la columna ADDRESS de
 tipo VARCHAR2';


 
                           
COMMENT ON COLUMN EMAIL.ID_PERSON IS ' commentario en la columna ID_PERSO
N de tipo NUMBER';

COMMENT ON COLUMN LOG_IN.USERNAME IS ' commentario en la columna USERNAME
 de tipo VARCHAR2';

COMMENT ON COLUMN LOG_IN.PASSWORD IS ' commentario en la columna PASSWORD
 de tipo VARCHAR2';

COMMENT ON COLUMN LOG_IN.ID_USER_TYPE IS ' commentario en la columna ID_U
SER_TYPE de tipo NUMBER';

 
                           

COMMENT ON COLUMN PARAMETER.ID_PARAMETER IS ' commentario en la columna I
D_PARAMETER de tipo NUMBER';

COMMENT ON COLUMN PARAMETER.NAME IS ' commentario en la columna NAME de t
ipo VARCHAR2';

COMMENT ON COLUMN PARAMETER.VALUE IS ' commentario en la columna VALUE de
 tipo NUMBER';

COMMENT ON COLUMN PASSWORD_CHANGES.ID_PASSWORD_CHANGES IS ' commentario e                           
n la columna ID_PASSWORD_CHANGES de tipo NUMBER';

COMMENT ON COLUMN PASSWORD_CHANGES.ID_LOG_IN IS ' commentario en la colum
na ID_LOG_IN de tipo NUMBER';

COMMENT ON COLUMN PASSWORD_CHANGES.PREVIOUS_PASSWORD IS ' commentario en
la columna PREVIOUS_PASSWORD de tipo VARCHAR2';

COMMENT ON COLUMN PASSWORD_CHANGES.CURRENT_PASSWORD IS ' commentario en l
a columna CURRENT_PASSWORD de tipo VARCHAR2';


 
                           
COMMENT ON COLUMN PASSWORD_CHANGES.CHANGE_DATE IS ' commentario en la col
umna CHANGE_DATE de tipo DATE';

COMMENT ON COLUMN PASSWORD_CHANGES.CREATION_DATE IS ' commentario en la c
olumna CREATION_DATE de tipo DATE';

COMMENT ON COLUMN PASSWORD_CHANGES.USER_CREATION IS ' commentario en la c
olumna USER_CREATION de tipo VARCHAR2';

COMMENT ON COLUMN PASSWORD_CHANGES.LAST_MODIFIED_DATE IS ' commentario en
 la columna LAST_MODIFIED_DATE de tipo DATE';

 
                           

COMMENT ON COLUMN PASSWORD_CHANGES.LAST_MODIFIED_USER IS ' commentario en
 la columna LAST_MODIFIED_USER de tipo VARCHAR2';

COMMENT ON COLUMN PASSWORD_LOG.ID_LOG IS ' commentario en la columna ID_L
OG de tipo NUMBER';

COMMENT ON COLUMN PASSWORD_LOG.LOG_TIME IS ' commentario en la columna LO
G_TIME de tipo DATE';

COMMENT ON COLUMN PASSWORD_LOG.ID_LOG_IN IS ' commentario en la columna I                         
D_LOG_IN de tipo VARCHAR2';

COMMENT ON COLUMN PERSON.ID_PERSON IS ' commentario en la columna ID_PERS
ON de tipo NUMBER';

COMMENT ON COLUMN PERSON.NAME IS ' commentario en la columna NAME de tipo
 VARCHAR2';

COMMENT ON COLUMN PERSON.FIRST_LASTNAME IS ' commentario en la columna FI
RST_LASTNAME de tipo VARCHAR2';


 
                           
COMMENT ON COLUMN PERSON.SECOND_LASTNAME IS ' commentario en la columna S
ECOND_LASTNAME de tipo VARCHAR2';

COMMENT ON COLUMN PERSON.BIRTHDATE IS ' commentario en la columna BIRTHDA
TE de tipo DATE';

COMMENT ON COLUMN PERSON.ID_COMMUNITY IS ' commentario en la columna ID_C
OMMUNITY de tipo NUMBER';

COMMENT ON COLUMN PERSON.ID_LOG_IN IS ' commentario en la columna ID_LOG_
IN de tipo VARCHAR2';

 
                           

COMMENT ON COLUMN PERSONXCATEGORY.ID_PERSON IS ' commentario en la column
a ID_PERSON de tipo NUMBER';

COMMENT ON COLUMN PERSONXCATEGORY.ID_CATEGORY IS ' commentario en la colu
mna ID_CATEGORY de tipo NUMBER';

COMMENT ON COLUMN PERSONXCOUNTRY.ID_PERSON IS ' commentario en la columna
 ID_PERSON de tipo NUMBER';

COMMENT ON COLUMN PERSONXCOUNTRY.ID_COUNTRY IS ' commentario en la column
a ID_COUNTRY de tipo NUMBER';

COMMENT ON COLUMN PERSON_PHOTO.ID_PERSON_PHOTO IS ' commentario en la col
umna ID_PERSON_PHOTO de tipo NUMBER';

COMMENT ON COLUMN PERSON_PHOTO.CONTENT IS ' commentario en la columna CON
TENT de tipo VARCHAR2';

COMMENT ON COLUMN PERSON_PHOTO.ID_PERSON IS ' commentario en la columna I
D_PERSON de tipo NUMBER';


 
                           
COMMENT ON COLUMN PHONE.TELEPHONE IS ' commentario en la columna TELEPHON
E de tipo VARCHAR2';

COMMENT ON COLUMN PHONE.ID_PERSON IS ' commentario en la columna ID_PERSO
N de tipo NUMBER';

COMMENT ON COLUMN PROPOSAL.ID_PROPOSAL IS ' commentario en la columna ID_
PROPOSAL de tipo NUMBER';

COMMENT ON COLUMN PROPOSAL.TITLE IS ' commentario en la columna TITLE de
tipo VARCHAR2';

 
                           

COMMENT ON COLUMN PROPOSAL.BUDGET IS ' commentario en la columna BUDGET d
e tipo NUMBER';

COMMENT ON COLUMN PROPOSAL.SUMMARY IS ' commentario en la columna SUMMARY
 de tipo VARCHAR2';

COMMENT ON COLUMN PROPOSAL.POST_TIME IS ' commentario en la columna POST_
TIME de tipo DATE';

COMMENT ON COLUMN PROPOSAL.ID_PERSON IS ' commentario en la columna ID_PE       
RSON de tipo NUMBER';

COMMENT ON COLUMN PROPOSALXCATEGORY.ID_PROPOSAL IS ' commentario en la co
lumna ID_PROPOSAL de tipo NUMBER';

COMMENT ON COLUMN PROPOSALXCATEGORY.ID_CATEGORY IS ' commentario en la co
lumna ID_CATEGORY de tipo NUMBER';

COMMENT ON COLUMN PROPOSAL_PHOTO.ID_PROPOSAL_PHOTO IS ' commentario en la
 columna ID_PROPOSAL_PHOTO de tipo NUMBER';


 
                           
COMMENT ON COLUMN PROPOSAL_PHOTO.CONTENT IS ' commentario en la columna C
ONTENT de tipo VARCHAR2';

COMMENT ON COLUMN PROPOSAL_PHOTO.ID_PROPOSAL IS ' commentario en la colum
na ID_PROPOSAL de tipo NUMBER';

COMMENT ON COLUMN PROVINCE.ID_PROVINCE IS ' commentario en la columna ID_
PROVINCE de tipo NUMBER';

COMMENT ON COLUMN PROVINCE.NAME IS ' commentario en la columna NAME de ti
po VARCHAR2';

 
                           

COMMENT ON COLUMN PROVINCE.ID_COUNTRY IS ' commentario en la columna ID_C
OUNTRY de tipo NUMBER';

COMMENT ON COLUMN USER_TYPE.ID_USER_TYPE IS ' commentario en la columna I
D_USER_TYPE de tipo NUMBER';

COMMENT ON COLUMN USER_TYPE.NAME IS ' commentario en la columna NAME de t
ipo VARCHAR2';

COMMENT ON COLUMN VOTE.ID_VOTE IS ' commentario en la columna ID_VOTE de        
tipo NUMBER';

COMMENT ON COLUMN VOTE.EMOTE IS ' commentario en la columna EMOTE de tipo
 NUMBER';

COMMENT ON COLUMN VOTE.ID_PROPOSAL IS ' commentario en la columna ID_PROP
OSAL de tipo NUMBER';

COMMENT ON COLUMN VOTE.ID_PERSON IS ' commentario en la columna ID_PERSON
 de tipo NUMBER';

  SELECT 'COMMENT ON TABLE '||TABLE_NAME||' IS  ' COMMENTARIO DE LA TABLA '||TABLE_NAME||'  ';' FROM CAT WHERE TABLE_TYPE = 'TABLE';

  
COMMENT ON TABLE VOTE IS  ' COMMENTARIO DE LA TABLA VOTE  ';
COMMENT ON TABLE USER_TYPE IS  ' COMMENTARIO DE LA TABLA USER_TYPE ;'

COMMENT ON TABLE PROVINCE IS  ' COMMENTARIO DE LA TABLA PROVINCE  ';
COMMENT ON TABLE PROPOSAL_PHOTO IS  ' COMMENTARIO DE LA TABLA PROPOSAL_PHO
TO  ';

COMMENT ON TABLE PROPOSALXCATEGORY IS  ' COMMENTARIO DE LA TABLA PROPOSALX
CATEGORY  ';


 
COMMENT ON TABLE PROPOSAL IS  ' COMMENTARIO DE LA TABLA PROPOSAL  ';
COMMENT ON TABLE PHONE IS  ' COMMENTARIO DE LA TABLA PHONE  ';
COMMENT ON TABLE PERSON_PHOTO IS  ' COMMENTARIO DE LA TABLA PERSON_PHOTO;'

COMMENT ON TABLE PERSONXCOUNTRY IS  ' COMMENTARIO DE LA TABLA PERSONXCOUNT
RY  ';

COMMENT ON TABLE PERSONXCATEGORY IS  ' COMMENTARIO DE LA TABLA PERSONXCATE
GORY  ';

COMMENT ON TABLE PERSON IS  ' COMMENTARIO DE LA TABLA PERSON  ';
COMMENT ON TABLE PASSWORD_LOG IS  ' COMMENTARIO DE LA TABLA PASSWORD_LOG ';

COMMENT ON TABLE PASSWORD_CHANGES IS  ' COMMENTARIO DE LA TABLA PASSWORD_C
HANGES  ';

COMMENT ON TABLE PARAMETER IS  ' COMMENTARIO DE LA TABLA PARAMETER ';

COMMENT ON TABLE LOG_IN IS  ' COMMENTARIO DE LA TABLA LOG_IN  ';

 
COMMENT ON TABLE EMAIL IS  ' COMMENTARIO DE LA TABLA EMAIL  ';
COMMENT ON TABLE DISTRICT IS  ' COMMENTARIO DE LA TABLA DISTRICT  ';
COMMENT ON TABLE DAILY_LOG IS  ' COMMENTARIO DE LA TABLA DAILY_LOG';

COMMENT ON TABLE COUNTRY IS  ' COMMENTARIO DE LA TABLA COUNTRY  ';
COMMENT ON TABLE COMMUNITY IS  ' COMMENTARIO DE LA TABLA COMMUNITY ';

COMMENT ON TABLE COMMENTARY IS  ' COMMENTARIO DE LA TABLA COMMENTARY ';

 

COMMENT ON TABLE CATEGORY IS  ' COMMENTARIO DE LA TABLA CATEGORY  ';
COMMENT ON TABLE CANTON IS  ' COMMENTARIO DE LA TABLA CANTON  ';