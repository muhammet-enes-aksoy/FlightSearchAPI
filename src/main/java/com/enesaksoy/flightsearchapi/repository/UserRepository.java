package com.enesaksoy.flightsearchapi.repository;

import com.enesaksoy.flightsearchapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(
            "select user from User user where user.username= :username")
    Optional<User>  findByUsername(String username);

}
