package patterns.strategy;

import graphisme.Figure;

import java.lang.reflect.Field;
import java.util.List;

public interface Strategy {
    public void traiter(List<Figure> figures);
}
