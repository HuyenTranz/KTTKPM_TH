package singletonPattern;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;  // Biến lưu trữ đối tượng duy nhất của Singleton

    // Private constructor để ngăn việc tạo đối tượng từ bên ngoài
    private StaticBlockSingleton() {}

    // Khối static dùng để khởi tạo instance
    static {
        try {
            instance = new StaticBlockSingleton();  // Khởi tạo đối tượng
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while creating singleton instance.");
        }
    }

    // Phương thức trả về đối tượng duy nhất của Singleton
    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    // Ví dụ sử dụng Singleton
    public static void main(String[] args) {
        StaticBlockSingleton singleton1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton singleton2 = StaticBlockSingleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Cả hai đối tượng là cùng một thể hiện (Singleton).");
        } else {
            System.out.println("Hai đối tượng là khác nhau.");
        }
    }
}