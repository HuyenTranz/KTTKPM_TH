package singletonPattern;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;  // Biến lưu trữ đối tượng duy nhất của Singleton.

    // Private constructor để ngăn tạo đối tượng từ bên ngoài.
    private LazyInitializedSingleton() {}

    // Phương thức để lấy đối tượng duy nhất (Singleton) khi cần thiết.
    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {  // Chỉ khởi tạo đối tượng khi chưa được tạo.
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    // Ví dụ sử dụng Singleton
    public static void main(String[] args) {
        LazyInitializedSingleton singleton1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton singleton2 = LazyInitializedSingleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Cả hai đối tượng là cùng một thể hiện (Singleton).");
        } else {
            System.out.println("Hai đối tượng là khác nhau.");
        }
    }
}

