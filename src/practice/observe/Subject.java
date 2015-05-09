package practice.observe;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    
    private List<Observer> observers;
    private int state;
    
    public Subject() {
        observers = new ArrayList<Observer>();
    }
    
    public void attach(Observer ob) {
        observers.add(ob);
    }
    
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    
    public int getState() {
        return state;
    }
    
    public void notifyAllObservers() {
        for (Observer ob : observers) {
            ob.update();
        }
    }
    
    
}
