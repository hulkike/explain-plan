select *
from ex1_tipo_documento td
         inner join ex1_cliente c on td.sigla = c.sigla
where td.sigla= 'CC'
  and c.numero_documento = '234587567'
;

select *
from ex2_cliente c
         inner join ex2_tipo_documento td on c.id_tipo_documento = td.id
where td.sigla = ''
and c.numero_documento = '';

select *
from ex3_tipo_documento td inner join ex3_cliente c on td.id = c.id_tipo_documento
where td.sigla = ''
and c.numero_documento = '';



