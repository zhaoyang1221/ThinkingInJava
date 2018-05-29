package exercise_28;//: io/BlipCheck.java
// Simple use of Externalizable & a pitfall.
import java.io.*;
import static net.mindview.util.Print.*;

class Blip1 implements Externalizable {
  public Blip1() {
    print("Blip1 Constructor");
  }
  public void writeExternal(ObjectOutput out)
          throws  IOException {
    print("Blip1.writeExternal");
  }
  public void readExternal(ObjectInput in)
          throws IOException, ClassNotFoundException {
    print("Blip1.readExternal");
  }
}

public class BlipCheck implements Externalizable {
  // javac will automatically create a default constructor
  // if no constructors are defined, so don't need:
  // BlipCheck() {
  //	print("BlipCheck Constructor");
  // }
  public void writeExternal(ObjectOutput out)
          throws IOException {
    print("BlipCheck writeExternal");
  }
  public void readExternal(ObjectInput in)
          throws IOException, ClassNotFoundException {
    print("BlipCheck readExternal");
  }
}

class Blips {
//  public static void main(String[] args)
//          throws IOException, ClassNotFoundException {
//    print("Constructing objects:");
//    Blip1 b1 = new Blip1();
//    Blip2 b2 = new Blip2();
//    BlipCheck bc = new BlipCheck();
//    ObjectOutputStream o = new ObjectOutputStream(
//            new FileOutputStream("Blips.out"));
//    print("Saving objects:");
//    o.writeObject(b1);
//    o.writeObject(b2);
//    o.writeObject(bc);
//    o.close();
//    // Now get them back:
//    ObjectInputStream in = new ObjectInputStream(
//            new FileInputStream("Blips.out"));
//    print("Recovering b1:");
//    b1 = (Blip1)in.readObject();
//    print("Recovering b2:");
//    b2 = (Blip2)in.readObject();
//    print("Recovering bc:");
//    bc = (BlipCheck)in.readObject();
//  }
}
