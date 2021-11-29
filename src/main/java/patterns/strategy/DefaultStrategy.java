package patterns.strategy;

import graphisme.Figure;

import java.util.List;

public class DefaultStrategy implements Strategy {
    @Override
    public void traiter(List<Figure> figures) {
        for(Figure figure:figures){
            System.out.println("Default Strategy");
            figure.setEpaisseur(23);
            figure.dessiner();
        }
    }
}
