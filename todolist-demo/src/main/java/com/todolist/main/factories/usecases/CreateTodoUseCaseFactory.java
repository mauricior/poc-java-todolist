package com.todolist.main.factories.usecases;

import com.todolist.domain.repositories.TodoRepository;
import com.todolist.domain.usecases.CreateTodo.CreateTodoUseCase;
import com.todolist.domain.usecases.CreateTodo.CreateTodoUseCaseImpl;

public class CreateTodoUseCaseFactory {
    public static CreateTodoUseCase create(TodoRepository todoRepository){
        return new CreateTodoUseCaseImpl(todoRepository);
    }
}
