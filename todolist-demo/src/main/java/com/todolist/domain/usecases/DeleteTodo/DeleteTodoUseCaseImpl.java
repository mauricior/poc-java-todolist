package com.todolist.domain.usecases.DeleteTodo;

import com.todolist.domain.repositories.TodoRepository;

public class DeleteTodoUseCaseImpl implements DeleteTodoUseCase {
    private final TodoRepository todoRepository;

    public DeleteTodoUseCaseImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void execute(int id) {
       this.todoRepository.delete(id);
    }
}
