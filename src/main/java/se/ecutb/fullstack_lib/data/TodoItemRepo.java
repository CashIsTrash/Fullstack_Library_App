package se.ecutb.fullstack_lib.data;

import org.springframework.data.jpa.repository.JpaRepository;
import se.ecutb.fullstack_lib.entity.AppUser;
import se.ecutb.fullstack_lib.entity.TodoItem;

import java.util.List;
import java.util.Optional;

public interface TodoItemRepo extends JpaRepository<TodoItem, Integer> {

    @Override
    Optional<TodoItem> findById(Integer integer);
    List<TodoItem> findByAssignee(AppUser appUser);
    Optional<TodoItem> findByTitle(String todoTitle);
}
