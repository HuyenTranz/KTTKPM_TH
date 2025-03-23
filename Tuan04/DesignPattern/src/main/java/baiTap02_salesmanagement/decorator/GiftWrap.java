package baiTap02_salesmanagement.decorator;

import baiTap02_salesmanagement.model.Product;

public class GiftWrap extends ProductDecorator {

    public GiftWrap(Product product) {
        super(product);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gift Wrapped.");
    }
}
