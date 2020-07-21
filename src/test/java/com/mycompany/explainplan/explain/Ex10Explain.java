package com.mycompany.explainplan.explain;

import com.mycompany.explainplan.domain.*;
import com.mycompany.explainplan.repository.Ex10ClienteRepository;
import com.mycompany.explainplan.repository.Ex10UserRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Ex10Explain {

    @Autowired
    Ex10UserRepository ex10UserRepository;
    @Autowired
    Ex10ClienteRepository ex10ClienteRepository;

    @Test
    @Order(1)
    void llenarTabla(){
        for (int i = 1; i <=100000 ; i++) {
            Ex10User user = new Ex10User();
            user.setId(i);
            user.setLogin("user"+i);
            user.setPassword("pass"+i);
            user.setEstado("estado"+i);
            ex10UserRepository.save(user);

            Ex10Cliente cliente= new Ex10Cliente();
            cliente.setId(i);
            cliente.setTipoDocumento("doc"+i);
            cliente.setNumeroDocumento("numero"+i);
            cliente.setApellidos("apellido"+i);
            cliente.setNombres("nombre"+i);
            cliente.setEx10UserByUserId(user);
            ex10ClienteRepository.save(cliente);

        }
        
    }


}
