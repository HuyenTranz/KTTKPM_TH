package baiTap03_quanlythanhtoan.decorator;

import baiTap03_quanlythanhtoan.strategy.PhuongThucThanhToan;

public class PhiXuLy extends TrangTriThanhToan {

    public PhiXuLy(PhuongThucThanhToan thanhToan) {
        super(thanhToan);
    }

    @Override
    public void thanhToan(double soTien) {
        double phiXuLy = 0.05 * soTien;
        thanhToan.thanhToan(soTien + phiXuLy);
        System.out.println("Phí xử lý: " + phiXuLy + " VND");
    }
}
