-- PRIMER DISEÑO RELACIÓN UNO A MUCHOS

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS SIN INDICES ÚNICOS
-- explain plan 2 query 1
-- enlace: https://explain.depesz.com/s/MHZK
-- costo: 2187
explain (analyse true, costs true, timing true, buffers true, verbose true)
select td.nombre, c.numero_documento, c.nombres, c.apellidos
from ex2_cliente c
         inner join ex2_tipo_documento td on c.id_tipo_documento = td.id
where td.sigla = 'CC'
  and c.numero_documento = 'doc100';
-- conclusión este es diseño menos eficiente no se debería usar

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS SIN INDICES ÚNICOS WHERE A CAMPO NO INDEXADO
-- explain plan 2 query 2
-- enlace: https://explain.depesz.com/s/YjnR
-- costo: 2187
explain (analyse true, costs true, timing true, buffers true, verbose true)
select td.nombre, c.numero_documento, c.nombres, c.apellidos
from ex2_cliente c
         inner join ex2_tipo_documento td on c.id_tipo_documento = td.id
where td.nombre = 'Cedula de ciudadania'
  and c.numero_documento = 'doc100';

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS SIN INDICES ÚNICOS WHERE A CAMPO NO INDEXADO
-- explain plan 2 query 3
-- enlace: https://explain.depesz.com/s/LLfp
-- costo: 12.01
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex2_tipo_documento;

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS SIN INDICES ÚNICOS WHERE A CAMPO NO INDEXADO
-- explain plan 2 query 4
-- enlace: https://explain.depesz.com/s/J211
-- costo: 2175.06
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex2_cliente;

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS SIN INDICES ÚNICOS WHERE A CAMPO NO INDEXADO
-- explain plan 2 query 5
-- enlace: https://explain.depesz.com/s/bidU
-- costo: 13217.23
explain (analyse true, costs true, timing true, buffers true, verbose true)
select *
from ex2_cliente c
order by c.numero_documento desc;

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS SIN INDICES ÚNICOS WHERE A CAMPO NO INDEXADO
-- explain plan 2 query 6
-- enlace: https://explain.depesz.com/s/67aP
-- costo: 5616.59
explain (analyse true, costs true, timing true, buffers true, verbose true)
select distinct(c.nombres)
from ex2_cliente c;

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS SIN INDICES ÚNICOS
-- explain plan 2 query 7
-- enlace: https://explain.depesz.com/s/AuRT
-- costo: 0.02
explain (analyse true, costs true, timing true, buffers true, verbose true)
select *
from ex2_cliente c
limit 1;

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS SIN INDICES ÚNICOS
-- explain plan 2 query 8
-- enlace: https://explain.depesz.com/s/MFHH
-- costo: 2187.06
explain (analyse true, costs true, timing true, buffers true, verbose true)
select td.nombre, c.numero_documento, c.nombres, c.apellidos
from ex2_cliente c,
     ex2_tipo_documento td
where c.id_tipo_documento = td.id
  and td.sigla = 'CC'
  and c.numero_documento = 'doc100';
-- conclusión este es diseño menos eficiente no se debería usar

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS SIN INDICES ÚNICOS
-- explain plan 2 query 9
-- enlace: https://explain.depesz.com/s/ZnBe
-- costo: 2187.06
explain (analyse true, costs true, timing true, buffers true, verbose true)
select td.nombre, c.numero_documento, c.nombres, c.apellidos
from ex2_cliente c
         inner join ex2_tipo_documento td on c.id_tipo_documento = td.id
where td.nombre = 'Cedula de ciudadania'
  and c.numero_documento = 'doc100';

-- DISEÑO UNO A MUCHOS NO IDENTIFICABLE CON LLAVES SUBROGADAS CON INDICES UNICOS
-- explain plan 2 query
-- enlace:
-- costo: