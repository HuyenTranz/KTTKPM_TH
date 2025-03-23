package baiTap02_salesmanagement.strategy;

import baiTap02_salesmanagement.model.Product;

public class VATTax implements TaxStrategy {
    @Override
    public double calculateTax(Product product) {
        return product.getPrice() * 0.08; // 8% VAT
    }
}
