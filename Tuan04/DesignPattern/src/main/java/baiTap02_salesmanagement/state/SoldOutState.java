package baiTap02_salesmanagement.state;

import baiTap02_salesmanagement.model.Product;

public class SoldOutState implements ProductState {

    @Override
    public void handle(Product product) {
        System.out.println(product.getName() + " is sold out.");
    }
}
