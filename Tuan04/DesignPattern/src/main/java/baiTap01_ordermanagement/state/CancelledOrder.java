package baiTap01_ordermanagement.state;

import baiTap01_ordermanagement.model.Order;

public class CancelledOrder implements OrderState {

    @Override
    public void handleOrder(Order order) {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
        // Đơn hàng bị hủy, kết thúc quá trình.
    }
}
