package com.backendproject.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendproject.dslist.dto.GameMinDTO;
import com.backendproject.dslist.entities.Game;
import com.backendproject.dslist.repositories.GameRepository;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;


    public List<Game> findAll(){
       var result = gameRepository.findAll();
       return result;
    }
}
