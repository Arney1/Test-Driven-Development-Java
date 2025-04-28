package com.mycompany.app;

public class Passenger {

    private String name;
    private boolean vip;

    public Passenger(String name, boolean vip) {
        this.name = name;
        this.vip = vip;
    }

    public String getName() {
        return this.name;
    }

    public boolean isVip() {
        return this.vip;
    }
}
