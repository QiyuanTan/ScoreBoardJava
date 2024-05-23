package com.cac.scoreboardjava.mapper;

import com.cac.scoreboardjava.pojo.Race;
import com.cac.scoreboardjava.pojo.Team;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RaceMapper {
    Race getRaceByID(int id);

    @Select("SELECT * FROM races")
    List<Race> listRaces();

    void createRace(Race race);

    @Select("SELECT * FROM teams")
    List<Team> listTeams();

    Race getCurrentRace();

    void deleteRaceByID(int raceId);

    @Select("SELECT * FROM teams WHERE id = #{teamId}")
    Team getTeamByID(int teamID);
}
