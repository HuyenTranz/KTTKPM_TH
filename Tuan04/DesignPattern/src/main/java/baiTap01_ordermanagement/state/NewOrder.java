package baiTap01_ordermanagement.state;

import baiTap01_ordermanagement.model.Order;

public class NewOrder implements OrderState {

    @Override
    public void handleOrder(Order order) {
        System.out.println("Kiểm tra thông tin đơn hàng...");
        order.setState(new ProcessingOrder());  // Chuyển trạng thái sang "Đang xử lý"
    }
}
