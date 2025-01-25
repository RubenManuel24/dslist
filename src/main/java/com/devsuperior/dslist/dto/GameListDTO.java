package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;

import jakarta.persistence.Column;

public class GameListDTO {
	
	private Long id;
	private String name;
	
	 public GameListDTO() {}

	 public GameListDTO(GameList entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	 
	 
	 
                            
}
