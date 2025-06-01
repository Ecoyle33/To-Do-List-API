package com.euancoyle.todo.controller;

import com.euancoyle.todo.service.TaskService;

public class TaskController {

    TaskService taskService;

    TaskController(TaskService taskService){
        this.taskService = taskService;
    }


}
