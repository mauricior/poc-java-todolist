package com.todolist.main.factories.usecases;

import com.todolist.domain.repositories.TodoRepository;
import com.todolist.domain.usecases.DeleteTodo.DeleteTodoUseCase;
import com.todolist.domain.usecases.DeleteTodo.DeleteTodoUseCaseImpl;

public class DeleteTodoUseCaseFactory {
    public static DeleteTodoUseCase create(TodoRepository todoRepository) {
        return new DeleteTodoUseCaseImpl(todoRepository);
    }
}
