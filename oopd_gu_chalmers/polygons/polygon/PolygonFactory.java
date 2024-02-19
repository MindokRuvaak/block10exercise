package oopd_gu_chalmers.polygons.polygon;

public class PolygonFactory {
    //  1a: In order to minimize dependencies:
    // What arguments should these methods take?
    // What should their result types be?
    // Implement the methods, and let DrawPolygons use them.
    // ... createTriangle ...
    // ... createRectangle ...
    // ... createSquare ...
    public static Polygon createPolygon(int x, int y, String type) {// bad
        switch (type) {
            case "Triangle":
                return createTriangle(x, y);
            case "Rectangle":
                return createRectangle(x, y);
            case "Square":
                return createSquare(x,y);
            default:
                throw new IllegalArgumentException("Only Triangle, Rectangle and Square implemented");
        }
    }
/*  better but the polygons implemented here don't support creating polygons of different size
    public static Polygon createPolygon(int x, int y, int nCorners, int sideLength) {
    }
    
    public static Polygon createPolygon(int x, int y, int nCorners, int width, int heigth) {
    } */

    public static Square createSquare(int x, int y) {
        return new Square(x, y);
    }

    public static Rectangle createRectangle(int x, int y) {
        return new Rectangle(x, y);
    }

    public static Triangle createTriangle(int x, int y) {
        return new Triangle(x, y);
    }
}

//  1c: Why should this class reside inside the
// oopd_gu_chalmers.polygons.polygon subpackage, and not in
// oopd_gu_chalmers.polygons together with DrawPolygons?
// can reach classes with 'package' access 

//  1d: Draw a UML class diagram over the new
// structure for the package. What is the public
// interface to the polygon subpackage now?

//  1e: See the concrete subclasses.

//  1f: Can we make the interface to the subpackage
// even more abstract, without losing functionality? How?
// have the polygon contain an array/list of points/coordinates that correspond to the corners of the polygon
// and the paint method can be moved up to the superclass since drawing lines between each of the points is the
// generic method of painting polygons

//  1g: How do these changes relate to our SOLID principles?
// Which principles are we striving to adhere to with these changes?
// DIP primarily, as well as OCP

//  1h: Can you see any drawbacks with introducing
// a PolygonFactory, instead of exposing the subclasses
// directly?
// if we want to add more polygons to the package the factory needs to be updated
// in order for client code to be alble to create any such polygons