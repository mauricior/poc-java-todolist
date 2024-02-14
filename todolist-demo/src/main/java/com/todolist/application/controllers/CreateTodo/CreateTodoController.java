package com.todolist.application.controllers.CreateTodo;

import com.todolist.domain.entities.TodoEntity;
import com.todolist.domain.usecases.CreateTodo.CreateTodoUseCase;

public class CreateTodoController {
    private final CreateTodoUseCase createTodoUseCase;

    public CreateTodoController(CreateTodoUseCase createTodoUseCase) {
        this.createTodoUseCase = createTodoUseCase;
    }

    public void createTodo(CreateTodoInput input){
        TodoEntity todo = new TodoEntity(input.id(), input.title(), input.done());
        this.createTodoUseCase.execute(todo);
    }
}
