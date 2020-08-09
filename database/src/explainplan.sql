CREATE TABLE ex1_cliente (
  sigla            varchar(20) NOT NULL, 
  numero_documento varchar(100) NOT NULL, 
  nombres          varchar(200) NOT NULL, 
  apellidos        varchar(200) NOT NULL, 
  PRIMARY KEY (sigla, 
  numero_documento));
CREATE TABLE ex1_tipo_documento (
  sigla  varchar(20) NOT NULL, 
  nombre varchar(200) NOT NULL, 
  PRIMARY KEY (sigla));
CREATE TABLE ex2_cliente (
  id                SERIAL NOT NULL, 
  id_tipo_documento int4 NOT NULL, 
  numero_documento  varchar(100) NOT NULL, 
  nombres           varchar(200) NOT NULL, 
  apellidos         varchar(200) NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE ex2_tipo_documento (
  id     SERIAL NOT NULL, 
  sigla  varchar(20) NOT NULL, 
  nombre varchar(200) NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE ex3_tipo_documento (
  id     SERIAL NOT NULL, 
  sigla  varchar(20) NOT NULL UNIQUE, 
  nombre varchar(200) NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE ex3_cliente (
  id                SERIAL NOT NULL, 
  id_tipo_documento int4 NOT NULL, 
  numero_documento  varchar(100) NOT NULL, 
  apellidos         varchar(200) NOT NULL, 
  nombres           varchar(200) NOT NULL, 
  PRIMARY KEY (id), 
  CONSTRAINT ux_ex3_clien 
    UNIQUE (id_tipo_documento, numero_documento));
CREATE TABLE ex4_factura (
  numero_factura int4 NOT NULL, 
  anio           timestamp NOT NULL, 
  total          numeric(17, 2) NOT NULL, 
  PRIMARY KEY (numero_factura, 
  anio));
CREATE TABLE ex4_producto (
  codigo_barras varchar(255) NOT NULL, 
  nombre        varchar(200) NOT NULL, 
  descripcion   varchar(500) NOT NULL, 
  imagen        varchar(1000) NOT NULL, 
  stock         int4 NOT NULL, 
  precio        numeric(19, 0) NOT NULL, 
  PRIMARY KEY (codigo_barras));
CREATE TABLE ex4_detalle_factura (
  numero_factura int4 NOT NULL, 
  anio           timestamp NOT NULL, 
  codigo_barras  varchar(255) NOT NULL, 
  cantidad       int4 NOT NULL, 
  precio_venta   numeric(19, 0) NOT NULL, 
  PRIMARY KEY (numero_factura, 
  anio, 
  codigo_barras));
CREATE TABLE ex5_factura (
  id             SERIAL NOT NULL, 
  numero_factura int4 NOT NULL, 
  anio           timestamp NOT NULL, 
  total          numeric(19, 0) NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE ex5_producto (
  id            SERIAL NOT NULL, 
  codigo_barras varchar(255) NOT NULL, 
  nombre        varchar(200) NOT NULL, 
  descripcion   varchar(500) NOT NULL, 
  imagen        varchar(1000) NOT NULL, 
  stock         int4 NOT NULL, 
  precio        numeric(19, 0) NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE ex5_detalle_factura (
  factura_id   int4 NOT NULL, 
  producto_id  int4 NOT NULL, 
  cantidad     int4 NOT NULL, 
  precio_venta numeric(19, 0) NOT NULL, 
  PRIMARY KEY (factura_id, 
  producto_id));
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
CREATE TABLE ex6_detalle_factura (
  factura_id   int4 NOT NULL, 
  producto_id  int4 NOT NULL, 
  cantidad     int4 NOT NULL, 
  precio_venta numeric(19, 0) NOT NULL);
CREATE TABLE ex7_factura (
  id             SERIAL NOT NULL, 
  numero_factura int4 NOT NULL, 
  anio           timestamp NOT NULL, 
  total          numeric(19, 0) NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE ex7_producto (
  id            SERIAL NOT NULL, 
  codigo_barras varchar(255) NOT NULL, 
  nombre        varchar(200) NOT NULL, 
  descripcion   varchar(500) NOT NULL, 
  imagen        varchar(1000) NOT NULL, 
  stock         int4 NOT NULL, 
  precio        numeric(19, 0) NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE ex7_detalle_factura (
  id           SERIAL NOT NULL, 
  factura_id   int4 NOT NULL, 
  producto_id  int4 NOT NULL, 
  cantidad     int4 NOT NULL, 
  precio_venta numeric(19, 0) NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE ex8_factura (
  id             SERIAL NOT NULL, 
  numero_factura int4 NOT NULL, 
  anio           timestamp NOT NULL, 
  total          numeric(19, 0) NOT NULL, 
  PRIMARY KEY (id), 
  CONSTRAINT ux_factura 
    UNIQUE (numero_factura, anio));
CREATE TABLE ex8_producto (
  id            SERIAL NOT NULL, 
  codigo_barras varchar(255) NOT NULL, 
  nombre        varchar(200) NOT NULL, 
  descripcion   varchar(500) NOT NULL, 
  imagen        varchar(1000) NOT NULL, 
  stock         int4 NOT NULL, 
  precio        numeric(19, 0) NOT NULL, 
  PRIMARY KEY (id), 
  CONSTRAINT ux_producto 
    UNIQUE (codigo_barras));
CREATE TABLE ex8_detalle_factura (
  id           SERIAL NOT NULL, 
  factura_id   int4 NOT NULL, 
  producto_id  int4 NOT NULL, 
  cantidad     int4 NOT NULL, 
  precio_venta numeric(19, 0) NOT NULL, 
  PRIMARY KEY (id), 
  CONSTRAINT ux_deta_fact 
    UNIQUE (factura_id, producto_id));
CREATE TABLE ex9_user (
  login    varchar(20) NOT NULL, 
  password varchar(100) NOT NULL, 
  estado   varchar(20) NOT NULL, 
  PRIMARY KEY (login));
CREATE TABLE ex9_cliente (
  tipo_documento   varchar(10) NOT NULL, 
  numero_documento varchar(50) NOT NULL, 
  nombres          varchar(200) NOT NULL, 
  apellidos        varchar(200) NOT NULL, 
  login            varchar(20) NOT NULL, 
  PRIMARY KEY (tipo_documento, 
  numero_documento));
CREATE TABLE ex10_user (
  id       SERIAL NOT NULL, 
  login    varchar(20) NOT NULL, 
  password varchar(100) NOT NULL, 
  estado   varchar(20) NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE ex10_cliente (
  id               SERIAL NOT NULL, 
  tipo_documento   varchar(10) NOT NULL, 
  numero_documento varchar(50) NOT NULL, 
  nombres          varchar(200) NOT NULL, 
  apellidos        varchar(200) NOT NULL, 
  user_id          int4 NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE ex11_user (
  id       SERIAL NOT NULL, 
  login    varchar(20) NOT NULL UNIQUE, 
  password varchar(100) NOT NULL, 
  estado   varchar(20) NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE ex11_cliente (
  id               SERIAL NOT NULL, 
  tipo_documento   varchar(10) NOT NULL, 
  numero_documento varchar(50) NOT NULL, 
  nombres          varchar(200) NOT NULL, 
  apellidos        varchar(200) NOT NULL, 
  user_id          int4 NOT NULL UNIQUE, 
  PRIMARY KEY (id), 
  CONSTRAINT isx_cliente 
    UNIQUE (tipo_documento, numero_documento));
CREATE TABLE ex12_factura (
  id         SERIAL NOT NULL, 
  total      int4 NOT NULL, 
  estado     varchar(20) NOT NULL, 
  forma_pago int4 NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE ex12_pedido (
  id       int4 NOT NULL, 
  estado   varchar(20) NOT NULL, 
  vendedor varchar(100) NOT NULL, 
  PRIMARY KEY (id));
ALTER TABLE ex1_cliente ADD CONSTRAINT fk_ex1_tipo_docu_clien FOREIGN KEY (sigla) REFERENCES ex1_tipo_documento (sigla) ON UPDATE Cascade;
ALTER TABLE ex2_cliente ADD CONSTRAINT fk_ex2_tipo_docu_clie FOREIGN KEY (id_tipo_documento) REFERENCES ex2_tipo_documento (id);
ALTER TABLE ex3_cliente ADD CONSTRAINT fk_ex3_tipo_docu_clie FOREIGN KEY (id_tipo_documento) REFERENCES ex3_tipo_documento (id);
ALTER TABLE ex4_detalle_factura ADD CONSTRAINT fk_defa_fact FOREIGN KEY (numero_factura, anio) REFERENCES ex4_factura (numero_factura, anio);
ALTER TABLE ex4_detalle_factura ADD CONSTRAINT fk_prod_defa FOREIGN KEY (codigo_barras) REFERENCES ex4_producto (codigo_barras);
ALTER TABLE ex5_detalle_factura ADD CONSTRAINT fk_ex5_fact_deta FOREIGN KEY (factura_id) REFERENCES ex5_factura (id);
ALTER TABLE ex5_detalle_factura ADD CONSTRAINT fk_ex5_prod_deta FOREIGN KEY (producto_id) REFERENCES ex5_producto (id);
ALTER TABLE ex6_detalle_factura ADD CONSTRAINT fk_ex6_fact_deta FOREIGN KEY (factura_id) REFERENCES ex6_factura (id);
ALTER TABLE ex6_detalle_factura ADD CONSTRAINT fk_ex6_prod_deta FOREIGN KEY (producto_id) REFERENCES ex6_producto (id);
ALTER TABLE ex7_detalle_factura ADD CONSTRAINT fk_fact_defa FOREIGN KEY (factura_id) REFERENCES ex7_factura (id);
ALTER TABLE ex7_detalle_factura ADD CONSTRAINT fk_prod_defa2 FOREIGN KEY (producto_id) REFERENCES ex7_producto (id);
ALTER TABLE ex8_detalle_factura ADD CONSTRAINT fk_ex8_fact_deta FOREIGN KEY (factura_id) REFERENCES ex8_factura (id);
ALTER TABLE ex8_detalle_factura ADD CONSTRAINT fk_prod_deta FOREIGN KEY (producto_id) REFERENCES ex8_producto (id);
ALTER TABLE ex9_cliente ADD CONSTRAINT fk_ex9_user_clie FOREIGN KEY (login) REFERENCES ex9_user (login);
ALTER TABLE ex10_cliente ADD CONSTRAINT fk_ex10_user_clie FOREIGN KEY (user_id) REFERENCES ex10_user (id);
ALTER TABLE ex11_cliente ADD CONSTRAINT fk_ex11_user_clie FOREIGN KEY (user_id) REFERENCES ex11_user (id);
ALTER TABLE ex12_pedido ADD CONSTRAINT fk_ex12_fact_pedi FOREIGN KEY (id) REFERENCES ex12_factura (id);
