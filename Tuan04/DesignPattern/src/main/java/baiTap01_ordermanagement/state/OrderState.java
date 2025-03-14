package baiTap01_ordermanagement.state;

import baiTap01_ordermanagement.model.Order;

// Interface đại diện cho các trạng thái của đơn hàng
public interface OrderState {
    void handleOrder(Order order);  // Phương thức xử lý hành vi theo trạng thái
}