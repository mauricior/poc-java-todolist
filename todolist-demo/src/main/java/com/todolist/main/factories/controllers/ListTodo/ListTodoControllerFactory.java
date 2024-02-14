package com.todolist.main.factories.controllers.ListTodo;

import com.todolist.application.controllers.ListTodo.ListTodoController;
import com.todolist.domain.repositories.TodoRepository;
import com.todolist.domain.usecases.ListTodos.ListTodosUseCase;
import com.todolist.infra.repositories.TodoMemoryRepository;
import com.todolist.main.factories.usecases.ListTodosUseCaseFactory;

public class ListTodoControllerFactory {
    public static ListTodoController create() {
        TodoRepository todoRepository = new TodoMemoryRepository();
        ListTodosUseCase listTodosUseCase = ListTodosUseCaseFactory.create(todoRepository);
        return new ListTodoController(listTodosUseCase);
    }
}
