public class DataOnlyTest {
    public static void main(String[] args) {
        class DataOnly{
            int i;
            double d;
            boolean b;
            void show(){
                System.out.println("i=" +i);
                System.out.println("d=" +d);
                System.out.println("b=" +b);
            }
        }
        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 10;
        dataOnly.d = 1.5;
        dataOnly.b = true;
        dataOnly.show();
    }
}
