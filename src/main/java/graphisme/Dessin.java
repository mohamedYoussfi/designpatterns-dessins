package graphisme;

import patterns.strategy.Strategy;
import patterns.strategy.StrategyImpl1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Dessin implements Serializable {
    private List<Figure> figures=new ArrayList<>();
    private transient Strategy strategy=new StrategyImpl1();

    public Figure add(Figure figure){
        figures.add(figure);
        return figure;
    }
    public void supprimer(Figure figure){
        figures.remove(figure);
    }
    public void serialiser(String fileName) throws Exception {
        File file=new File(fileName);
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(this);
        objectOutputStream.close();
    }
    public void appliquerStrategyTraitement(){
        this.strategy.traiter(figures);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void dessiner(){
        for (Figure figure:figures){
            figure.dessiner();
        }
    }

    public static Dessin desserialiser(String fileName) throws Exception {
        File file=new File(fileName);
        FileInputStream fileInputStream=new FileInputStream(file);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Dessin dessin=(Dessin) objectInputStream.readObject();
        objectInputStream.close();
        return dessin;
    }
}
