package com.mycompany.explainplan.explain;

import com.mycompany.explainplan.domain.Ex9Cliente;
import com.mycompany.explainplan.domain.Ex9ClientePK;
import com.mycompany.explainplan.domain.Ex9User;
import com.mycompany.explainplan.repository.Ex9ClienteRepository;
import com.mycompany.explainplan.repository.Ex9UserRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Ex9Explain {
    @Autowired
    Ex9UserRepository ex9UserRepository;
    @Autowired
    Ex9ClienteRepository ex9ClienteRepository;

    @Test
    @Order(1)
    void llenarTabla(){
        for (int i = 1; i <=100000 ; i++) {
            Ex9User user = new Ex9User();
            user.setLogin("user"+i);
            user.setPassword("pass"+i);
            user.setEstado("estado"+i);
            ex9UserRepository.save(user);

            Ex9Cliente cliente= new Ex9Cliente();
            cliente.setEx9ClientePK(new Ex9ClientePK("doc"+i,"num"+i));
            cliente.setApellidos("apellido"+i);
            cliente.setNombres("nombre"+i);
            cliente.setLogin(user);
            ex9ClienteRepository.save(cliente);

        }

    }
}
