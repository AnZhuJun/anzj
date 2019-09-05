package three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(3,"java",21));
        list.add(new Employee(2,"c",22));
        list.add(new Employee(4,"c++",23));

        for(Employee employee:list){
            System.out.println(employee);
        }

        System.out.println("After Sorting: ");
        Collections.sort(list);
        for(Employee employee:list){
            System.out.println(employee);
        }
    }
}
