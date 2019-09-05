package java8.exercise1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class School {

    private static List<Student> register(){
        Student s1 = new Student(1L,"A",Student.Gender.FEMALE,1, LocalDate.of(1999, Month.APRIL,10),Student.Department.AM);
        Student s2 = new Student(2L,"B",Student.Gender.MALE,2, LocalDate.of(1994, Month.DECEMBER,6),Student.Department.CS);
        Student s3 = new Student(3L,"C",Student.Gender.MALE,3, LocalDate.of(1992, Month.SEPTEMBER,27),Student.Department.CL);
        Student s4 = new Student(4L,"D",Student.Gender.MALE,4, LocalDate.of(1993, Month.NOVEMBER,26),Student.Department.EL);
        Student s5 = new Student(5L,"E",Student.Gender.FEMALE,5, LocalDate.of(1996, Month.MAY,17),Student.Department.EE);
        Student s6 = new Student(6L,"F",Student.Gender.FEMALE,6, LocalDate.of(1923, Month.APRIL,16),Student.Department.CS);
        Student s7 = new Student(7L,"G",Student.Gender.MALE,7, LocalDate.of(1959, Month.AUGUST,13),Student.Department.EL);
        Student s8 = new Student(8L,"H",Student.Gender.FEMALE,8, LocalDate.of(1996, Month.FEBRUARY,24),Student.Department.CN);
        Student s9 = new Student(9L,"I",Student.Gender.FEMALE,9, LocalDate.of(1925, Month.MARCH,1),Student.Department.CS);
        Student s10 = new Student(10L,"J",Student.Gender.FEMALE,10, LocalDate.of(1952, Month.JANUARY,25),Student.Department.AM);
        Student s11 = new Student(11L,"K",Student.Gender.MALE,11, LocalDate.of(1935, Month.FEBRUARY,20),Student.Department.CL);
        Student s12 = new Student(12L,"L",Student.Gender.MALE,12, LocalDate.of(1963, Month.JANUARY,12),Student.Department.EL);

        return Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12);
    }

    private static void log(String prefix,Object content){
        System.out.println(prefix + content);
    }

    public static void main(String[] args) {
        List<Student> students = register();
//        log("",students);

        //total number;
        long studentCount = students.stream().mapToLong(s -> 1L).sum();
        log("Total of student is: " ,studentCount);

        //total credits
        long totalCredits = students.stream().mapToLong(Student::getCredit).sum();
        log("Total of credits is: ",totalCredits);

        Map<Student.Gender,Long> groupCountByGender = students.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
        log("Student total by gender is: " ,groupCountByGender);

        Optional<Student> maxCredit = students.stream().max((s1,s2)->s1.getCredit() - s2.getCredit());

//        Optional<Student> maxCredit = students.stream().max(Comparator.comparingInt(Student::getCredit));
//        if(maxCredit.isPresent()){
//            log("Max credit is: ",maxCredit.get().getName());
//        }

        maxCredit.ifPresent(student -> log("Max credit is: ",student.getName()));

        boolean allMale = students.stream().allMatch(Student::isFemale);
        log("If all students male? ",allMale);

        boolean isMale = students.stream().anyMatch(Student::isFemale);
        log("If exist students male? ",isMale);

        LongSummaryStatistics studentsStats = students.stream().map(Student::getCredit).collect(LongSummaryStatistics::new,LongSummaryStatistics::accept,LongSummaryStatistics::combine);
        log("Stats: ",studentsStats);

        Double creditAvg = students.stream().collect(Collectors.averagingDouble(Student::getCredit));
        log("Stats average: ",creditAvg);

        Map<String,Integer> studentMap = students.stream().collect(Collectors.toMap(Student::getName,Student::getCredit));
        log("Students with credit: ",studentMap);

        String names = students.stream().filter(Student::isFemale).map(Student::getName).collect(Collectors.joining(", ","Congratulations!"," Welcome joining Java Club"));
        log("",names);
    }
}

