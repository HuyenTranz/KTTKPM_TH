package baiTap.model;

import baiTap.observer.Observer;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(String message) {
        System.out.println("User " + name + " received notification: " + message);
    }
}
