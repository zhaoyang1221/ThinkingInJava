package exercise_6;

public class StorageTest {
    public static void main(String[] args) {
        class Storage{
           public int storage(String s) {
                return s.length() * 2;
            }
        }
        Storage storage = new Storage();
        String s = "abcd";
        int result = storage.storage(s);
        System.out.println(result);
    }
}
