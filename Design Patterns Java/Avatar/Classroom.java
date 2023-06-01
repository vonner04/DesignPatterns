import java.util.ArrayList;
import java.util.List;

public class Classroom implements Cloneable {

  private String id;
  private List<Student> students;

  public Classroom(String id) {
    this.id = id;
    students = new ArrayList<>();
  }

  
  public List<Student> getStudents() {
    return students;
}


public void setId(String id) {
    this.id = id;
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  @Override
  public String toString() {
    return "Classroom [id=" + id + ", students=" + students + "]";
  }

  @Override
  public Classroom clone() {
    Classroom classroomCopy = new Classroom(id);
    for (Student s : students) {
      classroomCopy.students.add((Student) s.clone());
    }
    return classroomCopy;
  }
}
