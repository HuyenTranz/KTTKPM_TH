package baiTap03_quanlythanhtoan.decorator;

import baiTap03_quanlythanhtoan.strategy.PhuongThucThanhToan;

public class MaGiamGia extends TrangTriThanhToan {

    public MaGiamGia(PhuongThucThanhToan thanhToan) {
        super(thanhToan);
    }

    @Override
    public void thanhToan(double soTien) {
        double giamGia = 0.1 * soTien;
        thanhToan.thanhToan(soTien - giamGia);
        System.out.println("Đã áp dụng mã giảm giá: " + giamGia + " VND");
    }
}
