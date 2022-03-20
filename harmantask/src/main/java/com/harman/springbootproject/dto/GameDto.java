package com.harman.springbootproject.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class GameDto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer gameId;
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	private List<CharacterDto> character;
	public Integer getGameId() {
		return gameId;
	}
	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<CharacterDto> getCharacter() {
		return character;
	}
	public void setCharacter(List<CharacterDto> character) {
		this.character = character;
	}
	
	

}
