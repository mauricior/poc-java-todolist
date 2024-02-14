package com.todolist.domain.usecases.ListTodos;

import java.util.List;

import com.todolist.domain.entities.TodoEntity;

public interface ListTodosUseCase {
    List<TodoEntity> execute();
}
