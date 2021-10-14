package com.david.magalhaes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.magalhaes.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
