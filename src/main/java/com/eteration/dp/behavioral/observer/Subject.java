package com.eteration.dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public void add(Observer o) {
        observers.add(o);
    }

    public int getState() {
        return state;
    }

    public void setState(int value) {
        this.state = value;
        execute();
    }

    private void execute() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
