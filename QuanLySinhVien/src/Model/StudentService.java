package Model;

import java.util.*;
import java.util.stream.Collectors;

public class StudentService {

    // kiểu dữ liệu List<Student> students = new ArrayList<>();
    private List<Student> students;

    public StudentService(List<Student> students) {
        this.students = students;
    }

    public StudentService() {
        this.students = new ArrayList<>();
    }

    public void add(Student sv) {
        this.students.add(sv);
    }

    // In danh sach sinh vien
    public void printStudents() {
        for (Student student :
                students) {
            System.out.println(student);
        }
    }

    public boolean isEmptyStudents() {
        return this.students.isEmpty();
    }

    //Lay ra so luong sinh vien trong danh sach
    public int getSizeOfStudents() {
        return this.students.size();
    }

    public void emptyStudents() {
        this.students.clear();
    }

    //    public Boolean kiemTraTonTai(SinhVien sv){
//        return this.danhSach.contains(sv);
//    }
//    // Xoa sinh vien ra khoi danh sach
    public boolean checkExist(String id){
        // tim
        Student student = students.stream()
                .filter(e -> Objects.equals(e.getMaSinhVien(), id))
                .findFirst()//lấy thằng đầu.
                .orElse(null); // nếu ko có thif trả ra null;
        return student != null;
    }
    public void delete(String maSV) {
        //[1,2,3,4]
        // 3
        students =  students.stream()
                .filter(e -> !Objects.equals(e.getMaSinhVien(), maSV))
                .collect(Collectors.toList());

//        boolean checkRemove = false;
//        Student sVRemove = null;
//        for (Student student : this.students) {
//            if (student.getMaSinhVien().equals(sv.getMaSinhVien())) {
//                sVRemove = student;
//                checkRemove = true;
//            }
//        }
//        if (checkRemove) {
//            this.students.remove(sVRemove);
//        }
//        return checkRemove;
    }
    public boolean kiemTraTonTai(Student sv) {
        return this.students.contains(sv);
    }
//
    public void timSinhVien(String ten) {
        for (Student student : students) {
            if(student.getHoVaTen().indexOf(ten)>=0) {
                System.out.println(student);
            }
        }
    }

    //Xuat ra danh sach sinh vien co diem tu cao den thap
    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(this.students, new Comparator<Student>() {
            @Override
            public int compare(Student sv1, Student sv2) {
                if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
                    return 1;
                } else if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
                    return -1;

                } else {
                    return 0;
                }
            }
        });
    }


}
