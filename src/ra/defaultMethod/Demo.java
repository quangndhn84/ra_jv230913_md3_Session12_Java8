package ra.defaultMethod;

public interface Demo {
    void inputData();
    void displayData();
    default void writeDataToFile(){
        System.out.println("Bạn vừa ghi ra file");
    }
    static void readDataFromFile(){
        System.out.println("Bạn vừa đọc file");
    }
}
