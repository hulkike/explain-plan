package com.mycompany.explainplan.explain;

import com.mycompany.explainplan.domain.*;
import com.mycompany.explainplan.repository.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Ex8Explain {
    @Autowired
    Ex8ProductoRepository ex8ProductoRepository;
    @Autowired
    Ex8FacturaRepository ex8FacturaRepository;
    @Autowired
    Ex8DetalleFacturaRepository ex8DetalleFacturaRepository;

    @Test
    @Order(1)
    void llenarTabla(){

        for (int i = 1; i <=10 ; i++) {
            Ex8Producto ex8Producto = new Ex8Producto();
            ex8Producto.setId(i);
            ex8Producto.setCodigoBarras("codigo"+i);
            ex8Producto.setNombre("nombre"+i);
            ex8Producto.setDescripcion("descripcion"+i);
            ex8Producto.setImagen("imagen"+i);
            ex8Producto.setStock(100);
            ex8Producto.setPrecio(new BigInteger("1500"));
            ex8ProductoRepository.save(ex8Producto);
        }

        List<Ex8Producto> listaProductos = ex8ProductoRepository.findAll();
        int cont=1;
        for (int i = 1; i <= 1000 ; i++) {
            Ex8Factura ex8Factura = new Ex8Factura();
            ex8Factura.setId(i);
            ex8Factura.setNumeroFactura(i);
            ex8Factura.setAnio(new Timestamp(1594081318));
            ex8Factura.setTotal(new BigInteger("1500000"));
            ex8FacturaRepository.save(ex8Factura);

            ex8Factura.setEx8DetalleFacturaSet(new HashSet<>());
            for (Ex8Producto ex8ProductoTemp : listaProductos
            ) {
                Ex8DetalleFactura ex8DetalleFactura = new Ex8DetalleFactura();
                ex8DetalleFactura.setFacturaId(ex8Factura);
                ex8DetalleFactura.setId(cont);
                ex8DetalleFactura.setProductoId(ex8ProductoTemp);
                ex8DetalleFactura.setCantidad(10);
                ex8DetalleFactura.setPrecioVenta(new BigInteger("1500"));
                ex8Factura.getEx8DetalleFacturaSet().add(ex8DetalleFactura);
                cont++;
                ex8DetalleFacturaRepository.save(ex8DetalleFactura);
            }

            assertTrue(true);
        }
    }
}
