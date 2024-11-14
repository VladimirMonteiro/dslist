package com.outercode.dslist.repositories;

import com.outercode.dslist.entities.BelongingPK;
import com.outercode.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
