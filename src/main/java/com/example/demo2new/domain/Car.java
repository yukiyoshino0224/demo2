package com.example.demo2new.domain;

public class Car {
    private int speed;
    private String name;
    private int gas;
    
    public Car() {
    }

    public Car(int speed, String name, int gas) {
        this.speed = speed;
        this.name = name;
        this.gas = gas;
    }

    public String getGas() {
        return "gas";
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
