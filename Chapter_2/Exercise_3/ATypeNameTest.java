public class ATypeNameTest {
    public static void main(String[] args) {
        class ATypeName {
            int i;
            double d;
            boolean b;
            void show(){
                System.out.println("i=" + i);
                System.out.println("d=" + d);
                System.out.println("b=" + b);
            }
        }
        ATypeName aTypeName = new ATypeName();
        aTypeName.i = 10;
        aTypeName.d = 1.5;
        aTypeName.b = false;
        aTypeName.show();
    }
}
