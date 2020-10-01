package com.nipuna.rentcloud.authorizationserver.repository;

import com.nipuna.rentcloud.authorizationserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailsRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);
}
