package baiTap03_quanlythanhtoan.strategy;

public class ThanhToanBangTheTinDung implements PhuongThucThanhToan {
    @Override
    public void thanhToan(double soTien) {
        System.out.println("Thanh toán bằng Thẻ Tín Dụng: " + soTien + " VND");
    }
}
