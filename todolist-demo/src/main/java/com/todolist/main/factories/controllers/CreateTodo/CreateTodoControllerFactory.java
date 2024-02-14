package com.todolist.main.factories.controllers.CreateTodo;

import com.todolist.application.controllers.CreateTodo.CreateTodoController;
import com.todolist.domain.repositories.TodoRepository;
import com.todolist.domain.usecases.CreateTodo.CreateTodoUseCase;
import com.todolist.infra.repositories.TodoMemoryRepository;
import com.todolist.main.factories.usecases.CreateTodoUseCaseFactory;

public class CreateTodoControllerFactory {
    public static CreateTodoController create() {
        TodoRepository todoRepository = new TodoMemoryRepository();
        CreateTodoUseCase createTodoUseCase = CreateTodoUseCaseFactory.create(todoRepository);
        return new CreateTodoController(createTodoUseCase);
    }
}
