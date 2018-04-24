package exercise_15;

/**
 * @author zhaoyang on 2018/4/24 0024.
 */
import static net.mindview.util.Print.*;

class Glyph {
    void draw() { print("Glyph.draw()"); }
    Glyph() {
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int x = 2;
    private int y = 3;

    RectangularGlyph(int x, int y) {
        this.x = x;
        this.y = y;
        print("RectangularGlyph.RectangularGlyph(), x = " + x + " ; y = " + y);
    }
    void draw() {
        print("RectangularGlyph.RectangularGlyph(), x = " + x + " ; y = " + y);
    }

}
public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(3, 6);
    }
}
