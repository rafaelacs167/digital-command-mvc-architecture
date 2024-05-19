package com.digital.command.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digital.command.model.User;

public interface UserRespository extends JpaRepository<User, Long> {

}
