package org.patrones;
import java.util.ArrayList;
import java.util.List;

public class File implements FileComponent {
    private String name;
    private List<Observer> observers = new ArrayList<>();

    public File(String name) {
        this.name = name;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("El archivo " + name + " ha cambiado.");
        }
    }

    @Override
    public void showDetails() {
        System.out.println("Archivo: " + name);
    }

    public void change() {
        notifyObservers();
    }

    // Implementamos los métodos add y remove pero lanzamos una excepción
    @Override
    public void add(FileComponent file) {
        throw new UnsupportedOperationException("No se puede agregar un archivo a un archivo.");
    }

    @Override
    public void remove(FileComponent file) {
        throw new UnsupportedOperationException("No se puede eliminar un archivo de un archivo.");
    }
}