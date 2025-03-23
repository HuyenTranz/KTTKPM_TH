package baiTap02_salesmanagement.strategy;

import baiTap02_salesmanagement.model.Product;

public class ConsumptionTax implements TaxStrategy {
    @Override
    public double calculateTax(Product product) {
        return product.getPrice() * 0.1; // 10% thuế tiêu thụ
    }
}
