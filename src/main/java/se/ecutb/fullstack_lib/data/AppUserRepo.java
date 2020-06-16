package se.ecutb.fullstack_lib.data;

import org.springframework.data.jpa.repository.JpaRepository;
import se.ecutb.fullstack_lib.entity.AppUser;

import java.util.Optional;

public interface AppUserRepo extends JpaRepository<AppUser, Integer> {

    Optional<AppUser> findAppUserByUserName(String userName);
}
