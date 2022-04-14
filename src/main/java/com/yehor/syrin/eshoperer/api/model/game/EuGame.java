package com.yehor.syrin.eshoperer.api.model.game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EuGame extends Game{

   private String type;
   private String img;
   private String description;
   private List<String> languageAvailability = new ArrayList<>();
   private int popularity;
   private List<String> gameCategory;
   private String rawJson;
}
