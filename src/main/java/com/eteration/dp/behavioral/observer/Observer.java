package com.eteration.dp.behavioral.observer;
abstract class Observer {
    protected Subject subject;
    public abstract void update();
}