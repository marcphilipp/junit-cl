package com.example;

public class Main {

    public void lookupTestClass() {
        assert getClass().getResourceAsStream("MainTest.class") == null;
    }

    public void lookupEngineClass() {
        assert getClass().getResourceAsStream("/org/junit/jupiter/engine/JupiterTestEngine.class") == null;
    }
}
