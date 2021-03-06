package com.coffeeshop.converter.productCreationConverter.customer;

import com.coffeeshop.model.customer.entity.product.product.Product;
import com.coffeeshop.model.customer.entity.product.productCoffee.ProductCoffee;
import com.coffeeshop.model.customer.web.productDetails.ProductCharacteristicsDTOResponse;
import com.coffeeshop.model.customer.web.productDetails.ProductDetailsDTOResponse;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductDetailsResponseConverter {

    public ProductDetailsDTOResponse convertToResponse(Product product,
                                                       Integer productQuantity,
                                                       Integer productItem,
                                                       List images,
                                                       ProductCoffee productCoffee) {
        return ProductDetailsDTOResponse.builder()
                .productId(product.getId())
                .productName(product.getProductName())
                .description(product.getDescription())
                .shortDescription(product.getShortDescription())
                .images((Collection<? extends String>) images.stream()
                        .map(image -> image.toString()).collect(Collectors.toList()))
                .previewImage(product.getPreviewImage())
                .characteristics(ProductCharacteristicsDTOResponse.builder()
                        .strong(productCoffee.getStrong())
                        .sour(productCoffee.getSour())
                        .bitter(productCoffee.getBitter()).build())
                .amountAvailable(productQuantity)
                .price(product.getUnitPrice())
                .build();
    }
}
