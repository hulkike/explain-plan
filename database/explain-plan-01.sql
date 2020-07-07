-- PRIMER DISEÑO RELACIÓN UNO A MUCHOS

-- DISEÑO UNO A MUCHOS IDENTIFICABLE CON LLAVES NATURALES
-- explain plan 1 query 1
-- enlace: https://explain.depesz.com/s/Tn2x
--costo: 16.61 de 100000 registros
explain (analyse true, costs true, timing true, buffers true, verbose true)
select td.nombre, c.numero_documento, c.nombres, c.apellidos
from ex1_tipo_documento td
         inner join ex1_cliente c on td.sigla = c.sigla
where td.sigla = 'CC'
  and c.numero_documento = 'doc100'
;
-- conclusión: este es diseño menos costoso pero no el mas rápido

-- DISEÑO UNO A MUCHOS IDENTIFICABLE CON LLAVES NATURALES WHERE A CAMPO NO INDEXADO
-- explain plan 1 query 2
-- enlace: https://explain.depesz.com/s/yXpe
--costo: 28.46 de 100000 registros
explain (analyse true, costs true, timing true, buffers true, verbose true)
select td.nombre, c.numero_documento, c.nombres, c.apellidos
from ex1_tipo_documento td
         inner join ex1_cliente c on td.sigla = c.sigla
where td.nombre = 'Cedula de ciudadania'
  and c.numero_documento = 'doc100'
;

-- DISEÑO UNO A MUCHOS IDENTIFICABLE CON LLAVES NATURALES WHERE A CAMPO NO INDEXADO
-- explain plan 1 query 3
-- enlace: https://explain.depesz.com/s/qMiO
--costo: 12.01 de 1 registros
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex1_tipo_documento;


-- DISEÑO UNO A MUCHOS IDENTIFICABLE CON LLAVES NATURALES WHERE A CAMPO NO INDEXADO
-- explain plan 1 query 4
-- enlace: https://explain.depesz.com/s/A9AlH
--costo: 2084 de 100000 registros
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex1_cliente;

-- DISEÑO UNO A MUCHOS IDENTIFICABLE CON LLAVES NATURALES WHERE A CAMPO NO INDEXADO
-- explain plan 1 query 5
-- enlace: https://explain.depesz.com/s/XTBB
--costo: 12875.72 de 100000 registros
explain (analyse true, costs true, timing true, buffers true, verbose true)
select *
from ex1_cliente c
order by c.numero_documento desc;

-- DISEÑO UNO A MUCHOS IDENTIFICABLE CON LLAVES NATURALES WHERE A CAMPO NO INDEXADO
-- explain plan 1 query 6
-- enlace: https://explain.depesz.com/s/CQEH
--costo: 5525.36 de 100000 registros
explain (analyse true, costs true, timing true, buffers true, verbose true)
select distinct(c.nombres)
from ex1_cliente c;

-- DISEÑO UNO A MUCHOS IDENTIFICABLE CON LLAVES NATURALES WHERE A CAMPO NO INDEXADO
-- explain plan 1 query 7
-- enlace:
--costo: 0.02 de 100000 registros
explain (analyse true, costs true, timing true, buffers true, verbose true)
select *
from ex1_cliente c
limit 1;

-- DISEÑO UNO A MUCHOS IDENTIFICABLE CON LLAVES NATURALES JOIN IMPLICITOS
-- explain plan 1 query 8
-- enlace: https://explain.depesz.com/s/OECy
--costo: 16.61 de 100000 registros
explain (analyse true, costs true, timing true, buffers true, verbose true)
select td.nombre, c.numero_documento, c.nombres, c.apellidos
from ex1_tipo_documento td,
     ex1_cliente c
where td.sigla = c.sigla
  and td.sigla = 'CC'
  and c.numero_documento = 'doc100'
;
-- conclusión: este es diseño menos costoso pero no el mas rápido

-- DISEÑO UNO A MUCHOS IDENTIFICABLE CON LLAVES NATURALES WHERE A CAMPO NO INDEXADO
-- explain plan 1 query 9
-- enlace: https://explain.depesz.com/s/3Lag
--costo: 28.46 de 100000 registros
explain (analyse true, costs true, timing true, buffers true, verbose true)
select td.nombre, c.numero_documento, c.nombres, c.apellidos
from ex1_tipo_documento td, ex1_cliente c
where td.sigla = c.sigla
 and td.nombre = 'Cedula de ciudadania'
  and c.numero_documento = 'doc100'
;

