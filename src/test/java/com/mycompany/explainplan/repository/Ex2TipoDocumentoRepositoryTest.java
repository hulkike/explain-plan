package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex2TipoDocumento;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ex2TipoDocumentoRepositoryTest {

    @Autowired
    Ex2TipoDocumentoRepository ex2TipoDocumentoRepository;

    @Test
    @Order(1)
    void save(){
        Ex2TipoDocumento ex2TipoDocumento = new Ex2TipoDocumento();
        ex2TipoDocumento.setId(10);
        ex2TipoDocumento.setSigla("NI");
        ex2TipoDocumento.setNombre("Numero de Identificación Tributaria");
        ex2TipoDocumentoRepository.save(ex2TipoDocumento);
        assertEquals(ex2TipoDocumentoRepository.findById(10).get(),ex2TipoDocumento);
    }

    @Test
    @Order(2)
    void findById(){
        Ex2TipoDocumento ex2TipoDocumento = ex2TipoDocumentoRepository.findById(10).get();
        assertEquals(ex2TipoDocumento.getSigla(),"NI");
    }

    @Test
    @Order(3)
    void findAll(){
        List<Ex2TipoDocumento> tipoDocumentoSet = (List<Ex2TipoDocumento>)ex2TipoDocumentoRepository.findAll();
        System.out.println(tipoDocumentoSet);
    }

    @Test
    @Order(4)
    void update(){
        Ex2TipoDocumento ex2TipoDocumento = ex2TipoDocumentoRepository.findById(10).get();
        ex2TipoDocumento.setSigla("NIT");
        ex2TipoDocumentoRepository.save(ex2TipoDocumento);
    }

    @Test
    @Order(5)
    void delete(){
        ex2TipoDocumentoRepository.deleteById(10);
        assertTrue(ex2TipoDocumentoRepository.findById(10).isEmpty());
    }

}