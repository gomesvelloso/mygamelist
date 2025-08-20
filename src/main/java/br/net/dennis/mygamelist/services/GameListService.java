package br.net.dennis.mygamelist.services;

import java.util.List;
import br.net.dennis.mygamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.net.dennis.mygamelist.dto.GameListDTO;
import br.net.dennis.mygamelist.entities.GameList;
import br.net.dennis.mygamelist.repositories.GameListRepository;

@Service
public class GameListService {

    private final GameRepository gameRepository;
	
	@Autowired
	GameListRepository gameListRepository;

    GameListService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }
	
    @Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(list -> new GameListDTO(list)).toList();
	}
}
