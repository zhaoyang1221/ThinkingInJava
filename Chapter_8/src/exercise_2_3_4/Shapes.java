package exercise_2_3_4;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/20 0020
 * To change this template use File | Settings | File Templates.
 * Description:
 */
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle.draw");
    }

    @Override
    public void erase() {
        System.out.println("Rectangle.erase()");
    }

    @Override
    public void printShape() {
        System.out.println("Rectangle.printShape()");
    }
}
public class Shapes {
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Fill up the array with shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // Make polymorphic method calls:
        for(Shape shp : s) {
//            shp.draw();
            shp.printShape();
        }
    }
} /* Output:
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Circle.draw()
*///:~
