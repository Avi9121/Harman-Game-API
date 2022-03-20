package com.harman.springbootproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harman.springbootproject.dto.GameDto;
import com.harman.springbootproject.service.MappingServiceImple;

@RestController
@RequestMapping("/api/v1")
public class MyController {
	@Autowired
	MappingServiceImple service;

	@PostMapping("/addingGameData")
	public ResponseEntity<String> dataAdding(@RequestBody List<GameDto> game) {
		service.addData(game);
		return new ResponseEntity<>("Data saved", HttpStatus.OK);

	}

	@GetMapping("/getdata")
	public GameDto getData(Integer gameId) {

		return service.getData(gameId);

	}

}
