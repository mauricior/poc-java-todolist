package com.todolist.domain.usecases;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.todolist.domain.entities.TodoEntity;
import com.todolist.domain.repositories.TodoRepository;
import com.todolist.domain.usecases.ListTodos.ListTodosUseCase;
import com.todolist.domain.usecases.ListTodos.ListTodosUseCaseImpl;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

public class ListTodoUseCaseTest {

    @Test
    public void testListTasks() {
        TodoRepository todoRepository = Mockito.mock(TodoRepository.class);
        ListTodosUseCase listTodosUseCase = new ListTodosUseCaseImpl(todoRepository);

        // Configurar o comportamento do mock
        when(todoRepository.loadAll()).thenReturn(Arrays.asList(
                new TodoEntity(1, "Task 1", false),
                new TodoEntity(2, "Task 2", false)
        ));

        List<TodoEntity> tasks = listTodosUseCase.execute();

        Assert.assertNotNull(tasks);
        Assert.assertEquals(2, tasks.size());
    }
}