package three;

import java.lang.reflect.Field;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        Class<?> clazz = student.getClass();
        System.out.println("类的名称: " + clazz.getCanonicalName());

        try {
            Field id = clazz.getDeclaredField("id");
            System.out.println("before id: " + student.getId());
            id.setAccessible(true);
            id.setInt(student,12);
            System.out.println("after id: " + student.getId());

            Field name = clazz.getDeclaredField("name");
            System.out.println("before name: " + student.getName());
            name.setAccessible(true);
            name.set(student,"抗压");
            System.out.println("after name: " + student.getName());

            Field male = clazz.getDeclaredField("male");
            System.out.println("before male: " + student.isMale());
            male.setAccessible(true);
            male.set(student,true);
            System.out.println("after male: " + student.isMale());

            Field account = clazz.getDeclaredField("account");
            System.out.println("before account: " + student.getAccount());
            account.setAccessible(true);
            account.set(student,123.456);
            System.out.println("after account: " + student.getAccount());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}