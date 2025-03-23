package baiTap03_quanlythanhtoan.strategy;

public class ThanhToanBangPayPal implements PhuongThucThanhToan {
    @Override
    public void thanhToan(double soTien) {
        System.out.println("Thanh toán bằng PayPal: " + soTien + " VND");
    }
}
