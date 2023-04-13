package geometries;
import primitives.Point;
import primitives.Ray;
import primitives.Vector;

public class Cylinder extends Tube{
    private double height;

    public Cylinder(Ray axisRay, double radius ,double height) {
        super(axisRay,radius);
        this.height = height;
    }

    public Vector getNormal(Point point){
        return null;
    }
}
