package baiTap02_salesmanagement.strategy;

import baiTap02_salesmanagement.model.Product;

public interface TaxStrategy {
    double calculateTax(Product product);
}
