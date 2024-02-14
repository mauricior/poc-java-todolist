package com.todolist.infra.repositories;

import java.util.ArrayList;
import java.util.List;

import com.todolist.domain.entities.TodoEntity;
import com.todolist.domain.repositories.TodoRepository;

public class TodoMemoryRepository implements TodoRepository {
    private static final List<TodoEntity> todos = new ArrayList<>();

    @Override
    public void create(TodoEntity todo) {
       todos.add(todo);
    }

    @Override
    public List<TodoEntity> loadAll() {
        return new ArrayList<>(todos);
    }

    @Override
    public void delete(int id) {
        todos.removeIf(todo -> todo.getId() == id);
    }

    @Override
    public void done(int id) {
        todos.stream()
            .filter(todo -> todo.getId() == id)
            .findFirst()
            .ifPresent(todo -> todo.setDone(true));
    }
    
}
