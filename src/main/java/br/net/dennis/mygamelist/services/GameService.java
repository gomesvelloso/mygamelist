package br.net.dennis.mygamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.dennis.mygamelist.dto.GameMinDTO;
import br.net.dennis.mygamelist.entities.Game;
import br.net.dennis.mygamelist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> listGame = gameRepository.findAll();
		return listGame.stream().map(game -> new GameMinDTO(game)).toList();
	}
}
