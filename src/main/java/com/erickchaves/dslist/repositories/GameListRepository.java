package com.erickchaves.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erickchaves.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
