package graphisme;

import java.util.ArrayList;
import java.util.List;

public class GroupeFigures extends Figure{
    private List<Figure> figures=new ArrayList<>();

    public Figure addFigure(Figure figure){
        figure.niveau=this.niveau+1;
        figures.add(figure);
        return figure;
    }


    @Override
    public double getSurface() {
        return 0;
    }

    @Override
    public double getPerimetre() {
        return 0;
    }

    @Override
    public void dessiner() {
        System.out.println(tabs()+"Groupe:");
        for (Figure figure :figures){
            figure.dessiner();
        }
    }

    public List<Figure> getFigures() {
        return figures;
    }
}
