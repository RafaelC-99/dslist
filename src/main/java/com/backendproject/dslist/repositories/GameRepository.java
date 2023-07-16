package com.backendproject.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendproject.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}