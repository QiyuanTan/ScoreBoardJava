package com.cac.scoreboardjava.pojo;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class Race {
    private String name;
    private Integer id;
    private Team team1;
    private Team team2;
    private Integer team1_id;
    private Integer team2_id;
    private Integer team1_score;
    private Integer team2_score;
    private Integer team1_total_score;
    private Integer team2_total_score;
    private Timestamp timer_start;
    private Timestamp timer_end;

    @Override
    public String toString() {
        return STR."Race{name='\{name}\{'\''}, id=\{id}, team1=\{team1_id}, team2=\{team2_id}, team1_score=\{team1_score}, team2_score=\{team2_score}, team1_total_score=\{team1_total_score}, team2_total_score=\{team2_total_score}, timer_start=\{timer_start}, timer_end=\{timer_end}\{'}'}";
    }
}
