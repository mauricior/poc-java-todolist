package com.todolist;

import java.util.List;

import com.todolist.application.controllers.CompleteTodo.CompleteTodoController;
import com.todolist.application.controllers.CreateTodo.CreateTodoController;
import com.todolist.application.controllers.CreateTodo.CreateTodoInput;
import com.todolist.application.controllers.DeleteTodo.DeleteTodoController;
import com.todolist.application.controllers.ListTodo.ListTodoController;
import com.todolist.application.controllers.ListTodo.ListTodoOutput;
import com.todolist.main.factories.controllers.CompleteTodo.CompleteTodoControllerFactory;
import com.todolist.main.factories.controllers.CreateTodo.CreateTodoControllerFactory;
import com.todolist.main.factories.controllers.DeleteTodo.DeleteTodoControllerFactory;
import com.todolist.main.factories.controllers.ListTodo.ListTodoControllerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CreateTodoController createTodoController = CreateTodoControllerFactory.create();
        DeleteTodoController deleteTodoController = DeleteTodoControllerFactory.create();
        CompleteTodoController completeTodoController = CompleteTodoControllerFactory.create();
        ListTodoController listTodoController = ListTodoControllerFactory.create();
        
        createTodoController.createTodo(new CreateTodoInput(1, "Todo de exemplo 1",false));
        createTodoController.createTodo(new CreateTodoInput(2, "Todo de exemplo 2",false));
        createTodoController.createTodo(new CreateTodoInput(3, "Todo de exemplo 3",false));
        deleteTodoController.deleteTodo(1);
        completeTodoController.completeTodo(2);
        completeTodoController.completeTodo(3);

        List<ListTodoOutput> listTodosUpdated = listTodoController.listTodos();
        listTodosUpdated.forEach(todo -> System.out.println(todo));
    }
}
