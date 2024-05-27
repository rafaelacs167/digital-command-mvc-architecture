package com.digital.command.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digital.command.dto.UserDTO;
import com.digital.command.model.User;
import com.digital.command.repository.UserRespository;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRespository userRespository;

	@GetMapping
	public UserDTO getUserId() {
		List<User> findAll = userRespository.findAll();
		return new UserDTO();
	}
}
