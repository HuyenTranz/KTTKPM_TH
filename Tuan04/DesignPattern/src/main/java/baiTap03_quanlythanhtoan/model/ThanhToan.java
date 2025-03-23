package baiTap03_quanlythanhtoan.model;

import baiTap03_quanlythanhtoan.strategy.PhuongThucThanhToan;

public class ThanhToan {
    private PhuongThucThanhToan phuongThucThanhToan;

    public ThanhToan(PhuongThucThanhToan phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(PhuongThucThanhToan phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    public void thucHienThanhToan(double soTien) {
        phuongThucThanhToan.thanhToan(soTien);
    }
}
