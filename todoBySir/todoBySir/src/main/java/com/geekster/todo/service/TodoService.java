package com.geekster.todo.service;

import com.geekster.todo.TodoApplication;
import com.geekster.todo.model.ToDo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
@Service
public class TodoService {
    private static final List<ToDo> todos=new ArrayList<>(); // In-memory database
    private static int todoCount=0;

    static {
        todos.add(new ToDo(++todoCount,"Learn Spring Boot",false));
        todos.add(new ToDo(++todoCount,"Visit Grocery Store",false));
        todos.add(new ToDo(++todoCount,"Learn AWS",false));
        todos.add(new ToDo(++todoCount,"Swimming",false));
        todos.add(new ToDo(++todoCount,"Yoga",false));
    }
        public List<ToDo> findAll(){
        return todos;
        }
        public ToDo findById(int id)throws NoSuchElementException {
            Predicate<? super ToDo> predicate = todo -> todo.getId()==id;
            return todos.stream().filter(predicate).findFirst().get();
        }
        public void addTodo(ToDo todo){
         todos.add(todo);
        }
        public  void deleteTodo(int id){
            Predicate<? super ToDo> predicate = todo -> todo.getId()== id;
            todos.removeIf(predicate);
        }
        public void updateTodo(int id,ToDo newtodo){
        ToDo temp=findById(id);
        temp.setId(newtodo.getId());
        temp.setTitle(newtodo.getTitle());
        temp.setStatus(newtodo.getStatus());
        }
}
