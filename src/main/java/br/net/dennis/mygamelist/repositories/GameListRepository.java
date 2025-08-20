package br.net.dennis.mygamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.dennis.mygamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
