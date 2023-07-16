package com.backendproject.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendproject.dslist.dto.GameMinDTO;
import com.backendproject.dslist.entities.Game;
import com.backendproject.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<Game> result = gameService.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO()).toList();
        return dto;
    }
}
