package baiTap02_salesmanagement.strategy;

import baiTap02_salesmanagement.model.Product;

public class LuxuryTax implements TaxStrategy {
    @Override
    public double calculateTax(Product product) {
        return product.getPrice() * 0.15; // 15% thuế xa xỉ
    }
}
