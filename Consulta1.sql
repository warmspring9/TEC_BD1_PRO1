SELECT p.name, concat(p.FIRST_LASTNAME,' ',p.SECOND_LASTNAME),p.id_person,a.username,a.b from
    (select DISTINCT USERNAME, (sysdate - pl.log_time) B from PASSWORD_log pl
    where (sysdate - pl.log_time) <= 10 ) a
    join PERSON p on a = p.USERNAME
    order by a.b;
--deberia funcionar :v falta consultas