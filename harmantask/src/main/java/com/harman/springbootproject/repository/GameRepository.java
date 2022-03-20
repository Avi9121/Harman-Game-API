package com.harman.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harman.springbootproject.dto.GameDto;

@Repository
public interface GameRepository extends JpaRepository<GameDto, Integer> {
	
	public GameDto findByGameId(Integer gameId);

}
