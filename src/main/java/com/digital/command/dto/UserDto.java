package com.digital.command.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
	
	private Long id;
	private String document;
	private String password;
	private String name;
	private String email;
	private List<MenuDTO> menus;
	private String address;
	private String state;
	private String city;
	private String number;
	private String phone;
	private LocalDate dateCreate;

	
}
