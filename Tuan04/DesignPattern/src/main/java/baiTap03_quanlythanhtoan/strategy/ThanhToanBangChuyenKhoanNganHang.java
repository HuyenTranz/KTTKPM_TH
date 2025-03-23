package baiTap03_quanlythanhtoan.strategy;

public class ThanhToanBangChuyenKhoanNganHang implements PhuongThucThanhToan {
    @Override
    public void thanhToan(double soTien) {
        System.out.println("Thanh toán bằng Chuyển Khoản Ngân Hàng: " + soTien + " VND");
    }
}
