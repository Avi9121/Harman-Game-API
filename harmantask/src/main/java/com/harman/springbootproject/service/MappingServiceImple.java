package com.harman.springbootproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harman.springbootproject.dto.GameDto;
import com.harman.springbootproject.repository.CharacterRepository;
import com.harman.springbootproject.repository.GameRepository;

@Service
public class MappingServiceImple  implements MappingService{
	@Autowired
	CharacterRepository repository;
	@Autowired
	GameRepository repository2; 
	

	@Override
	public List<GameDto> addData(List<GameDto> game) {
		
		return repository2.saveAll( game);
	}


	public GameDto getData(Integer gameId) {
		// TODO Auto-generated method stub
		return repository2.findByGameId(gameId);
	}

}
