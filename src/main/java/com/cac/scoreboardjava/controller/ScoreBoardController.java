package com.cac.scoreboardjava.controller;

import com.cac.scoreboardjava.pojo.Race;
import com.cac.scoreboardjava.pojo.Response;
import com.cac.scoreboardjava.pojo.Team;
import com.cac.scoreboardjava.service.RaceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class ScoreBoardController {
    final RaceService raceService;

    public ScoreBoardController(RaceService raceService) {
        this.raceService = raceService;
    }

    @GetMapping("/api/getCurrentRaceInfo")
    public Response<Race> getCurrentRaceInfo(){
        return Response.success(raceService.getCurrentRace());
    }

    @PostMapping("/api/changeRaceInfo")
    public Response<?> changeRaceInfo(){
        return Response.success();
    }

    @GetMapping("/api/listRaces")
    public Response<List<Race>> listRaces(){
        return Response.success(raceService.listRaces());
    }

    @GetMapping("/api/listTeams")
    public Response<List<Team>> listTeams(){
        return Response.success(raceService.listTeams());
    }

    @PostMapping("/api/createRace")
    public Response<?> createRace(Race race){
        try{
            raceService.createRace(race);
        } catch (Exception e) {
            return Response.error(e.getMessage());
        }
        return Response.success();
    }

    @DeleteMapping("/api/deleteRace")
    public Response<?> deleteRace(int raceId){
        try{
            raceService.deleteRace(raceId);
        } catch (Exception e) {
            return Response.error(e.getMessage());
        }
        return Response.success();
    }

    @PostMapping("/api/changeRace")
    public Response<?> changeRace(Race race){
        try{
            raceService.changeRace(race);
        } catch (Exception e) {
            return Response.error(e.getMessage());
        }
        return Response.success();
    }
}
