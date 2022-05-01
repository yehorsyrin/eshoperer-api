package com.yehor.syrin.eshoperer.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceData {

    private String country;
    private String salesStatus;
    private String currency;
    private String price;
    private String nsuid;
}
