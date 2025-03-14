package baiTap01_ordermanagement.state;

import baiTap01_ordermanagement.model.Order;

public class ProcessingOrder implements OrderState {

    @Override
    public void handleOrder(Order order) {
        System.out.println("Đóng gói và vận chuyển...");
        order.shipOrder();  // Tiến hành vận chuyển
        order.setState(new DeliveredOrder());  // Chuyển trạng thái sang "Đã giao"
    }
}
