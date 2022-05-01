package com.yehor.syrin.eshoperer.api.games.mappers;

import com.yehor.syrin.eshoperer.api.model.game.Game;

import java.util.HashMap;
import java.util.List;

public interface GamesMapper {

    HashMap<String, List<Game>> mapGames(List<List<Game>> gamesLists);

}
