package com.todolist.domain.usecases.CreateTodo;

import com.todolist.domain.entities.TodoEntity;

public interface CreateTodoUseCase {
    void execute(TodoEntity todo);
}
