package exercise_16;

// initialization/OverloadingDoc.java
// Demonstration of both constructor
// and ordinary method overloading.

class Tree {
    int height;

    /**
     * 无参构造函数
     * 初始化height为0
     */
    Tree() {
        System.out.println("Planting a seeding");
        height = 0;
    }

    /**
     * 带参数的构造函数
     * 初始化height为initialHeight
     * @param initialHeight 初始化height的值
     */
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new tree that is " + height + " feet tall");
    }

    /**
     * 打印Tree的基本信息
     */
    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    /**
     * 打印带有字符串s的Tree的基本信息
     * @param s 其他信息
     */
    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}

/**
 * 测试Tree类的构造函数
 */
public class OverloadingDoc {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloading method");
        }
        // Overloaded constructor:
        new Tree();
    }
}
