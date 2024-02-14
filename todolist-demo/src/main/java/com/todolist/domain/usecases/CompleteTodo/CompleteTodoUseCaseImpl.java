package com.todolist.domain.usecases.CompleteTodo;

import com.todolist.domain.repositories.TodoRepository;

public class CompleteTodoUseCaseImpl implements CompleteTodoUseCase{
    private final TodoRepository todoRepository;

    public CompleteTodoUseCaseImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void execute(int id) {
        this.todoRepository.done(id);
    }
}
