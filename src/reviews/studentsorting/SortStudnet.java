package reviews.studentsorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStudnet {

    public static void main(String[] args) {


        List<Student> students = Arrays.asList(new Student(10, "Ngawang"),
                new Student(12, "Tasi"),
                new Student(15, "Rohan"), new Student(20, "John")
        );


        students.stream().sorted(Comparator.comparingInt(Student::getStudentId)).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println();
        students.stream().sorted(Comparator.comparing(Student::getStudentName)).collect(Collectors.toList()).forEach(System.out::println);


    }
}
