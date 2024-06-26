package com.example.springWebFluxJwt.repository;

import com.example.springWebFluxJwt.models.User;
//import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
