package baiTap01_ordermanagement.strategy;

import baiTap01_ordermanagement.model.Order;

public interface ShipmentStrategy {
    void ship(Order order);
}
