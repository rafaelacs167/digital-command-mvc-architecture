package com.digital.command.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDTO {
	private Long id;
	private String name;
	private String document;
	private String email;
	private String password;
	private String phone;

	private List<OrderDTO> orders;
}
