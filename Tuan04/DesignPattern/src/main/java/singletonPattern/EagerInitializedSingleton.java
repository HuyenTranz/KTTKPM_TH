package singletonPattern;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new
            EagerInitializedSingleton();

    //private constructor to avoid client applications to use
    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    // Phương thức ghi log
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }

    public static void main(String[] args) {
        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();

        instance1.log("Ứng dụng khởi động.");
        instance2.log("Người dùng đăng nhập.");

        if (instance1 == instance2) {
            System.out.println("Cả hai logger đều là cùng một thể hiện (Singleton).");
        } else {
            System.out.println("Logger là các thể hiện khác nhau.");
        }
    }
}