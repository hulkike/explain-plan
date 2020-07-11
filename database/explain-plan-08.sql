-- Relación muchos a mucho con indices
-- explain plan 8 query 1
-- enlace: https://explain.depesz.com/s/fsZ2
-- costo: 43.58
explain (analyse true, costs true, timing true, buffers true, verbose true)
select p.nombre, df.cantidad, df.precio_venta, (df.cantidad * df.precio_venta) as total
from public.ex8_factura f
         inner join public.ex8_detalle_factura df on f.id = df.factura_id
         inner join public.ex8_producto p on df.producto_id = p.id
where f.id = 1000
;

-- Relación muchos a mucho con indices
-- explain plan 8 query 2
-- enlace: https://explain.depesz.com/s/KYlh
-- costo: 43.58
explain (analyse true, costs true, timing true, buffers true, verbose true)
select p.nombre, df.cantidad, df.precio_venta, (df.cantidad * df.precio_venta) as total
from public.ex8_factura f,
     public.ex8_detalle_factura df,
     public.ex8_producto p
where f.id = df.factura_id
  and df.producto_id = p.id
  and f.id = 1000
;


-- Relación muchos a mucho con indices
-- explain plan 8 query 3
-- enlace: https://explain.depesz.com/s/94Yu
-- costo: 10.51
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex8_producto;

-- Relación muchos a mucho con indices
-- explain plan 8 query 4
-- enlace: https://explain.depesz.com/s/fX3q
-- costo: 19.51
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex8_factura;

-- Relación muchos a mucho con indices
-- explain plan 8 query 5
-- enlace: https://explain.depesz.com/s/fQPc
-- costo: 189.01
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex8_detalle_factura;

-- Relación muchos a mucho con indices
-- explain plan 8 query 6
-- enlace: https://explain.depesz.com/s/5Dk9
-- costo: 415.97
explain (analyse true, costs true, timing true, buffers true, verbose true)
select *
from ex8_detalle_factura df
order by df.factura_id desc;

-- Relación muchos a mucho con indices
-- explain plan 8 query 7
-- enlace: https://explain.depesz.com/s/lbs2
-- costo: 251.33
explain (analyse true, costs true, timing true, buffers true, verbose true)
select distinct(df.factura_id) from ex8_detalle_factura df order by df.factura_id asc;

-- Relación muchos a mucho con indices
-- explain 8 plan  query
-- enlace:
-- costo:

