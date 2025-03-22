package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class MyTopic implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(model.Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(model.Observer obj) {
        observers.remove(obj);
  }

    @Override
    public void notifyObservers() {

    }

    @Override
    public Object getUpdate(model.Observer obj) {
        return null;
    }
}
