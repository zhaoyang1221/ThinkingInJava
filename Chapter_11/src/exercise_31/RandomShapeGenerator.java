package exercise_31;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/22 0022
 * Description:
 */
//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
import java.util.*;

import static net.mindview.util.Print.print;

class Shape {
	public void draw() {}
	public void erase() {}
	public void amend() { System.out.println("Shape.amend()"); }
	@Override public String toString() { return "Shape";
	}
}
class Circle extends Shape {
	@Override public void draw() { print("Circle.draw()"); }
	@Override public void erase() { print("Circle.erase()"); }
	@Override public void amend() { print("Circle.amend()"); }
	@Override public String toString() { return "Circle"; }
}
class Square extends Shape {
	@Override public void draw() { print("Square.draw()"); }
	@Override public void erase() { print("Square.erase()"); }
	@Override public void amend() { print("Square.amend()"); }
	@Override public String toString() { return "Square"; }
}
class Triangle extends Shape {
	@Override public void draw() { print("Triangle.draw()"); }
	@Override public void erase() { print("Triangle.erase()"); }
	@Override public void amend() { print("Triangle.amend()"); }
	@Override public String toString() { return "Triangle"; }
}

public class RandomShapeGenerator implements Iterable<Shape>{
    private Random rand = new Random(47);

    private Shape[] shapes;
    public RandomShapeGenerator(int n) {
        shapes = new Shape[n];
        for(int i = 0; i < n; i++)
            shapes[i] = next();

    }
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;
            public boolean hasNext() {
                return index < shapes.length;
            }
            public Shape next() {
                return shapes[index++];
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    public Shape next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();

        }
    }

    public static void main(String[] args) {
        RandomShapeGenerator rsg = new RandomShapeGenerator(20);
        for(Shape s : rsg)
            System.out.println(s);
    }
} ///:~
