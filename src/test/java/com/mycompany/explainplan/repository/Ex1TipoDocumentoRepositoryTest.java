package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex1TipoDocumento;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ex1TipoDocumentoRepositoryTest {

    @Autowired
    Ex1TipoDocumentoRepository ex1TipoDocumentoRepository;

    @Test
    @Order(1)
    void save(){
        Ex1TipoDocumento ex1TipoDocumento = new Ex1TipoDocumento();
        ex1TipoDocumento.setSigla("CC");
        ex1TipoDocumento.setNombre("Cedula de ciudadania");
        ex1TipoDocumentoRepository.save(ex1TipoDocumento);

        assertTrue(true);
    }

}