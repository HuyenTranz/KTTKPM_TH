package model;

public interface Observer {
    // Phương thức update() được gọi khi Subject có thay đổi và cần thông báo cho Observer.
    public void update();

    // Phương thức setSubject() dùng để liên kết Observer với một đối tượng Subject cụ thể.
    public void setSubject(Subject sub);
}
