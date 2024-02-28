package ra.defaultMethod;

public class Demo2 implements Demo{
    @Override
    public void inputData() {

    }

    @Override
    public void displayData() {

    }

    public void writeDataToFile(){
        System.out.println("Phương thức ghi ra file đã bị ghi đè");
    }

    public void readDataFromFile(){
        System.out.println("Bạn vừa ghi đè phương thức đọc file");
    }
}
