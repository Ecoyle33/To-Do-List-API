package com.euancoyle.todo.models.user;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {

    private int id;

    private String name;

    private String email;

    private String password;
}
