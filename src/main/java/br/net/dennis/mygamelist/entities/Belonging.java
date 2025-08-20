package br.net.dennis.mygamelist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
	
	@EmbeddedId
	private BelogingPk id = new BelogingPk();

	private Integer position;

	public Belonging() {
		super();
	}

	public Belonging(Game game, GameList gameList, Integer position) {
		super();
		this.id.setGame(game);
		this.id.setList(gameList);
		this.position = position;
	}

	public BelogingPk getId() {
		return id;
	}

	public void setId(BelogingPk id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}

}
