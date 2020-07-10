-- Relación muchos a mucho con indices
-- explain plan 4 query 1
-- enlace: https://explain.depesz.com/s/M33f
-- costo: 20.55
explain (analyse true, costs true, timing true, buffers true, verbose true)
select p.nombre, df.cantidad, df.precio_venta, (df.cantidad * df.precio_venta) as total
from public.ex4_factura f
         inner join public.ex4_detalle_factura df on f.numero_factura = df.numero_factura and f.anio = df.anio
         inner join public.ex4_producto p on df.codigo_barras = p.codigo_barras
where f.numero_factura = 1000
;

-- Relación muchos a mucho con indices
-- explain plan 4 query 2
-- enlace: https://explain.depesz.com/s/3e9S
-- costo: 20.55
explain (analyse true, costs true, timing true, buffers true, verbose true)
select p.nombre, df.cantidad, df.precio_venta, (df.cantidad * df.precio_venta) as total
from public.ex4_factura f,
     public.ex4_detalle_factura df,
     public.ex4_producto p
where f.numero_factura = df.numero_factura and f.anio = df.anio
  and df.codigo_barras = p.codigo_barras
  and f.numero_factura = 1000
;


-- Relación muchos a mucho con indices
-- explain plan 4 query 3
-- enlace: https://explain.depesz.com/s/Gb25
-- costo: 20.51
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex4_producto;

-- Relación muchos a mucho con indices
-- explain plan 4 query 4
-- enlace:
-- costo: 19.51
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex4_factura;

-- Relación muchos a mucho con indices
-- explain plan 4 query 5
-- enlace: https://explain.depesz.com/s/vbKK
-- costo: 209.01
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex4_detalle_factura;

-- Relación muchos a mucho con indices
-- explain plan 4 query 6
-- enlace: https://explain.depesz.com/s/Jz9V
-- costo: 554.22
explain (analyse true, costs true, timing true, buffers true, verbose true)
select *
from ex4_detalle_factura df
order by df.numero_factura desc;

-- Relación muchos a mucho con indices
-- explain plan 4 query 7
-- enlace: https://explain.depesz.com/s/Rzw
-- costo: 271.33
explain (analyse true, costs true, timing true, buffers true, verbose true)
select distinct(df.numero_factura) from ex4_detalle_factura df order by df.numero_factura asc;

-- Relación muchos a mucho con indices
-- explain plan 7 query
-- enlace:
-- costo: