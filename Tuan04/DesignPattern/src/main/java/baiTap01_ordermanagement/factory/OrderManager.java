package baiTap01_ordermanagement.factory;

import baiTap01_ordermanagement.decorator.NotificationDecorator;
import baiTap01_ordermanagement.model.Order;
import baiTap01_ordermanagement.state.NewOrder;
import baiTap01_ordermanagement.strategy.CreditCardPayment;
import baiTap01_ordermanagement.strategy.StandardShipment;

public class OrderManager {

    public Order createOrder() {
        Order order = new Order();
        order.setState(new NewOrder());  // Khởi tạo trạng thái đơn hàng là "Mới tạo"
        order.setPaymentStrategy(new CreditCardPayment());  // Mặc định là thanh toán bằng thẻ tín dụng
        order.setShipmentStrategy(new StandardShipment());  // Mặc định vận chuyển theo phương thức tiêu chuẩn
        order.setOrderDecorator(new NotificationDecorator());  // Áp dụng NotificationDecorator
        return order;
    }
}