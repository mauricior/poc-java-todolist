package com.todolist.application.controllers.CompleteTodo;

import com.todolist.domain.usecases.CompleteTodo.CompleteTodoUseCase;

public class CompleteTodoController {
    private final CompleteTodoUseCase markTodoAsCompletedUseCase;

    public CompleteTodoController(CompleteTodoUseCase markTodoAsCompletedUseCase) {
        this.markTodoAsCompletedUseCase = markTodoAsCompletedUseCase;
    }

    public void completeTodo(int id) {
        this.markTodoAsCompletedUseCase.execute(id);
    }
}
