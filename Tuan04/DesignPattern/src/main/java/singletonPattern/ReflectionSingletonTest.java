package singletonPattern;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;

        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();

            for (Constructor constructor : constructors) {
                // Phá vỡ Singleton bằng cách cho phép truy cập vào private constructor
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // In ra mã băm (hashcode) của hai đối tượng
        System.out.println("Instance One HashCode: " + instanceOne.hashCode());
        System.out.println("Instance Two HashCode: " + instanceTwo.hashCode());
    }
}

