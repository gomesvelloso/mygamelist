package br.net.dennis.mygamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.net.dennis.mygamelist.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
