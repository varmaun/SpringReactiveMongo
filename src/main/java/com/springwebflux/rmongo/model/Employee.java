package com.springwebflux.rmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document("employee")
public class Employee{
	@Id
	@JsonProperty
	private Integer id;
	@JsonProperty
	private String name;
	@JsonProperty
	private int salary;
}
