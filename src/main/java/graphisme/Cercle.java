package graphisme;

public class Cercle extends Figure {
    private Point centre;
    private double rayon;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public double getSurface() {
        return Math.PI*rayon*rayon;
    }

    @Override
    public double getPerimetre() {
        return 2*Math.PI*rayon;
    }

    @Override
    public void dessiner() {
        System.out.println(tabs()+"Cercle("+centre.getX()+","+centre.getY()+","+rayon+","+super.toString()+")");
    }
}
