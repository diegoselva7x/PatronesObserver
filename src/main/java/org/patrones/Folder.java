package org.patrones;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent {
    private String name;
    private List<FileComponent> fileComponents = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Carpeta: " + name);
        for (FileComponent fileComponent : fileComponents) {
            fileComponent.showDetails();
        }
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void add(FileComponent file) {
        fileComponents.add(file);
    }

    @Override
    public void remove(FileComponent file) {
        fileComponents.remove(file);
    }
}