package baiTap02_salesmanagement.state;

import baiTap02_salesmanagement.model.Product;

public interface ProductState {
    void handle(Product product);
}
