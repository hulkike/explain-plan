package com.mycompany.explainplan.explain;

import com.mycompany.explainplan.domain.Ex3Cliente;
import com.mycompany.explainplan.domain.Ex3TipoDocumento;
import com.mycompany.explainplan.repository.Ex3ClienteRepository;
import com.mycompany.explainplan.repository.Ex3TipoDocumentoRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Ex3Explain {
    @Autowired
    Ex3ClienteRepository ex3ClienteRepository;
    @Autowired
    Ex3TipoDocumentoRepository ex3TipoDocumentoRepository;

    @Test
    @Order(1)
    void llenadoTabla(){
        Optional<Ex3TipoDocumento> ex3TipoDocumentoOptional =ex3TipoDocumentoRepository.findById(1);
        Ex3TipoDocumento ex3TipoDocumento =null;
        if(ex3TipoDocumentoOptional.isEmpty()) {
            ex3TipoDocumento = new Ex3TipoDocumento();
            ex3TipoDocumento.setId(1);
            ex3TipoDocumento.setSigla("CC");
            ex3TipoDocumento.setNombre("Cedula de ciudadania");
            ex3TipoDocumentoRepository.save(ex3TipoDocumento);
        }else{
            ex3TipoDocumento = ex3TipoDocumentoOptional.get();
        }

        for (int i = 1; i < 100000; i++) {
            Ex3Cliente ex3Cliente = new Ex3Cliente();
            ex3Cliente.setId(i);
            ex3Cliente.setNombres("Nombre"+i);
            ex3Cliente.setApellidos("Apellido"+i);
            ex3Cliente.setNumeroDocumento("doc"+i);
            ex3Cliente.setEx3TipoDocumentoByIdTipoDocumento(ex3TipoDocumento);
            ex3ClienteRepository.save(ex3Cliente);
        }


    }
}
