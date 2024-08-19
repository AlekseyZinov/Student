import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listGrades = new ArrayList<>();
        listGrades.add(3);
        listGrades.add(4);
        listGrades.add(5);

        Student student = new Student("Иван");
        Student student1 = new Student("Николай", listGrades);

        student.addGrades(4);
        student.addGrades(5);

        System.out.println(student);
        System.out.println(student1);
    }
}
