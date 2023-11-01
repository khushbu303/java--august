package oct28;

public class StudentMain {
    public static void main(String[] args) {
        Student<Integer,String,String> student = new Student<>(101,"Himanshu","himanshu@gmail.com");
        String name = student.getName();
        String email = student.getEmail();
        System.out.println(student.Name);
        System.out.println(student.ID );
        System.out.println(student.email);



    }
}
