package org.programacionpatrones;

public class FileObserver implements Observer {
    private String name;

    public FileObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("El observador " + name + " recibió: " + message);
    }
}