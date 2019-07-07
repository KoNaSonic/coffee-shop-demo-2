package com.coffeeshop.model.web.productDetails;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class ProductDetailsDTOResponse {

    private Long productId;
    private String productName;
    private Integer quantityAvailableKg;

    @Singular
    private List<String> images;

    ProductCharacteristicsDTOResponse characteristicsDTO;

    private String description;

    InStockDTOResponse inStockDTO;

    private Double unitPrice;
}
