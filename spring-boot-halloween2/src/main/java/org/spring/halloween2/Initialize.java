package org.spring.halloween2;

import org.spring.halloween2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Initialize implements CommandLineRunner {

    //Injetando dependência automática sempre que o tipo 'User' for referenciado
    @Autowired
    private User user01;

    @Autowired
    private User user02;

    //Método abstrato necessário devido o uso da interface CommandLineRunner
    @Override
    public void run(String... args) throws Exception {
        user01.setId(1);
        user01.setUsername("Lucas_Severo");
        user01.setPassword("lucas123");

        user02.setId(2);
        user02.setUsername("Diego_Severo");
        user02.setPassword("diego123");

        System.out.println(user01 + "\n" + user02);
        
    }

}
