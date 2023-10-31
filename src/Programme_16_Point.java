/**
 * You have to represent a point in 2D space. Write a class with the name Point.
 * The class needs two fields (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor).
 * The second constructor has parameters x and y of type int and it needs to initialize the fields.
 */
public class Programme_16_Point {

    int x;
    int y;

    public Programme_16_Point() {}

    public Programme_16_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){return x;}
    public int getY(){return y;}

    public void setX(int a){this.x = a;}
    public void setY(int b){this.y = b;}

    public double distance(){return distance(0,0);}

    public double distance (int x, int y){
        return Math.sqrt(   (x-getX()) * (x-getX()) + (y-getY()) * (y-getY())   );
    }

    public double distance (Programme_16_Point point2){
        return distance (point2.x, point2.y);
    }

    public static void main(String[] args) { //main method
        Programme_16_Point first = new Programme_16_Point(6,5);
        Programme_16_Point second = new Programme_16_Point(3,1);
        System.out.println("Distance(0,0) = " + first.distance()); //print statement
        System.out.println("Distance(second) = " + first.distance(second)); //print statement
        System.out.println("Distance(2,2) = " + first.distance(2,2)); //print statement

        Programme_16_Point point = new Programme_16_Point(0,0);
        System.out.println("Distance() =  "  + point.distance()); //print statement
    }

}
