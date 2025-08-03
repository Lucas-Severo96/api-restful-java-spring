package org.spring.halloween2;

import java.util.Random;

import org.spring.halloween2.model.User;
import org.spring.halloween2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Initialize implements CommandLineRunner {

    //Injetando dependência automática sempre que o tipo 'User' for referenciado
    //@Autowired
    private User user;

    //@Autowired
    //private User user02;

    @Autowired
    UserRepository repository;

    //Método abstrato necessário devido o uso da interface CommandLineRunner
    @Override
    public void run(String... args) throws Exception {
        /*
        user.setId(1);
        user.setUsername("Lucas_Severo");
        user.setPassword("lucas123");

        user02.setId(2);
        user02.setUsername("Diego_Severo");
        user02.setPassword("diego123");

        System.out.println(user + "\n" + user02);
        */

        Random gen = new Random();
        for(int i = 0; i < 5 ; i++){
            user = new User();
            user.setUsername("Luc" + gen.nextLong(1000));
            user.setPassword("Pass" + gen.nextLong(1000));
            repository.save(user);
        }

        for(User u : repository.findAll()){
            System.out.println(u);
        }
        
    }

}
