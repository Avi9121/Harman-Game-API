package com.harman.springbootproject.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CharacterDto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer charId;
	private String name;
	private Integer power;
	public Integer getCharId() {
		return charId;
	}
	public void setCharId(Integer charId) {
		this.charId = charId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPower() {
		return power;
	}
	public void setPower(Integer power) {
		this.power = power;
	}
	
	

}
