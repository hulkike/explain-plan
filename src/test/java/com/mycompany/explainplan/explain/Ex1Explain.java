package com.mycompany.explainplan.explain;

import com.mycompany.explainplan.domain.Ex1Cliente;
import com.mycompany.explainplan.domain.Ex1ClientePK;
import com.mycompany.explainplan.domain.Ex1TipoDocumento;
import com.mycompany.explainplan.domain.Ex2TipoDocumento;
import com.mycompany.explainplan.repository.Ex1ClienteRepository;
import com.mycompany.explainplan.repository.Ex1TipoDocumentoRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Ex1Explain {

    @Autowired
    Ex1TipoDocumentoRepository ex1TipoDocumentoRepository;
    @Autowired
    Ex1ClienteRepository ex1ClienteRepository;


    @Test
    @Order(1)
    void llenarTabla(){
        Optional<Ex1TipoDocumento> ex1TipoDocumentoOptional =ex1TipoDocumentoRepository.findById("CC");
        Ex1TipoDocumento ex1TipoDocumento =null;
        if(ex1TipoDocumentoOptional.isEmpty()){
            ex1TipoDocumento = new Ex1TipoDocumento();
            ex1TipoDocumento.setSigla("CC");
            ex1TipoDocumento.setNombre("Cedula de ciudadania");

            ex1TipoDocumentoRepository.save(ex1TipoDocumento);
        } else {
            ex1TipoDocumento= ex1TipoDocumentoOptional.get();
        }

        for (int i = 1; i <100000 ; i++) {
            Ex1Cliente ex1Cliente = new Ex1Cliente();
            ex1Cliente.setEx1ClientePK(new Ex1ClientePK(ex1TipoDocumento.getSigla(),"doc"+i));
            ex1Cliente.setNombres("nombre"+i);
            ex1Cliente.setApellidos("apellidos"+i);
            ex1ClienteRepository.save(ex1Cliente);
        }

    }
}
