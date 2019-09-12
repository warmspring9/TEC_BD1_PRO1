CREATE TABLESPACE PRO_DATA
    DATAFILE 'C:\app\chino\oradata\ORCL\prodata.dbf'
    SIZE 10M
    REUSE
    AUTOEXTEND ON
    NEXT 512K
    MAXSIZE 200M;

CREATE TABLESPACE PRO_IND
  DATAFILE 'C:\app\chino\oradata\ORCL\proind.dbf'
  SIZE 10M
  REUSE
  AUTOEXTEND ON
  NEXT 512K
  MAXSIZE 200M;

CREATE USER pro
    IDENTIFIED BY pro
    DEFAULT TABLESPACE PRO_DATA
    QUOTA 10M ON PRO_DATA
    TEMPORARY TABLESPACE TEMP
    QUOTA 5M ON SYSTEM;

CREATE ROLE PRO_M
    IDENTIFIED BY PRO_M;

GRANT CONNECT TO PRO;
GRANT CREATE SESSION TO PRO;
GRANT CREATE SEQUENCE TO PRO;
GRANT CREATE PUBLIC SYNONYM TO PRO;
GRANT CREATE TABLE TO PRO;

--alter session set "_ORACLE_SCRIPT"=true; 