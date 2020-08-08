package com.live.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.live.model.User;
//@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
Optional<User> findByUserName(String userName);
}
