package org.patrones;

public class FolderObserver implements Observer{
    private String name;

    public FolderObserver(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println("El observador " + name + " recibió: " + message);
    }
}
