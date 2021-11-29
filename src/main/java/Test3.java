import graphisme.Dessin;
import patterns.strategy.StrategyImpl1;
import patterns.strategy.StrategyImpl2;

public class Test3 {
    public static void main(String[] args) throws Exception {
        Dessin dessin=Dessin.desserialiser("dessin1.data");
        dessin.dessiner();
        dessin.setStrategy(new StrategyImpl1());
        dessin.appliquerStrategyTraitement();
        dessin.setStrategy(new StrategyImpl2());
        dessin.appliquerStrategyTraitement();

    }
}
