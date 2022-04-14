package com.yehor.syrin.eshoperer.api.games;

import com.yehor.syrin.eshoperer.api.model.game.Game;
import org.json.JSONObject;



public interface JsonToGameMapper<T extends Game> {

    T mapValues(JSONObject jsonGame);
}
