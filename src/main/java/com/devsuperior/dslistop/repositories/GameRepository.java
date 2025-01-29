package com.devsuperior.dslistop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslistop.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	
}