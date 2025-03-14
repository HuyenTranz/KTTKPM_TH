package singletonPattern;

import java.io.*;
import java.lang.reflect.Constructor;

public class SerializedSingleton implements Serializable {
    private static final long serialVersionUID = -7604766932017737115L;
    private static boolean instanceCreated = false;  // Dùng để chống Reflection

    private SerializedSingleton() {
        if (instanceCreated) {  // Nếu đối tượng đã tồn tại, ném lỗi
            throw new RuntimeException("Cannot create instance. Use getInstance() method.");
        }
        instanceCreated = true;
    }

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    // Đảm bảo rằng đối tượng sau khi Deserialize vẫn là Singleton
    protected Object readResolve() {
        return getInstance();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Test phá vỡ Singleton bằng Serialization
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();

        // Ghi đối tượng ra file (Serialization)
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        // Đọc đối tượng từ file (Deserialization)
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("Instance One HashCode = " + instanceOne.hashCode());
        System.out.println("Instance Two HashCode = " + instanceTwo.hashCode());

        // Test phá vỡ Singleton bằng Reflection
        try {
            Constructor<?>[] constructors = SerializedSingleton.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                constructor.setAccessible(true);
                SerializedSingleton instanceThree = (SerializedSingleton) constructor.newInstance();
                System.out.println("Instance Three HashCode (Reflection) = " + instanceThree.hashCode());
            }
        } catch (Exception e) {
            System.out.println("Reflection failed to create a new instance: " + e.getMessage());
        }
    }
}
