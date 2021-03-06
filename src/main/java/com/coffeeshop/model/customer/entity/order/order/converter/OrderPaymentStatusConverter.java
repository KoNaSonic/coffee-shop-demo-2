package com.coffeeshop.model.customer.entity.order.order.converter;

import com.coffeeshop.model.customer.entity.order.order.status.OrderPaymentStatus;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class OrderPaymentStatusConverter implements AttributeConverter<OrderPaymentStatus, Integer> {

    @Override
    public Integer convertToDatabaseColumn(OrderPaymentStatus orderPaymentStatus) {
        return orderPaymentStatus == null ? OrderPaymentStatus.NO_INFO.getId() : orderPaymentStatus.getId();
    }

    @Override
    public OrderPaymentStatus convertToEntityAttribute(Integer integer) {
        return integer == null ? OrderPaymentStatus.NO_INFO : OrderPaymentStatus.getById(integer);
    }
}
