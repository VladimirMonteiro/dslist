package com.outercode.dslist.dto;

import com.outercode.dslist.entities.Game;

public class GameMinDTO {


    private Long id;
    private String title;
    private Integer year;
    private String longDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.longDescription = entity.getLongDescription();
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

    public String getLongDescription() {
        return longDescription;
    }


}
