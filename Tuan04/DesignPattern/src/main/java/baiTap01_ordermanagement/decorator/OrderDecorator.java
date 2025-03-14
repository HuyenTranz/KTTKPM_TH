package baiTap01_ordermanagement.decorator;

import baiTap01_ordermanagement.model.Order;

public abstract class OrderDecorator {
    public abstract void decorate(Order order);  // Phương thức để trang trí đơn hàng
}
