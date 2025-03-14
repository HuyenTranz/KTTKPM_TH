package singletonPattern;

public class BillPughSingleton {
    // Private constructor để ngăn tạo đối tượng từ bên ngoài
    private BillPughSingleton() {}

    // Class bên trong được sử dụng để giữ thể hiện của Singleton
    private static class SingletonHelper {
        // Biến INSTANCE là final, được khởi tạo ngay khi SingletonHelper được nạp vào bộ nhớ
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // Phương thức cung cấp đối tượng Singleton
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    // Ví dụ sử dụng Singleton
    public static void main(String[] args) {
        BillPughSingleton singleton1 = BillPughSingleton.getInstance();
        BillPughSingleton singleton2 = BillPughSingleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Cả hai đối tượng là cùng một thể hiện (Singleton).");
        } else {
            System.out.println("Hai đối tượng là khác nhau.");
        }
    }
}
