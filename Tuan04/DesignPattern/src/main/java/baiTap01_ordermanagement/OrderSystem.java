package baiTap01_ordermanagement;

import baiTap01_ordermanagement.factory.OrderManager;
import baiTap01_ordermanagement.model.Order;

public class OrderSystem {

    public static void main(String[] args) {
        // Tạo Order Manager và tạo đơn hàng mới
        OrderManager orderManager = new OrderManager();
        Order order = orderManager.createOrder();

        // Kiểm tra các hành vi của đơn hàng
        order.handleOrder();  // Kiểm tra thông tin đơn hàng (Chuyển sang trạng thái "Đang xử lý")
        order.processPayment();  // Thực hiện thanh toán (Thanh toán bằng thẻ tín dụng)
        order.shipOrder();  // Vận chuyển đơn hàng
        order.decorateOrder();  // Trang trí đơn hàng (Thêm thông báo)

        order.handleOrder();  // Chuyển trạng thái sang "Đã giao"
        order.handleOrder();  // Chuyển trạng thái sang "Đã giao" (Hoàn tất)
    }
}
