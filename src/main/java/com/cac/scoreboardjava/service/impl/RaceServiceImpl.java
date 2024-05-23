package com.cac.scoreboardjava.service.impl;

import com.cac.scoreboardjava.mapper.RaceMapper;
import com.cac.scoreboardjava.pojo.Race;
import com.cac.scoreboardjava.pojo.Team;
import com.cac.scoreboardjava.service.RaceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceServiceImpl implements RaceService {
    private final RaceMapper raceMapper;

    public RaceServiceImpl(RaceMapper raceMapper) {
        this.raceMapper = raceMapper;
    }

    @Override
    public Race getCurrentRace() {
        return raceMapper.getCurrentRace();
    }

    @Override
    public List<Race> listRaces() {
        List<Race> races = raceMapper.listRaces();
        for(Race race : races){
            race.setTeam1(raceMapper.getTeamByID(race.getTeam1_id()));
            race.setTeam2(raceMapper.getTeamByID(race.getTeam2_id()));
        }
        return races;
    }

    @Override
    public void createRace(Race race) {
        raceMapper.createRace(race);
    }

    @Override
    public void deleteRace(int raceId) {
        raceMapper.deleteRaceByID(raceId);
    }

    @Override
    public void changeRace(Race race) {

    }

    @Override
    public List<Team> listTeams() {
        return raceMapper.listTeams();
    }
}
