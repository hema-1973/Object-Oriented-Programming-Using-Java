import java.util.Scanner;

abstract class Shape {
    int d1, d2;
    Scanner s = new Scanner(System.in);
  /*  Shape(int d1, int d2) {
        this.d1 = d1;
        this.d2 = d2;
    }*/
    abstract void printArea();
}
class Rectangle extends Shape {
       Rectangle() {
       // super(0, 0);
        System.out.print("Enter Length: ");
        this.d1 = s.nextInt();
        System.out.print("Enter Breadth: ");
        this.d2 = s.nextInt();
    }
    void printArea() {
        System.out.println("Area of Rectangle: " + (d1 * d2));
    }
}
class Triangle extends Shape {
    Triangle() {
      //  super(0, 0);
        System.out.print("Enter Base: ");
        this.d1 = s.nextInt();
        System.out.print("Enter Height: ");
        this.d2 = s.nextInt();
    }

    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * d1 * d2));
    }
}
class Circle extends Shape {
      Circle() {
        //super(0, 0);
        System.out.print("Enter Radius: ");
        this.d1 = s.nextInt();
    }

    void printArea() {
        System.out.println("Area of Circle: " + (3.14 * d1 * d1));
    }
}

public class Area {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.printArea();
        System.out.println();
        Triangle t = new Triangle();
        t.printArea();
        System.out.println();

        Circle c = new Circle();
        c.printArea();
    }
}