package baiTap03_quanlythanhtoan;

import baiTap03_quanlythanhtoan.model.ThanhToan;
import baiTap03_quanlythanhtoan.strategy.*;
import baiTap03_quanlythanhtoan.decorator.*;
import baiTap03_quanlythanhtoan.state.*;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo phương thức thanh toán ban đầu
        PhuongThucThanhToan theTinDung = new ThanhToanBangTheTinDung();
        ThanhToan thanhToan = new ThanhToan(theTinDung);

        // Áp dụng Decorator Pattern
        PhuongThucThanhToan thanhToanPhiXuLy = new PhiXuLy(theTinDung);
        PhuongThucThanhToan thanhToanMaGiamGia = new MaGiamGia(thanhToanPhiXuLy);

        thanhToan.setPhuongThucThanhToan(thanhToanMaGiamGia);
        thanhToan.thucHienThanhToan(1000000);

        // Áp dụng State Pattern
        TrangThaiThanhToan trangThai = new DangChoXuLy();
        trangThai.xuLyThanhToan();

        trangThai = new DaHoanTat();
        trangThai.xuLyThanhToan();
    }
}
