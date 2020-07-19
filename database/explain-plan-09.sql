-- Relación uno a uno
-- explain plan 9 query 1
-- enlace: https://explain.depesz.com/s/jBs5
-- costo: 2287.98
explain (analyse true, costs true, timing true, buffers true, verbose true)
select u.login, e9c.tipo_documento, e9c.numero_documento, e9c.nombres, e9c.apellidos
from ex9_user u
         inner join ex9_cliente e9c on u.login = e9c.login
where u.login = 'user100000';

-- Relación uno a uno
-- explain plan 9 query 2
-- enlace: https://explain.depesz.com/s/aTHo
-- costo: 2287.98
explain (analyse true, costs true, timing true, buffers true, verbose true)
select u.login, e9c.tipo_documento, e9c.numero_documento, e9c.nombres, e9c.apellidos
from ex9_user u,
     ex9_cliente e9c
where u.login = e9c.login
  and u.login = 'user100000';

-- Relación uno a uno
-- explain plan 9 query 3
-- enlace: https://explain.depesz.com/s/IStv
-- costo: 1896.49
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex9_user;

-- Relación uno a uno
-- explain plan 9 query 4
-- enlace: https://explain.depesz.com/s/UJMg
-- costo: 2279.55
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex9_cliente;

-- Relación uno a uno
-- explain plan 9 query 5
-- enlace: https://explain.depesz.com/s/FKD5
-- costo: 12688.73
explain (analyse true, costs true, timing true, buffers true, verbose true)
select *
from ex9_user u order by u.password desc ;

-- Relación uno a uno
-- explain plan 9 query 6
-- enlace: https://explain.depesz.com/s/4vDD
-- costo: 14000.52
explain (analyse true, costs true, timing true, buffers true, verbose true)
select *
from ex9_cliente c order by c.nombres desc ;

-- Relación uno a uno
-- explain plan 9 query 7
-- enlace: https://explain.depesz.com/s/oo1W
-- costo: 10830.93
explain (analyse true, costs true, timing true, buffers true, verbose true)
select distinct(c.nombres)
from ex9_cliente c;

-- Relación uno a uno
-- explain plan 9 query 8
-- enlace: https://explain.depesz.com/s/iGqK
-- costo: 10544.82
explain (analyse true, costs true, timing true, buffers true, verbose true)
select distinct(c.estado)
from ex9_user c;

-- Relación uno a uno
-- explain plan 9 query 9
-- enlace: https://explain.depesz.com/s/atKa
-- costo: 0.02+2029.63
explain (analyse true, costs true, timing true, buffers true, verbose true)
select *
from ex9_cliente c
limit 1;

-- Relación uno a uno
-- explain plan 9 query
-- enlace:
-- costo:

