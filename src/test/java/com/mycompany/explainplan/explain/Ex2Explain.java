package com.mycompany.explainplan.explain;

import com.mycompany.explainplan.domain.Ex2Cliente;
import com.mycompany.explainplan.domain.Ex2TipoDocumento;
import com.mycompany.explainplan.repository.Ex2ClienteRepository;
import com.mycompany.explainplan.repository.Ex2TipoDocumentoRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ex2Explain {

    @Autowired
    Ex2ClienteRepository ex2ClienteRepository;
    @Autowired
    Ex2TipoDocumentoRepository ex2TipoDocumentoRepository;

    @Test
    @Order(1)
    void llenadoTabla(){
        Optional<Ex2TipoDocumento> ex2TipoDocumentoOptional =ex2TipoDocumentoRepository.findById(1);
        Ex2TipoDocumento ex2TipoDocumento =null;
        if(ex2TipoDocumentoOptional.isEmpty()) {
            ex2TipoDocumento = new Ex2TipoDocumento();
            ex2TipoDocumento.setId(1);
            ex2TipoDocumento.setSigla("CC");
            ex2TipoDocumento.setNombre("Cedula de ciudadania");
            ex2TipoDocumentoRepository.save(ex2TipoDocumento);
        }else{
            ex2TipoDocumento = ex2TipoDocumentoOptional.get();
        }

        for (int i = 1; i < 100000; i++) {
            Ex2Cliente ex2Cliente = new Ex2Cliente();
            ex2Cliente.setId(i);
            ex2Cliente.setNombres("Nombre"+i);
            ex2Cliente.setApellidos("Apellido"+i);
            ex2Cliente.setNumeroDocumento("doc"+i);
            ex2Cliente.setEx2TipoDocumentoByIdTipoDocumento(ex2TipoDocumento);
            ex2ClienteRepository.save(ex2Cliente);
        }
        assertTrue(true);

    }

}
