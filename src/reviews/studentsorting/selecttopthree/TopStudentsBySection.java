package reviews.studentsorting.selecttopthree;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private String section;
    private int marks;

    public Student(String name, String section, int marks) {
        this.name = name;
        this.section = section;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class TopStudentsBySection {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", "A", 85),
            new Student("Bob", "A", 92),
            new Student("Charlie", "A", 78),
            new Student("David", "A", 95),
            new Student("Eve", "B", 88),
            new Student("Frank", "B", 91),
            new Student("Grace", "B", 76),
            new Student("Heidi", "B", 89),
            new Student("Ivan", "C", 93),
            new Student("Judy", "C", 82),
            new Student("Mallory", "C", 97),
            new Student("Niaj", "C", 85)
        );

        // Group students by section
        Map<String, List<Student>> topStudentsBySection = students.stream()
            .collect(Collectors.groupingBy(
                Student::getSection,
                Collectors.collectingAndThen(
                    Collectors.toList(),
                    list -> list.stream()
                        .sorted(Comparator.comparingInt(Student::getMarks).reversed())
                        .limit(3)
                        .collect(Collectors.toList())
                )
            ));

        // Print results
        topStudentsBySection.forEach((section, topStudents) -> {
            System.out.println("Section " + section + " Top 3: " + topStudents);
        });
    }
}
