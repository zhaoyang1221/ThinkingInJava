package exercise_11;

public class Rainbow {

    public static void main(String[] args) {
        AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow();
        int newHue = 88;
        System.out.println("hue: " + allTheColorsOfTheRainbow.hue);
        allTheColorsOfTheRainbow.changeTheHueOfTheColor(newHue);
        System.out.println("newHue:"+ allTheColorsOfTheRainbow.hue);
    }
}
