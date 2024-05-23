package com.cac.scoreboardjava.service;

import com.cac.scoreboardjava.pojo.Race;
import com.cac.scoreboardjava.pojo.Team;

import java.util.List;

public interface RaceService {
    Race getCurrentRace();
    List<Race> listRaces();

    void createRace(Race race);

    void deleteRace(int raceId);

    void changeRace(Race race);

    List<Team> listTeams();
}
