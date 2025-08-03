package org.spring.halloween2.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Component
@Data //Anotação do Lombok para criacao de Getters, Setters, toString(), hashcode() de forma implícita
@Scope("prototype") //Substituir o escopo Padrão Singleton para evitar sobrescrição de objetos em memória
@Entity
@Table(name = "user_tb")
public class User {
    
    @Id //Coluna id da tabela user_tb
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //Utilizando o "long" ao invés do "Long" para que seja possível usar o setId()
    private String username;
    private String password;

}
