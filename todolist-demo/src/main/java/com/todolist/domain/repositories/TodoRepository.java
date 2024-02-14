package com.todolist.domain.repositories;

import java.util.List;

import com.todolist.domain.entities.TodoEntity;

public interface TodoRepository {
    void create(TodoEntity todo);
    List<TodoEntity> loadAll();
    void delete(int id);
    void done(int id);
}
