package se.ecutb.fullstack_lib.service;

import se.ecutb.fullstack_lib.dto.TodoItemFormDto;
import se.ecutb.fullstack_lib.entity.AppUser;
import se.ecutb.fullstack_lib.entity.TodoItem;

import java.util.List;
import java.util.Optional;

public interface TodoItemService {

    TodoItem create(TodoItemFormDto itemFormDto);
    TodoItem save(TodoItem todoItem);
    Optional<TodoItem> findById(int todoItemId);
    List<TodoItem> findByAssignee(AppUser appUser);
    Optional<TodoItem> findByTitle(String todoTitle);
    List<TodoItem> findAll();
}
