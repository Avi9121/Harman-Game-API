package com.harman.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harman.springbootproject.dto.CharacterDto;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterDto, Integer> {

}