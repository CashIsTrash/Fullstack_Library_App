package se.ecutb.fullstack_lib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import se.ecutb.fullstack_lib.data.TodoItemRepo;
import se.ecutb.fullstack_lib.dto.TodoItemFormDto;
import se.ecutb.fullstack_lib.entity.AppUser;
import se.ecutb.fullstack_lib.entity.TodoItem;

import java.util.List;
import java.util.Optional;

@Service
public class TodoItemServiceImpl implements TodoItemService {

    private TodoItemRepo todoItemRepo;

    @Autowired
    public TodoItemServiceImpl(TodoItemRepo todoItemRepo) {
        this.todoItemRepo = todoItemRepo;
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public TodoItem create(TodoItemFormDto itemFormDto) {

        TodoItem newItem = new TodoItem(
                itemFormDto.getTitle(),
                itemFormDto.getDescription(),
                itemFormDto.getDeadline(),
                false,
                itemFormDto.getReward(),
                itemFormDto.getAssignee()
        );

        newItem = todoItemRepo.save(newItem);
        return newItem;
    }

    @Override
    public TodoItem save(TodoItem todoItem) {
        return todoItemRepo.save(todoItem);
    }

    @Override
    public Optional<TodoItem> findById(int todoItemId) {
        return todoItemRepo.findById(todoItemId);
    }

    @Override
    public List<TodoItem> findByAssignee(AppUser appUser) {
        return todoItemRepo.findByAssignee(appUser);
    }

    @Override
    public Optional<TodoItem> findByTitle(String todoTitle) {
        return todoItemRepo.findByTitle(todoTitle);
    }

    @Override
    public List<TodoItem> findAll() {
        return todoItemRepo.findAll();
    }
}
