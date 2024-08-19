import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) >=2 && grades.get(i) <= 5) {
                this.grades = grades;
            } else {
                throw new IllegalArgumentException("not included in the range from 2 to 5");
            }
        }
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrades(int grade) {
        if (grade >= 2 && grade <= 5 ) {
            grades.add(grade);
        } else {
            throw new IllegalArgumentException("not included in the range from 2 to 5");
        }
    }

    @Override
    public String toString() {
        return name + ": " + grades;
    }
}
