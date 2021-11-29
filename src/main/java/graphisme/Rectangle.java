package graphisme;

public class Rectangle extends Figure {
    private Point point;
    private double largeur;
    private double hauteur;

    public Rectangle(Point point, double largeur, double hauteur) {
        this.point = point;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public double getSurface() {
        return largeur*hauteur;
    }

    @Override
    public double getPerimetre() {
        return 2*(largeur+hauteur);
    }

    @Override
    public void dessiner() {
        System.out.println(tabs()+"Rectangle("+point.getX()+","+point.getY()+","+largeur+
                ","+hauteur+","+super.toString()+")");
    }
}
