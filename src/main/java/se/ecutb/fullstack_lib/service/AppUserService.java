package se.ecutb.fullstack_lib.service;

import se.ecutb.fullstack_lib.dto.AppUserFormDto;
import se.ecutb.fullstack_lib.entity.AppUser;

import java.util.List;
import java.util.Optional;

public interface AppUserService {

    AppUser registerNew(AppUserFormDto userFormDto);
    AppUser save(AppUser appUser);
    Optional<AppUser> findById(int userId);
    Optional<AppUser> findByUserName(String userName);
    List<AppUser> findAll();
    AppUser delete(AppUser appUser);
}
