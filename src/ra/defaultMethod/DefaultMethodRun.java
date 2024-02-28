package ra.defaultMethod;

public class DefaultMethodRun {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.writeDataToFile();
        Demo2 d2 = new Demo2();
        d2.writeDataToFile();
        Demo.readDataFromFile();
    }
}
