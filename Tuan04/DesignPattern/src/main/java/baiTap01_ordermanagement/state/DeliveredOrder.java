package baiTap01_ordermanagement.state;

import baiTap01_ordermanagement.model.Order;

public class DeliveredOrder implements OrderState {

    @Override
    public void handleOrder(Order order) {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
        // Đơn hàng đã giao, kết thúc quá trình.
    }
}
