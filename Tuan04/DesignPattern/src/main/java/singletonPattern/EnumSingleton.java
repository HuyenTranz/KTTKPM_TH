package singletonPattern;

public enum EnumSingleton {
    INSTANCE;  // Thể hiện duy nhất của EnumSingleton

    public void doSomething() {
        System.out.println("Doing something with EnumSingleton...");
    }

    public static void main(String[] args) {
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;

        singleton1.doSomething();

        if (singleton1 == singleton2) {
            System.out.println("Cả hai đối tượng là cùng một thể hiện (Singleton).");
        } else {
            System.out.println("Hai đối tượng là khác nhau.");
        }
    }
}
