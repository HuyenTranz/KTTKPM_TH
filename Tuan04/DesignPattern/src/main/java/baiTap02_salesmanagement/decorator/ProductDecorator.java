package baiTap02_salesmanagement.decorator;

import baiTap02_salesmanagement.model.Product;

public abstract class ProductDecorator extends Product {
    protected Product product;

    public ProductDecorator(Product product) {
        super(product.getName(), product.getPrice());
        this.product = product;
    }

    @Override
    public void displayInfo() {
        product.displayInfo();
    }
}
