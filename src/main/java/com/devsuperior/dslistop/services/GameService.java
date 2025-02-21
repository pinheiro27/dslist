package com.devsuperior.dslistop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslistop.dto.GameDTO;
import com.devsuperior.dslistop.dto.GameMinDTO;
import com.devsuperior.dslistop.entities.Game;
import com.devsuperior.dslistop.projections.GameMinProjection;
import com.devsuperior.dslistop.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll(); // Buscar no Banco de dados 
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
		}
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}
	
}
