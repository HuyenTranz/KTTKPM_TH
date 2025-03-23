package baiTap03_quanlythanhtoan.state;

public class DangChoXuLy implements TrangThaiThanhToan {

    @Override
    public void xuLyThanhToan() {
        System.out.println("Đang chờ xử lý thanh toán...");
    }
}
