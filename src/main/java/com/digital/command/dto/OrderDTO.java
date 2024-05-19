package com.digital.command.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO {
	
	private Long id;
	private BigDecimal value;
	private List<ProductDTO> products;
	private LocalDateTime requestDate;
	private String Status;

	
}
