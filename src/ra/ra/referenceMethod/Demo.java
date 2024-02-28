package ra.ra.referenceMethod;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> listStudentName = new ArrayList<>();
        listStudentName.add("Thịnh");
        listStudentName.add("Khôi");
        listStudentName.add("Khánh");
        //1. In ra tên các sinh viên
        listStudentName.forEach(studentName-> System.out.println(studentName));
        //2. Sử dụng biểu thức lambda và referenceMethod
        listStudentName.forEach(System.out::println);
    }
}
