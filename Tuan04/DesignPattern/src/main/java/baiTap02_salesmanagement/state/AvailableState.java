package baiTap02_salesmanagement.state;

import baiTap02_salesmanagement.model.Product;

public class AvailableState implements ProductState {

    @Override
    public void handle(Product product) {
        System.out.println(product.getName() + " is available for purchase.");
    }
}
