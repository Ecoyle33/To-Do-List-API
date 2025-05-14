package com.euancoyle.todo.models.task;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Task {

    private int id;

    private String title;

    private String description;
}
