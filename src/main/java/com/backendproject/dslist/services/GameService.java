package com.backendproject.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backendproject.dslist.dto.GameDTO;
import com.backendproject.dslist.dto.GameMinDTO;
import com.backendproject.dslist.entities.Game;
import com.backendproject.dslist.projections.GameMinProjection;
import com.backendproject.dslist.repositories.GameRepository;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
       var entity = gameRepository.findAll();
       List<GameMinDTO> result = entity.stream().map(x -> new GameMinDTO(x)).toList();
       return result;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
       List<GameMinProjection> result = gameRepository.searchByList(listId);
       return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
