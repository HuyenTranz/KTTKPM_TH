package demo_Observer;

public interface Observer {
    public void update();

    // Phương thức setSubject() dùng để liên kết Observer với một đối tượng Subject cụ thể.
    public void setSubject(Subject sub);
}
