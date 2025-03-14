package baiTap01_ordermanagement.strategy;

import baiTap01_ordermanagement.model.Order;

public class StandardShipping implements ShipmentStrategy {

    @Override
    public void ship(Order order) {
        System.out.println("Vận chuyển bằng phương thức tiêu chuẩn.");
    }
}
