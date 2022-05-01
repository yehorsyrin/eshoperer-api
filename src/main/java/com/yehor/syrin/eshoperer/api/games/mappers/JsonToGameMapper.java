package com.yehor.syrin.eshoperer.api.games.mappers;

import com.yehor.syrin.eshoperer.api.model.game.Game;
import org.json.JSONObject;



public interface JsonToGameMapper {

    Game mapValues(JSONObject jsonGame);
}
