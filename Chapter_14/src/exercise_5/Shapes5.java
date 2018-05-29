package exercise_5;//: typeinfo/Shapes5.java

import java.util.*;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

public class Shapes5 {
    public static void rotate(Shape s) {
        if (!(s instanceof Circle)) {
            System.out.println(s + " rotate");
        }
    }

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );
        for (Shape shape : shapeList)
            shape.draw();
        System.out.println();
        for (Shape shape: shapeList) {
            rotate(shape);
        }
    }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
