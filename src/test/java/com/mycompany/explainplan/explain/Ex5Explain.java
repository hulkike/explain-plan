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
public class Ex5Explain {

    @Autowired
    Ex5ProductoRepository ex5ProductoRepository;
    @Autowired
    Ex5FacturaRepository ex5FacturaRepository;
    @Autowired
    Ex5DetalleFacturaRepository ex5DetalleFacturaRepository;

    @Test
    @Order(1)
    void llenarTabla() {
        for (int i = 1; i <=10 ; i++) {
            Ex5Producto ex5Producto = new Ex5Producto();
            ex5Producto.setId(i);
            ex5Producto.setCodigoBarras("codigo"+i);
            ex5Producto.setNombre("nombre"+i);
            ex5Producto.setDescripcion("descripcion"+i);
            ex5Producto.setImagen("imagen"+i);
            ex5Producto.setStock(100);
            ex5Producto.setPrecio(new BigInteger("1500"));
            ex5ProductoRepository.save(ex5Producto);
        }

        List<Ex5Producto> listaProductos = ex5ProductoRepository.findAll();
        int cont=1;
        for (int i = 1; i <= 1000 ; i++) {
            Ex5Factura ex5Factura = new Ex5Factura();
            ex5Factura.setId(i);
            ex5Factura.setNumeroFactura(i);
            ex5Factura.setAnio(new Timestamp(1594081318));
            ex5Factura.setTotal(new BigInteger("150000"));
            ex5FacturaRepository.save(ex5Factura);

            ex5Factura.setEx5DetalleFacturaSet(new HashSet<>());
            for (Ex5Producto ex5ProductoTemp : listaProductos
            ) {
                Ex5DetalleFactura ex5DetalleFactura = new Ex5DetalleFactura();
                ex5DetalleFactura.setEx5DetalleFacturaPK(new Ex5DetalleFacturaPK(ex5Factura.getId(), ex5ProductoTemp.getId()));
                ex5DetalleFactura.setCantidad(10);
                ex5DetalleFactura.setPrecioVenta(new BigInteger("1500"));
                cont++;
                ex5DetalleFacturaRepository.save(ex5DetalleFactura);
            }

            assertTrue(true);
        }
    }
}
