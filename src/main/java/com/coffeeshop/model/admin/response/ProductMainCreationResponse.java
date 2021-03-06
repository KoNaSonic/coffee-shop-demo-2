package com.coffeeshop.model.admin.response;

import com.coffeeshop.model.customer.entity.product.product.status.ProductType;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductMainCreationResponse {

    private Long id;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private String shortDescription;
    private String description;
    private String previewImage;
    private Double unitPrice;
    private ProductType productCategoryId;
    private Boolean available;
    private Integer version;
}
