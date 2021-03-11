package com.smartContact.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartContact.entity.User;

public interface UserRepository extends JpaRepository<Integer, User>{

}
