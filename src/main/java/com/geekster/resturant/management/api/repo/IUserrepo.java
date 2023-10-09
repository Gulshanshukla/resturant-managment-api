package com.geekster.resturant.management.api.repo;

import com.geekster.resturant.management.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IUserrepo extends JpaRepository<User, Long> {


    User findByUsername(String username);
}

