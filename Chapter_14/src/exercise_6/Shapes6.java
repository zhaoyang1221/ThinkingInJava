package exercise_6;//: typeinfo/Shapes.java

import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;

import java.util.*;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    boolean flag = false;

    public String toString() {
        return "Circle: flag = " + flag;
    }
}

class Square extends Shape {
    boolean flag = false;
    public String toString() {
        return "Square: flag = " + flag;
    }
}

class Triangle extends Shape {
    boolean flag = false;
    public String toString() {
        return "Triangle: flag = " + flag;
    }
}

public class Shapes6 {
    public static void setFlag(Shape s) {
        if (s instanceof Circle) {
            ((Circle)s).flag = true;
        }
    }
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );
        for (Shape shape : shapeList)
            setFlag(shape);

        for (Shape shape : shapeList)
            System.out.println(shape);
    }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
