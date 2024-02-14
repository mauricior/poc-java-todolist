package com.todolist.domain.entities;

import org.junit.Assert;
import org.junit.Test;

public class TodoEntityTest {


    @Test
    public void testTodoEntityCreation() {
        TodoEntity todo = new TodoEntity(1, "Example Todo", false);

        Assert.assertEquals(1, todo.getId());
        Assert.assertEquals("Example Todo", todo.getTitle());
        Assert.assertFalse(todo.isDone());
    }

    @Test
    public void testTaskEntityCompletion() {
        TodoEntity task = new TodoEntity(1, "Example Todo", false);
        task.setDone(true);

        Assert.assertTrue(task.isDone());
    }
}