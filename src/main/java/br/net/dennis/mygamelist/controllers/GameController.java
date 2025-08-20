package br.net.dennis.mygamelist.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.net.dennis.mygamelist.dto.GameDTO;
import br.net.dennis.mygamelist.dto.GameMinDTO;
import br.net.dennis.mygamelist.services.GameService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> listAll() {
		return gameService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		return gameService.findById(id);
	}
	
}
