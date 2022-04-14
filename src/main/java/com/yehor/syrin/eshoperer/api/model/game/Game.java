package com.yehor.syrin.eshoperer.api.model.game;

import com.yehor.syrin.eshoperer.api.model.PriceData;
import lombok.Data;


import java.util.ArrayList;
import java.util.List;


@Data
public abstract class Game {

    private List<String> nsuid = new ArrayList<>();
    private String title;
    private PriceData priceData;

}
