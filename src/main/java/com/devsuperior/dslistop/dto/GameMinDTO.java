package com.devsuperior.dslistop.dto;

import com.devsuperior.dslistop.entities.Game;
import com.devsuperior.dslistop.projections.GameMinProjection;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public GameMinDTO() {
		
	}

	public GameMinDTO(Game entity) {
		
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();	
	}
	
public GameMinDTO(GameMinProjection projection) {
		
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getgameYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();	
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
}
