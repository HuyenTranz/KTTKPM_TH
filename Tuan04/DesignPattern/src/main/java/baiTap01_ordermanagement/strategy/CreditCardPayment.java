package baiTap01_ordermanagement.strategy;

import baiTap01_ordermanagement.model.Order;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(Order order) {
        System.out.println("Thanh toán bằng thẻ tín dụng.");
    }
}