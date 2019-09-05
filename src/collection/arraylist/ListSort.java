package collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("a",23));
        students.add(new Student("b",52));
        students.add(new Student("c",12));
        students.add(new Student("d",63));
        students.add(new Student("e",35));
        students.add(new Student("f",74));
        students.add(new Student("a",23));
        students.add(new Student("a",11));
        System.out.println(students);

        students.sort(Comparator.comparingInt(Student::getAge));

        System.out.println(students);
    }
}