package baiTap01_ordermanagement.model;


import baiTap01_ordermanagement.decorator.OrderDecorator;
import baiTap01_ordermanagement.state.OrderState;
import baiTap01_ordermanagement.strategy.PaymentStrategy;
import baiTap01_ordermanagement.strategy.ShipmentStrategy;

public class Order {
    private OrderState state;
    private PaymentStrategy paymentStrategy;
    private ShipmentStrategy shipmentStrategy;
    private OrderDecorator orderDecorator;

    public Order() {
        state = new baiTap01_ordermanagement.state.NewOrder();  // Mặc định là trạng thái "Mới tạo"
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setShipmentStrategy(ShipmentStrategy shipmentStrategy) {
        this.shipmentStrategy = shipmentStrategy;
    }

    public void setOrderDecorator(OrderDecorator orderDecorator) {
        this.orderDecorator = orderDecorator;
    }

    public void handleOrder() {
        state.handleOrder(this); // Xử lý hành vi tùy theo trạng thái hiện tại
    }

    public void processPayment() {
        paymentStrategy.pay(this); // Xử lý thanh toán theo chiến lược
    }

    public void shipOrder() {
        shipmentStrategy.ship(this); // Xử lý vận chuyển theo chiến lược
    }

    public void decorateOrder() {
        if (orderDecorator != null) {
            orderDecorator.decorate(this); // Áp dụng decorator nếu có
        }
    }
}
