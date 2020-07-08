package com.mycompany.explainplan.explain;

import com.mycompany.explainplan.domain.*;
import com.mycompany.explainplan.repository.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ex7Explain {
    @Autowired
    Ex7ProductoRepository ex7ProductoRepository;
    @Autowired
    Ex7FacturaRepository ex7FacturaRepository;
    @Autowired
    Ex7DetalleFacturaRepository ex7DetalleFacturaRepository;

    @Test
    @Order(1)
    void llenarTabla(){

        for (int i = 1; i <=10 ; i++) {
            Ex7Producto ex7Producto = new Ex7Producto();
            ex7Producto.setId(i);
            ex7Producto.setCodigoBarras("codigo"+i);
            ex7Producto.setNombre("nombre"+i);
            ex7Producto.setDescripcion("descripcion"+i);
            ex7Producto.setImagen("imagen"+i);
            ex7Producto.setStock(100);
            ex7Producto.setPrecio(15000);
            ex7ProductoRepository.save(ex7Producto);
        }

        List<Ex7Producto> listaProductos = ex7ProductoRepository.findAll();
        int cont=1;
        for (int i = 1; i <= 1000 ; i++) {
            Ex7Factura ex7Factura = new Ex7Factura();
            ex7Factura.setId(i);
            ex7Factura.setNumeroFactura(i);
            ex7Factura.setAnio(new Timestamp(1594081318));
            ex7Factura.setTotal(150000);
            ex7FacturaRepository.save(ex7Factura);

            ex7Factura.setEx7DetalleFacturasById(new ArrayList<>());
            for (Ex7Producto ex7FacturaTemp:listaProductos
            ) {
                Ex7DetalleFactura ex7DetalleFactura = new Ex7DetalleFactura();
                ex7DetalleFactura.setEx7FacturaByFacturaId(ex7Factura);
                ex7DetalleFactura.setId(cont);
                ex7DetalleFactura.setEx7ProductoByProductoId(ex7FacturaTemp);
                ex7DetalleFactura.setCantidad(10);
                ex7DetalleFactura.setPrecioVenta(1500);
                ex7Factura.getEx7DetalleFacturasById().add(ex7DetalleFactura);
                cont++;
                ex7DetalleFacturaRepository.save(ex7DetalleFactura);
            }

            assertTrue(true);

        }

    }
}
