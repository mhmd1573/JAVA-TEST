package com.tamingthymeleaf.application.user;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@Repository
public interface UserRepository extends CrudRepository<User, UserId>, UserRepositoryCustom {
}



