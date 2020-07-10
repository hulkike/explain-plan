package com.mycompany.explainplan.explain;

import com.mycompany.explainplan.domain.*;
import com.mycompany.explainplan.repository.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Ex4Explain {

    @Autowired
    Ex4ProductoRepository ex4ProductoRepository;
    @Autowired
    Ex4FacturaRepository ex4FacturaRepository;
    @Autowired
    Ex4DetalleFacturaRepository ex4DetalleFacturaRepository;

    @Test
    @Order(1)
    void llenarTabla() {

        for (int i = 1; i <= 10; i++) {
            Ex4Producto ex4Producto = new Ex4Producto();
            ex4Producto.setCodigoBarras("codigo" + i);
            ex4Producto.setNombre("nombre" + i);
            ex4Producto.setDescripcion("descripcion" + i);
            ex4Producto.setImagen("imagen" + i);
            ex4Producto.setStock(100);
            ex4Producto.setPrecio(new BigInteger("1500"));
            ex4ProductoRepository.save(ex4Producto);
        }

        List<Ex4Producto> listaProductos = ex4ProductoRepository.findAll();
        for (int i = 1; i <= 1000; i++) {
            Ex4FacturaPK llavePrimaria = new Ex4FacturaPK(i, new Date());
            Ex4Factura ex4Factura = new Ex4Factura();
            ex4Factura.setEx4FacturaPK(llavePrimaria);
            ex4Factura.setTotal(new BigDecimal("150000"));
            ex4FacturaRepository.save(ex4Factura);

            Ex4Factura facturaTemp = ex4FacturaRepository.findById(llavePrimaria).get();
            facturaTemp.setEx4DetalleFacturaSet(new HashSet<>());
            for (Ex4Producto ex4ProductoTemp : listaProductos
            ) {
                Ex4DetalleFactura ex4DetalleFactura = new Ex4DetalleFactura();
                ex4DetalleFactura.setEx4DetalleFacturaPK(new Ex4DetalleFacturaPK(
                        facturaTemp.getEx4FacturaPK().getNumeroFactura(),
                        facturaTemp.getEx4FacturaPK().getAnio(),
                        ex4ProductoTemp.getCodigoBarras()
                ));
                ex4DetalleFactura.setEx4Producto(ex4ProductoTemp);
                ex4DetalleFactura.setCantidad(10);
                ex4DetalleFactura.setPrecioVenta(new BigInteger("1500"));
                facturaTemp.getEx4DetalleFacturaSet().add(ex4DetalleFactura);
            }
            ex4FacturaRepository.save(facturaTemp);

        }
    }

}
