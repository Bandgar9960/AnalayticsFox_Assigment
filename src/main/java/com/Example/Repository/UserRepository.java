package com.Example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Example.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
