package baiTap01_ordermanagement.strategy;

import baiTap01_ordermanagement.model.Order;

public class StandardShipment implements ShipmentStrategy {

    @Override
    public void ship(Order order) {
        System.out.println("Vận chuyển đơn hàng theo phương thức tiêu chuẩn.");
    }
}