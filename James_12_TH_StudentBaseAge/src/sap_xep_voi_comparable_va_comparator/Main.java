package sap_xep_voi_comparable_va_comparator;

import phan_biet_hashmap_va_hashset.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student1 student1 = new Student1("Duy", 27, "Hai Phong");
        Student1 student2 = new Student1("Duyen", 25, "Hue");
        Student1 student3 = new Student1("Quoc", 24, "Quang Nam");
        Student1 student4 = new Student1("Nam", 28, "Binh Dinh");

        List<Student1> lists = new ArrayList<Student1>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        Collections.sort(lists);
        for (Student1 student : lists){
            System.out.println(student.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi: ");
        for(Student1 student: lists){
            System.out.println(student.toString());
        }
    }
}