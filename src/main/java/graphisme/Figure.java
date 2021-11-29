package graphisme;

import patterns.observer.Observer;
import patterns.observer.Parametrage;

import java.io.Serializable;

public abstract class Figure implements Serializable, Observer {
    protected int epaisseur;
    protected int couleurContour;
    protected int couleurRemplissage;
    protected int niveau;
    public abstract double getSurface();
    public abstract double getPerimetre();
    public abstract void dessiner();

    @Override
    public String toString() {
        return
                "epaisseur=" + epaisseur +
                ", couleurContour=" + couleurContour +
                ", couleurRemplissage=" + couleurRemplissage ;
    }

    public int getEpaisseur() {
        return epaisseur;
    }

    public void setEpaisseur(int epaisseur) {
        this.epaisseur = epaisseur;
    }

    public int getCouleurContour() {
        return couleurContour;
    }

    public void setCouleurContour(int couleurContour) {
        this.couleurContour = couleurContour;
    }

    public int getCouleurRemplissage() {
        return couleurRemplissage;
    }

    public void setCouleurRemplissage(int couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
    }

    @Override
    public void update(Parametrage parametrage) {
        this.epaisseur=parametrage.getEpaisseurContour();
        this.couleurContour=parametrage.getCouleurContour();
        this.couleurRemplissage=parametrage.getCouleurRemplissage();
    }
    protected String tabs(){
        String tabs="";
        for (int i = 0; i <niveau ; i++) {
            tabs+="\t";
        }
        return tabs;
    }
}
