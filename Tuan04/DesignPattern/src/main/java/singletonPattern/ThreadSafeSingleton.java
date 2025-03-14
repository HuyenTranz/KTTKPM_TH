package singletonPattern;

//public class ThreadSafeSingleton {
//    private static ThreadSafeSingleton instance;  // Biến lưu trữ đối tượng duy nhất của Singleton
//
//    // Private constructor để ngăn tạo đối tượng từ bên ngoài
//    private ThreadSafeSingleton() {}
//
//    // Phương thức lấy đối tượng Singleton được đồng bộ hóa (synchronized)
//    public static synchronized ThreadSafeSingleton getInstance() {
//        if (instance == null) {  // Chỉ khởi tạo đối tượng nếu chưa tồn tại
//            instance = new ThreadSafeSingleton();
//        }
//        return instance;
//    }
//
//    // Ví dụ sử dụng Singleton
//    public static void main(String[] args) {
//        ThreadSafeSingleton singleton1 = ThreadSafeSingleton.getInstance();
//        ThreadSafeSingleton singleton2 = ThreadSafeSingleton.getInstance();
//
//        if (singleton1 == singleton2) {
//            System.out.println("Cả hai đối tượng là cùng một thể hiện (Singleton).");
//        } else {
//            System.out.println("Hai đối tượng là khác nhau.");
//        }
//    }
//}

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;  // Biến lưu trữ đối tượng duy nhất của Singleton

    // Private constructor để ngăn tạo đối tượng từ bên ngoài
    private ThreadSafeSingleton() {}

    // Phương thức lấy đối tượng Singleton sử dụng Double-Checked Locking
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {  // Kiểm tra lần thứ nhất (không đồng bộ hóa)
            synchronized (ThreadSafeSingleton.class) {  // Khóa class để đảm bảo an toàn
                if (instance == null) {  // Kiểm tra lần thứ hai (đồng bộ hóa)
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    // Ví dụ sử dụng Singleton
    public static void main(String[] args) {
        ThreadSafeSingleton singleton1 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        ThreadSafeSingleton singleton2 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();

        if (singleton1 == singleton2) {
            System.out.println("Cả hai đối tượng là cùng một thể hiện (Singleton).");
        } else {
            System.out.println("Hai đối tượng là khác nhau.");
        }
    }
}
