package baiTap01_ordermanagement.strategy;

import baiTap01_ordermanagement.model.Order;

public interface PaymentStrategy {
    void pay(Order order);  // Phương thức thanh toán theo chiến lược
}