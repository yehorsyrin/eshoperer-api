package com.yehor.syrin.eshoperer.api.model.game;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UsGame extends Game {

    private String img;
    private String description;
    private List<String> gameCategory;
    private String rawJson;

}
