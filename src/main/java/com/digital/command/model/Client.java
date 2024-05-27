package com.digital.command.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Client {
	@Id
	private int id;
	@Column
	private String name;
	@Column
	private String document;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String phone;

}
