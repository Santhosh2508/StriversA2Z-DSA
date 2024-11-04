import java.sql.SQLOutput;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        List<Student> studentlist = new ArrayList<>() ;

        studentlist.add(new Student(2,"santhosh"));
        studentlist.add(new Student(1,"demo") );

        System.out.println(studentlist);
        Collections.sort(studentlist , Comparator.<Student>reverseOrder());
        System.out.println(studentlist);

    }
    }


class Student implements Comparable<Student> {

    int rollno;
    String name;

        public Student(int rollno, String name) {
            this.rollno = rollno;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return rollno == student.rollno && name == student.name;
        }

        @Override
        public int hashCode() {
            return Objects.hash(rollno, name);
        }

    @Override
    public int compareTo(Student that) {
        return this.rollno - that.rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

}