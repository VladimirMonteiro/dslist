package com.outercode.dslist.dto;

import com.outercode.dslist.entities.Game;
import com.outercode.dslist.projections.GameMinProjection;

public class GameMinDTO {


    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImageUrl();
        this.shortDescription = entity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getGameYear();
        this.shortDescription = entity.getShortDescription();

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

    public String getshortDescription() {
        return shortDescription;
    }


}
