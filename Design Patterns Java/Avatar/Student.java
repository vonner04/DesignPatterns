public class Student implements Cloneable {
    private String name;
    private String upi;

    public Student (String name, String upi) {
      this.name = name;
      this.upi = upi;
    }



    
    public String getName() {
      return name;
    }




    public void setName(String name) {
      this.name = name;
    }




    public String getUpi() {
      return upi;
    }




    public void setUpi(String upi) {
      this.upi = upi;
    }




    @Override
    public String toString() {
        return "Student{name='" + name + "' upi='" + upi + "'}";
    }
    @Override
    public Cloneable clone() {
        return new Student(name, upi);
    }
}