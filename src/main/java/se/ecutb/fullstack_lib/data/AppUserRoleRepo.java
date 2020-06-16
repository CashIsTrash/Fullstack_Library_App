package se.ecutb.fullstack_lib.data;

import org.springframework.data.jpa.repository.JpaRepository;
import se.ecutb.fullstack_lib.entity.AppUserRole;
import se.ecutb.fullstack_lib.entity.Role;

import java.util.Optional;

public interface AppUserRoleRepo extends JpaRepository<AppUserRole, Integer> {

    @Override
    Optional<AppUserRole> findById(Integer integer);
    Optional<AppUserRole> findByRole(Role userRole);
}
