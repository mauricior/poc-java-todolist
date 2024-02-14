package com.todolist.main.factories.controllers.DeleteTodo;

import com.todolist.application.controllers.DeleteTodo.DeleteTodoController;
import com.todolist.domain.repositories.TodoRepository;
import com.todolist.domain.usecases.DeleteTodo.DeleteTodoUseCase;
import com.todolist.infra.repositories.TodoMemoryRepository;
import com.todolist.main.factories.usecases.DeleteTodoUseCaseFactory;

public class DeleteTodoControllerFactory {
    public static DeleteTodoController create(){
        TodoRepository todoRepository = new TodoMemoryRepository();
        DeleteTodoUseCase deleteTodoUseCase = DeleteTodoUseCaseFactory.create(todoRepository);
        return new DeleteTodoController(deleteTodoUseCase);
    }
}
