package com.todolist.domain.usecases.CreateTodo;

import com.todolist.domain.entities.TodoEntity;
import com.todolist.domain.repositories.TodoRepository;

public class CreateTodoUseCaseImpl implements CreateTodoUseCase {
    private final TodoRepository todoRepository;

    public CreateTodoUseCaseImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void execute(TodoEntity todo) {
        this.todoRepository.create(todo);
    }
    
}
