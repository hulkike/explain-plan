-- Relación muchos a mucho con indices
-- explain plan 7 query 1
-- enlace: https://explain.depesz.com/s/o7YZ
-- costo: 208.37
explain (analyse true, costs true, timing true, buffers true, verbose true)
select p.nombre, df.cantidad, df.precio_venta, (df.cantidad * df.precio_venta) as total
from public.ex7_factura f
         inner join public.ex7_detalle_factura df on f.id = df.factura_id
         inner join public.ex7_producto p on df.producto_id = p.id
where f.id = 1000
;

-- Relación muchos a mucho con indices
-- explain plan 7 query 2
-- enlace: https://explain.depesz.com/s/BQq1
-- costo: 208.37
explain (analyse true, costs true, timing true, buffers true, verbose true)
select p.nombre, df.cantidad, df.precio_venta, (df.cantidad * df.precio_venta) as total
from public.ex7_factura f,
     public.ex7_detalle_factura df,
     public.ex7_producto p
where f.id = df.factura_id
  and df.producto_id = p.id
  and f.id = 1000
;


-- Relación muchos a mucho con indices
-- explain plan 7 query 3
-- enlace: https://explain.depesz.com/s/hvnK
-- costo: 10.51
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex7_producto;

-- Relación muchos a mucho con indices
-- explain plan 7 query 4
-- enlace: https://explain.depesz.com/s/cPCe
-- costo: 19.51
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex7_factura;

-- Relación muchos a mucho con indices
-- explain plan 7 query 5
-- enlace: https://explain.depesz.com/s/krLB
-- costo: 189.01
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex7_detalle_factura;

-- Relación muchos a mucho con indices
-- explain plan 7 query 6
-- enlace: https://explain.depesz.com/s/lqox
-- costo: 853.39
explain (analyse true, costs true, timing true, buffers true, verbose true)
select *
from ex7_detalle_factura df
order by df.factura_id desc;

-- Relación muchos a mucho con indices
-- explain plan 7 query 7
-- enlace: https://explain.depesz.com/s/oU68
-- costo: 251.33
explain (analyse true, costs true, timing true, buffers true, verbose true)
select distinct(df.factura_id) from ex7_detalle_factura df order by df.factura_id asc;

-- Relación muchos a mucho con indices
-- explain plan 7 query
-- enlace:
-- costo: