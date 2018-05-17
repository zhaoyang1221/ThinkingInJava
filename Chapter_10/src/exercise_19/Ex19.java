package exercise_19;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/14 0014
 * Description:
 */
public class Ex19 {
    Ex19() { System.out.println("Ex19()"); }
    private class Ex19Inner {
        Ex19Inner() { System.out.println("Ex19Inner()"); }
        private class Ex19InnerInner {
            Ex19InnerInner() {
                System.out.println("Ex19InnerInner()");
            }
        }
    }
    private static class Ex19Nested {
        Ex19Nested() { System.out.println("Ex19Nested()"); }
        private static class Ex19NestedNested {
            Ex19NestedNested() {
                System.out.println("Ex19NestedNested()");
            }
        }
    }
    public static void main(String[] args) {
        Ex19Nested en = new Ex19Nested();
        Ex19Nested.Ex19NestedNested enn = new Ex19Nested.Ex19NestedNested();
        Ex19 e19 = new Ex19();
        Ex19.Ex19Inner ei = e19.new Ex19Inner();
        Ex19.Ex19Inner.Ex19InnerInner eii = ei.new Ex19InnerInner();
    }
}