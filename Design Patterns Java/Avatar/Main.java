import java.util.concurrent.CancellationException;

public class Main{
    public static void main(String[] args) {
      // create a classroom
      Classroom classroom = new Classroom("SE281");
      classroom.addStudent(new Student("bob", "b"));
      classroom.addStudent(new Student("bob", "b"));
      classroom.addStudent(new Student("bob", "b"));
      Classroom copy = classroom.clone();


      copy.getStudents().get(0).setName("alice");
      System.out.println(classroom);
      System.out.println(copy);




      // add some students


      // clone the classroom
    }
}
