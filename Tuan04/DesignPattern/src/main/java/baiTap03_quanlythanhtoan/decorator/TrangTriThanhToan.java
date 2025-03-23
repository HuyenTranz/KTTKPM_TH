package baiTap03_quanlythanhtoan.decorator;

import baiTap03_quanlythanhtoan.strategy.PhuongThucThanhToan;

public abstract class TrangTriThanhToan implements PhuongThucThanhToan {
    protected PhuongThucThanhToan thanhToan;

    public TrangTriThanhToan(PhuongThucThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }

    public abstract void thanhToan(double soTien);
}
