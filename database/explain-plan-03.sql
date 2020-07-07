-- PRIMER DISEÑO RELACIÓN UNO A MUCHOS

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS CON INDICES UNICOS
-- explain plan 3 query 1
-- enlace: https://explain.depesz.com/s/qADi
-- costo: 24.62
explain (analyse true, costs true, timing true, buffers true, verbose true)
select td.nombre, c.numero_documento, c.nombres, c.apellidos
from ex3_tipo_documento td
         inner join ex3_cliente c on td.id = c.id_tipo_documento
where td.sigla = 'CC'
  and c.numero_documento = 'doc100';
-- conclusión: este es diseño mas rápido de los tres pero no el menos costoso

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS CON INDICES UNICOS
-- explain plan 3 query 2
-- enlace: https://explain.depesz.com/s/BYk6
-- costo: 28.46 de 100000 registros
explain (analyse true, costs true, timing true, buffers true, verbose true)
select td.nombre, c.numero_documento, c.nombres, c.apellidos
from ex3_tipo_documento td
         inner join ex3_cliente c on td.id = c.id_tipo_documento
where td.nombre = 'Cedula de ciudadania'
  and c.numero_documento = 'doc100';

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS CON INDICES UNICOS
-- explain plan 3 query 3
-- enlace: https://explain.depesz.com/s/T4ns
-- costo: 12.01
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex3_tipo_documento;

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS CON INDICES UNICOS
-- explain plan 3 query 4
-- enlace: https://explain.depesz.com/s/6RZf
-- costo: 2175.01
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex3_cliente;

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS CON INDICES UNICOS
-- explain plan 3 query 5
-- enlace: https://explain.depesz.com/s/glZ6
-- costo: 13216.82
explain (analyse true, costs true, timing true, buffers true, verbose true)
select *
from ex3_cliente c
order by c.numero_documento desc;

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS CON INDICES UNICOS
-- explain plan 3 query 6
-- enlace: https://explain.depesz.com/s/VciS
-- costo: 10729.82
explain (analyse true, costs true, timing true, buffers true, verbose true)
select distinct(c.nombres)
from ex3_cliente c;

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS CON INDICES UNICOS
-- explain plan 3 query 7
-- enlace: https://explain.depesz.com/s/dM3l
-- costo: 0.02
explain (analyse true, costs true, timing true, buffers true, verbose true)
select *
from ex3_cliente c
limit 1;

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS CON INDICES UNICOS
-- explain plan 3 query 8
-- enlace: https://explain.depesz.com/s/ySdZ
-- costo: 24.62
explain (analyse true, costs true, timing true, buffers true, verbose true)
select td.nombre, c.numero_documento, c.nombres, c.apellidos
from ex3_tipo_documento td,
     ex3_cliente c
where td.id = c.id_tipo_documento
  and td.sigla = 'CC'
  and c.numero_documento = 'doc100';

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS CON INDICES UNICOS
-- explain plan 3 query 9
-- enlace: https://explain.depesz.com/s/IVKP
-- costo: 28.46
explain (analyse true, costs true, timing true, buffers true, verbose true)
select td.nombre, c.numero_documento, c.nombres, c.apellidos
from ex3_tipo_documento td,
     ex3_cliente c
where td.id = c.id_tipo_documento
  and td.nombre = 'Cedula de ciudadania'
  and c.numero_documento = 'doc100';

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS CON INDICES UNICOS
-- explain plan 3 query
-- enlace:
-- costo:

