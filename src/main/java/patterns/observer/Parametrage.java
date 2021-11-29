package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Parametrage implements Observable {
    private int epaisseurContour=2;
    private int couleurContour=255;
    private int couleurRemplissage=127;
    public List<Observer> observers=new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
       for (Observer observer:observers){
           observer.update(this);
       }
    }

    public void setEpaisseurContour(int epaisseurContour) {
        this.epaisseurContour = epaisseurContour;
        notifyObservers();
    }

    public void setCouleurContour(int couleurContour) {
        this.couleurContour = couleurContour;
        notifyObservers();
    }

    public void setCouleurRemplissage(int couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
        notifyObservers();
    }

    public int getEpaisseurContour() {
        return epaisseurContour;
    }

    public int getCouleurContour() {
        return couleurContour;
    }

    public int getCouleurRemplissage() {
        return couleurRemplissage;
    }
}
