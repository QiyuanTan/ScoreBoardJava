package com.cac.scoreboardjava.pojo;

import lombok.Data;

@Data
public class Team {
    private Integer ID;
    private String name;

    public Team(Integer ID, String name) {
        this.ID = ID;
        this.name = name;
    }
}