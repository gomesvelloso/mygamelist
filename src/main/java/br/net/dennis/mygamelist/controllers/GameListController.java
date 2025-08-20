package br.net.dennis.mygamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.dennis.mygamelist.dto.GameListDTO;
import br.net.dennis.mygamelist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findAll() {
		
		return gameListService.findAll();
	}

}
