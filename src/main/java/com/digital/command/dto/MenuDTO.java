package com.digital.command.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuDTO {

	private Long id;
	private String nome;
	private String description;
	private List<ProductDTO> Products;
	private String phone;

	

}
