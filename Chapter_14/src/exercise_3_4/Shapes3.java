package exercise_3_4;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/29 0029
 * Description:
 */
//: typeinfo/Shapes5.java
import java.util.*;

abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() { return "Circle"; }
}

class Square extends Shape {
    public String toString() { return "Square"; }
}

class Triangle extends Shape {
    public String toString() { return "Triangle"; }
}
class Rhomboid extends Shape {
    @Override
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes3 {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        for(Shape shape : shapeList)
            shape.draw();

        Rhomboid r = new Rhomboid();
        ((Shape)r).draw();

        //向上
        Shape s = r;
        s.draw();
        if (s instanceof Circle) {
            ((Circle)s).draw();
        } else System.out.println("(Shape)r is not a Circle");
        //inconvertible types
//        ((Circle)r).draw();
    }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
