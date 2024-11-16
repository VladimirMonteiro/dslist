package com.outercode.dslist.services;

import com.outercode.dslist.dto.GameDTO;
import com.outercode.dslist.dto.GameListDTO;
import com.outercode.dslist.dto.GameMinDTO;
import com.outercode.dslist.entities.Game;
import com.outercode.dslist.projections.GameMinProjection;
import com.outercode.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);

    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByIdList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }


    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        var result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }




}
