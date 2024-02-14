package com.todolist.application.controllers.ListTodo;

import java.util.List;
import java.util.stream.Collectors;

import com.todolist.domain.entities.TodoEntity;
import com.todolist.domain.usecases.ListTodos.ListTodosUseCase;

public class ListTodoController {
    private final ListTodosUseCase listTodosUseCase;

    public ListTodoController(ListTodosUseCase listTodosUseCase) {
        this.listTodosUseCase = listTodosUseCase;
    }

    public List<ListTodoOutput> listTodos(){
        List<TodoEntity> listTodos = this.listTodosUseCase.execute();
        return listTodos.stream() 
            .map(todo -> new ListTodoOutput(todo.getId(), todo.getTitle(), todo.isDone()))
            .collect(Collectors.toList());
    }
}
