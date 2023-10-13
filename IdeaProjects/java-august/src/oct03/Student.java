package oct03;

public class Student {
    String name;
    String email;
    public Student(String name, String email){
        this.name = name;
        this.email = email ;


    }

    @Override //here we override method to print the actual result, gives string representation of object
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
