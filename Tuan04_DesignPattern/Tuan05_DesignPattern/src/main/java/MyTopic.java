import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject{

    private List<Observer> observers = new ArrayList<Observer>();
    private String message;

    @Override
    public void register(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
