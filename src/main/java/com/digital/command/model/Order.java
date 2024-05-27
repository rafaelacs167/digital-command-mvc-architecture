package com.digital.command.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Order {

	@Id
	private Long id;
	@Column
	private BigDecimal value;
	@Column(name = "request_date")
	private LocalDateTime requestDate;
	@Column
	private String status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public LocalDateTime getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(LocalDateTime requestDate) {
		this.requestDate = requestDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
