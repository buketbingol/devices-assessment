package com.casestudy.devicestudy.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "devices")

public class Device {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name="brand", nullable = false)
	private String brand;
	
	@Column(name="model", nullable = false)
	private String model;
	
	@Column(name="os", nullable = false)
	private String os;
	
	@Column(name="os_version", nullable = false)
	private String osVersion;

}