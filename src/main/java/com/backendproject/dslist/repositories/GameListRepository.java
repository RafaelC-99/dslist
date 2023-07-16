package com.backendproject.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendproject.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
