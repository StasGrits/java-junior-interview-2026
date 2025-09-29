package collections;

public class Student {

       String name;
       double grade;
      int course;

     Student(String name, double grade, int course) {
          this.name = name;
        this.grade = grade;
          this.course = course;
      }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", course=" + course +
                '}';
    }
}
