package com.todolist.main.factories.repositories;

import com.todolist.domain.repositories.TodoRepository;
import com.todolist.infra.repositories.TodoMemoryRepository;

public class TodoRepositoryFactory {
    private static TodoRepository instance;

    private TodoRepositoryFactory() {}

    public static TodoRepository getInstance() {
        if(instance == null) {
            instance = new TodoMemoryRepository();
        }

        return instance;
    }
}
