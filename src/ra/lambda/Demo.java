package ra.lambda;

public class Demo {
    public static void main(String[] args) {
        IFunctionInterface i1 = new IFunctionInterface() {
            @Override
            public int add(int number1, int number2) {
                return number1 + number2;
            }
        };
        System.out.println("Tổng 2 số 5 và 10 là: " + i1.add(5, 10));
        //1. Sử dụng biểu thức lamda
        IFunctionInterface i2 = (int number1, int number2) -> {
            return number1 + number2;
        };
        System.out.println("Tổng 2 số 3 và 4 là: " + i2.add(3, 4));
        //2. Không sử dụng kiểu dữ liệu của các tham số
        IFunctionInterface i3 = (number1, number2) -> {
            return number1 + number2;
        };
        System.out.println("Tổng 2 số 2 và 4 là: " + i3.add(2, 4));
        //3. Không sử dụng {} và return
        IFunctionInterface i4 = (number1, number2) -> number1 + number2;
        System.out.println("Tổng 2 số 10 và 20 là: " + i4.add(10, 20));
    }
}
