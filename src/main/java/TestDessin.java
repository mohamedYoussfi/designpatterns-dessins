import graphisme.*;

public class TestDessin {
    public static void main(String[] args) throws Exception {
        Dessin dessin=new Dessin();
        dessin.add(new Cercle(new Point(10,10),50));
        dessin.add(new Cercle(new Point(30,30),60));
        dessin.add(new Rectangle(new Point(60,10),60,120));
        GroupeFigures g1 = (GroupeFigures) dessin.add(new GroupeFigures());
        g1.addFigure(new Rectangle(new Point(30,30),10,120));
        g1.addFigure(new Cercle(new Point(50,60),30));
        dessin.dessiner();
        dessin.serialiser("dessin1.data");
    }
}
