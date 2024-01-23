package com.vtxlab.bootcamp;

public class App1 {

    private App2 app2;

    public App1(App2 app2) {
        this.app2 = app2;
    }

    // Developer A
    public int add(int x, int y) {
        return this.app2.provider()
    }

}
