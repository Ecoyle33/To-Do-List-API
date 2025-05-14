package com.euancoyle.todo.models.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private int id;

    private String name;

    private String email;

    private String password;
}
