package baiTap01_ordermanagement.strategy;

import baiTap01_ordermanagement.model.Order;

// Lớp PaypalPayment: Thanh toán bằng Paypal
public class PaypalPayment implements PaymentStrategy {
    private String email;

    public PaypalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(Order order) {
        System.out.println("Thanh toán qua PayPal.");
    }
}
