import Model.Student;
import Model.StudentService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("001", "Name", "Nam", 1999, 10.0);
        Student student2 = new Student("002", "Name", "Nam", 1999, 10.0);
        StudentService service = new StudentService();
        service.add(student);
        service.delete("001");
        service.add(student2);
    }
}