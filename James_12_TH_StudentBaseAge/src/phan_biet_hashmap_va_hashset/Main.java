package phan_biet_hashmap_va_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Duy",27,"Thuan An");
        Student student2 = new Student("Hung",28,"Thuan An");
        Student student3 = new Student("Ha",29,"Thuan An");
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
//        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
//            System.out.println(student.toString());
//        }
        for(Integer key : studentMap.keySet()) {
            System.out.println(key + "=" + studentMap.get(key));
        }
        System.out.println(".......Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        for (Student student: students){
            System.out.println(student.toString());
        }

    }
}
