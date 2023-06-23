package sap_xep_voi_comparable_va_comparator;

import phan_biet_hashmap_va_hashset.Student;

public class Student1 implements Comparable <Student1>{
    private String name;
    private int age;
    private String address;

    public Student1(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student1 student) {
        return this.getName().compareTo(student.getName());
    }


}
