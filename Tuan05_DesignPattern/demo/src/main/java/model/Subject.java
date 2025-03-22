package model;

public interface Subject {

    // Đăng ký một đối tượng Observer mới để theo dõi Subject.
    public void register(Observer obj);

    // Bỏ đăng ký một đối tượng Observer khỏi danh sách theo dõi.
    public void unregister(Observer obj);

    // Thông báo cho tất cả các Observer về một thay đổi.
    public void notifyObservers();

    // Trả về dữ liệu cập nhật cho một Observer cụ thể.
    public Object getUpdate(Observer obj);
}