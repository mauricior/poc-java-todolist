package com.todolist.main.factories.usecases;

import com.todolist.domain.repositories.TodoRepository;
import com.todolist.domain.usecases.ListTodos.ListTodosUseCase;
import com.todolist.domain.usecases.ListTodos.ListTodosUseCaseImpl;

public class ListTodosUseCaseFactory {
    public static ListTodosUseCase create(TodoRepository todoRepository){
        return new ListTodosUseCaseImpl(todoRepository);
    }
}
