package com.todolist.main.factories.usecases;

import com.todolist.domain.repositories.TodoRepository;
import com.todolist.domain.usecases.CompleteTodo.CompleteTodoUseCase;
import com.todolist.domain.usecases.CompleteTodo.CompleteTodoUseCaseImpl;

public class CompleteTodoUseCaseFactory {
    public static CompleteTodoUseCase create(TodoRepository todoRepository) {
        return new CompleteTodoUseCaseImpl(todoRepository);
    }
}