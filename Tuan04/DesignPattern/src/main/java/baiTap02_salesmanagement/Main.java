package baiTap02_salesmanagement;

import baiTap02_salesmanagement.model.Product;
import baiTap02_salesmanagement.strategy.*;
import baiTap02_salesmanagement.decorator.*;
import baiTap02_salesmanagement.state.*;

public class Main {
    public static void main(String[] args) {
        // Tạo sản phẩm cơ bản
        Product phone = new Product("Smartphone", 1000);

        // Strategy Pattern: Tính toán thuế
        TaxStrategy consumptionTax = new ConsumptionTax();
        TaxStrategy vatTax = new VATTax();
        TaxStrategy luxuryTax = new LuxuryTax();

        double consumptionTaxAmount = consumptionTax.calculateTax(phone);
        double vatTaxAmount = vatTax.calculateTax(phone);
        double luxuryTaxAmount = luxuryTax.calculateTax(phone);

        System.out.println("Consumption Tax: $" + consumptionTaxAmount);
        System.out.println("VAT: $" + vatTaxAmount);
        System.out.println("Luxury Tax: $" + luxuryTaxAmount);

        // Decorator Pattern: Thêm các tính năng bổ sung cho sản phẩm
        Product specialPhone = new SpecialPackaging(phone);
        Product giftPhone = new GiftWrap(specialPhone);

        System.out.println("\nProduct with Decorators:");
        giftPhone.displayInfo();

        // State Pattern: Thay đổi trạng thái sản phẩm
        ProductState availableState = new AvailableState();
        ProductState soldOutState = new SoldOutState();

        System.out.println("\nState Pattern Demo:");
        availableState.handle(phone);
        soldOutState.handle(phone);
    }
}
