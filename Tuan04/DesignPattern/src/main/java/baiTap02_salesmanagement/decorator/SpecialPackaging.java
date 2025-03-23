package baiTap02_salesmanagement.decorator;

import baiTap02_salesmanagement.model.Product;

public class SpecialPackaging extends ProductDecorator {

    public SpecialPackaging(Product product) {
        super(product);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Special Packaging included.");
    }
}
