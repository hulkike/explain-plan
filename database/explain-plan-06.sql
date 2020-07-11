CREATE TABLE ex6_detalle_factura (
  factura_id   int4 NOT NULL,
  producto_id  int4 NOT NULL,
  cantidad     int4 NOT NULL,
  precio_venta numeric(19, 0) NOT NULL);
CREATE TABLE ex6_factura (
  id             SERIAL NOT NULL,
  numero_factura int4 NOT NULL,
  anio           timestamp NOT NULL,
  total          numeric(19, 0) NOT NULL,
  PRIMARY KEY (id));
CREATE TABLE ex6_producto (
  id            SERIAL NOT NULL,
  codigo_barras varchar(255) NOT NULL,
  nombre        varchar(200) NOT NULL,
  descripcion   varchar(500) NOT NULL,
  imagen        varchar(1000) NOT NULL,
  stock         int4 NOT NULL,
  precio        numeric(19, 0) NOT NULL,
  PRIMARY KEY (id));
ALTER TABLE ex6_detalle_factura ADD CONSTRAINT FKex6_detall132798 FOREIGN KEY (producto_id) REFERENCES ex6_producto (id);
ALTER TABLE ex6_detalle_factura ADD CONSTRAINT FKex6_detall619046 FOREIGN KEY (factura_id) REFERENCES ex6_factura (id);


-- Relación muchos a mucho con indices
-- explain plan 5 query 1
-- enlace: https://explain.depesz.com/s/zca4
-- costo: 43.58
explain (analyse true, costs true, timing true, buffers true, verbose true)
select p.nombre, df.cantidad, df.precio_venta, (df.cantidad * df.precio_venta) as total
from public.ex5_factura f
         inner join public.ex5_detalle_factura df on f.id = df.factura_id
         inner join public.ex5_producto p on df.producto_id = p.id
where f.id = 1000
;

-- Relación muchos a mucho con indices
-- explain plan 5 query 2
-- enlace: https://explain.depesz.com/s/jp7B
-- costo: 43.58
explain (analyse true, costs true, timing true, buffers true, verbose true)
select p.nombre, df.cantidad, df.precio_venta, (df.cantidad * df.precio_venta) as total
from public.ex5_factura f,
     public.ex5_detalle_factura df,
     public.ex5_producto p
where f.id = df.factura_id
  and df.producto_id = p.id
  and f.id = 1000
;


-- Relación muchos a mucho con indices
-- explain plan 5 query 3
-- enlace: https://explain.depesz.com/s/PDKv
-- costo: 10.51
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex5_producto;

-- Relación muchos a mucho con indices
-- explain plan 5 query 4
-- enlace: https://explain.depesz.com/s/fxSj
-- costo: 19.51
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex5_factura;

-- Relación muchos a mucho con indices
-- explain plan 5 query 5
-- enlace:
-- costo:
explain (analyse true, costs true, timing true, buffers true, verbose true)
select count(*)
from ex5_detalle_factura;

-- Relación muchos a mucho con indices
-- explain plan 5 query 6
-- enlace: https://explain.depesz.com/s/CkH5
-- costo: 415.97
explain (analyse true, costs true, timing true, buffers true, verbose true)
select *
from ex5_detalle_factura df
order by df.factura_id desc;

-- Relación muchos a mucho con indices
-- explain plan 5 query 7
-- enlace: https://explain.depesz.com/s/dmEU
-- costo: 251.33
explain (analyse true, costs true, timing true, buffers true, verbose true)
select distinct(df.factura_id) from ex5_detalle_factura df order by df.factura_id asc;

-- Relación muchos a mucho con indices
-- explain plan 7 query
-- enlace:
-- costo: