package com.todolist.application.controllers.DeleteTodo;

import com.todolist.domain.usecases.DeleteTodo.DeleteTodoUseCase;

public class DeleteTodoController {
    private final DeleteTodoUseCase deleteTodoUseCase;

    public DeleteTodoController(DeleteTodoUseCase deleteTodoUseCase) {
        this.deleteTodoUseCase = deleteTodoUseCase;
    }

    public void deleteTodo(int id) {
        this.deleteTodoUseCase.execute(id);
    }
}
