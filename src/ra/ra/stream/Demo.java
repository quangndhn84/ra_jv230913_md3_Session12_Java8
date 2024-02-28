package ra.ra.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        Student student1 = new Student("SV001", "Nguyễn Văn A", 22);
        Student student2 = new Student("SV002", "Nguyễn Văn C", 18);
        Student student3 = new Student("SV003", "Nguyễn Văn D", 22);
        Student student4 = new Student("SV004", "Nguyễn Văn E", 22);
        Student student5 = new Student("SV005", "Nguyễn Văn F", 25);
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        listStudent.add(student5);
        //1. Duyệt và in ra các sinh viên trong danh sách sử dụng stream
        System.out.println("1. Các sinh viên trong danh sách: ");
        listStudent.stream().forEach(System.out::println);
        //2. in ra các sinh viên có tuổi lớn 22
        System.out.println("2. Các sinh viên có tuổi lớn hơn 22");
        listStudent.stream().filter(student -> student.getAge() > 22).forEach(System.out::println);
        System.out.println("Dữ liệu listStudent sau filter: ");
        listStudent.stream().forEach(System.out::println);
        //3. In ra sinh viên có tuổi lớn hơn hoăc bằng 22 bỏ qua sinh viên đầu tiên
        System.out.println("3.Các sinh viên có tuổi >=22, bỏ qua sinh viên đầu");
        listStudent.stream().filter(student -> student.getAge() >= 22).skip(1).forEach(System.out::println);
        //4. In ra 2 sinh viên có tuổi lớn hơn hoăc bằng 22 bỏ qua sinh viên đầu tiên
        System.out.println("3.In 2 sinh viên có tuổi >=22, bỏ qua sinh viên đầu");
        listStudent.stream().filter(student -> student.getAge() >= 22).skip(1).limit(2).forEach(System.out::println);
        //5. In ra các sinh viên với tuổi là năm sinh
        System.out.println("5. Các sinh viên với tuổi là năm sinh:");
        listStudent.stream().map(student -> {
            return new Student(student.getStudentId(), student.getStudentName(), 2024 - student.getAge());
        }).forEach(System.out::println);
        List<Student> listStudentYear = listStudent.stream().map(student -> {
            return new Student(student.getStudentId(), student.getStudentName(), 2024 - student.getAge());
        }).collect(Collectors.toList());
        //6. In ra thông tin sinh viên sắp xếp theo tuổi
        System.out.println("6. Danh sách sinh viên sắp xếp theo tuổi tăng dần: ");
        listStudent.stream().sorted(Comparator.comparing(Student::getAge)).forEach(System.out::println);
        //7. In ra thông tin sinh viên sắp xếp theo tuổi giảm dần
        System.out.println("7. Danh sách sinh viên sắp xếp theo tuổi giảm dần: ");
        listStudent.stream().sorted(Comparator.comparing(Student::getAge).reversed()).forEach(System.out::println);
        //8. In ra thông tin sinh viên sắp xếp theo tuổi tăng dần, các sinh viên bằng tuổi sắp xếp theo tên giảm dần
        System.out.println("8. Sắp xếp theo tuổi tăng dần và tên giảm dần:");
        listStudent.stream()
                .sorted(Comparator.comparing(Student::getAge)
                        .thenComparing(Student::getStudentName).reversed())
                .forEach(System.out::println);
        //9. Lưu các sinh viên có tuổi >=18 và <=22 ra 1 danh sách mới
        List<Student> listStudent18_22 = listStudent.stream()
                .filter(student -> student.getAge() >= 18 && student.getAge() <= 22)
                .collect(Collectors.toList());
        System.out.println("9. Danh sách các sinh viên có độ tuổi từ 18-22:");
        listStudent18_22.stream().forEach(System.out::println);
        //10. Kiểm tra trong listStudent có phần tử nào có tuổi lớn hơn 24 hay không
        System.out.println("10. Kiểm tra trong listStudent có phần tử nào có tuổi lớn hơn 24 hay không");
        System.out.println(listStudent.stream().anyMatch(student -> student.getAge()>24));
        //11. Kiểm tra trong listStudent tất cả các phần tử đều có tuổi lớn hơn 24 không
        System.out.println("11. Kiểm tra trong listStudent tất cả các phần tử đều có tuổi lớn hơn 24 không");
        System.out.println(listStudent.stream().allMatch(student -> student.getAge()>24));
        //12. Kiểm tra trong listStudent tất cả các phần tử đều có tuổi nhỏ hơn 26 hay không
        System.out.println(listStudent.stream().noneMatch(student -> student.getAge()>=26));
        //13. Tính số lượng sinh viên trong độ tuổi 18-22
        System.out.println("Số lượng sinh viên từ 18-22");
        System.out.println(listStudent.stream().filter(student -> student.getAge()>=18 && student.getAge()<=22).count());
        //14. In ra tuổi lớn nhất và nhỏ nhất
        System.out.println(listStudent.stream().max(Comparator.comparing(student -> student.getAge())).get());
        System.out.println(listStudent.stream().min(Comparator.comparing(student -> student.getAge())).get());


    }
}
