package baiTap01_ordermanagement.decorator;

import baiTap01_ordermanagement.model.Order;

public class NotificationDecorator extends OrderDecorator {

    @Override
    public void decorate(Order order) {
        System.out.println("Đơn hàng sẽ nhận thông báo khi trạng thái thay đổi.");
    }
}