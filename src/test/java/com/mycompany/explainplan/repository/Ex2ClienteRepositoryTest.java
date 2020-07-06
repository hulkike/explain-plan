package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex2Cliente;
import com.mycompany.explainplan.domain.Ex2TipoDocumento;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ex2ClienteRepositoryTest {

    @Autowired
    Ex2ClienteRepository ex2ClienteRepository;

    @Test
    @Order(1)
    void save(){

        Ex2TipoDocumento ex2TipoDocumento = new Ex2TipoDocumento();
        ex2TipoDocumento.setId(10);
        ex2TipoDocumento.setSigla("NI");
        ex2TipoDocumento.setNombre("Numero de Identificación Tributaria");

        Ex2Cliente ex2Cliente = new Ex2Cliente();
        ex2Cliente.setId(10);
        ex2Cliente.setNombres("Adan");
        ex2Cliente.setApellidos("morales");
        ex2Cliente.setNumeroDocumento("23452345234");
        ex2Cliente.setEx2TipoDocumentoByIdTipoDocumento(ex2TipoDocumento);

        ex2ClienteRepository.save(ex2Cliente);

        assertEquals(ex2ClienteRepository.findById(10).get(),ex2Cliente);

    }

}