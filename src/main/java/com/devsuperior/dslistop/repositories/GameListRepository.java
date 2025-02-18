package com.devsuperior.dslistop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslistop.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
	
}