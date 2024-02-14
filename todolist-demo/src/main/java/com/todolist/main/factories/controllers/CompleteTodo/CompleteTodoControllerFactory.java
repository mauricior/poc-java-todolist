package com.todolist.main.factories.controllers.CompleteTodo;

import com.todolist.application.controllers.CompleteTodo.CompleteTodoController;
import com.todolist.domain.repositories.TodoRepository;
import com.todolist.domain.usecases.CompleteTodo.CompleteTodoUseCase;
import com.todolist.infra.repositories.TodoMemoryRepository;
import com.todolist.main.factories.usecases.CompleteTodoUseCaseFactory;

public class CompleteTodoControllerFactory {
    public static CompleteTodoController create(){
        TodoRepository todoRepository = new TodoMemoryRepository();
        CompleteTodoUseCase markTodoAsCompleteUseCase = CompleteTodoUseCaseFactory.create(todoRepository);
        return new CompleteTodoController(markTodoAsCompleteUseCase);
    }
}
