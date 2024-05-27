package com.digital.command.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digital.command.model.User;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<User, Integer> {
}