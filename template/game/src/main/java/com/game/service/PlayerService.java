package com.game.service;

import com.game.entity.Player;
import org.springframework.data.jpa.domain.Specification;

import org.springframework.data.domain.Pageable;
import java.util.NoSuchElementException;
import java.util.Optional;

public interface PlayerService {

    Iterable<Player>findAll(Specification<Player> specification, Pageable pageable);
    Optional<Player> findById(long id) throws NoSuchElementException;
    Integer getCount(Specification<Player>specification);
    Player create(Player player);
    Player update(Player player);
    void delete(Long id);

    boolean allValuesAreValidAndFilled(Player player);
    boolean allValuesAreValid(Player player);
    void assignFields(Player fromPlayer, Player toPlayer);
}
