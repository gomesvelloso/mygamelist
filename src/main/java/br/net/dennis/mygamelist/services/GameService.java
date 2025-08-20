package br.net.dennis.mygamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.net.dennis.mygamelist.dto.GameDTO;
import br.net.dennis.mygamelist.dto.GameMinDTO;
import br.net.dennis.mygamelist.entities.Game;
import br.net.dennis.mygamelist.projections.GameMinProjection;
import br.net.dennis.mygamelist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired private GameRepository gameRepository;
	
	//A annotation @Transactional(readOnly = true) assegura que na há operação de escrita. não há bloqueio. entao ficará mais rapido
	@Transactional(readOnly = true) 
	public List<GameMinDTO> findAll() {
		List<Game> listGame = gameRepository.findAll();
		return listGame.stream().map(game -> new GameMinDTO(game)).toList();
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true) 
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> listGame = gameRepository.searchByList(listId);
		return listGame.stream().map(game -> new GameMinDTO(game)).toList();
	}
}
