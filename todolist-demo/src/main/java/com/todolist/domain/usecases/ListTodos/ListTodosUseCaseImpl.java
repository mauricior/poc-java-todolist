package com.todolist.domain.usecases.ListTodos;

import java.util.List;

import com.todolist.domain.entities.TodoEntity;
import com.todolist.domain.repositories.TodoRepository;

public class ListTodosUseCaseImpl implements ListTodosUseCase {
    private final TodoRepository todoRepository;

    public ListTodosUseCaseImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<TodoEntity> execute() {
        return this.todoRepository.loadAll();
    }
}
