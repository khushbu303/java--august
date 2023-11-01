package oct28;

public class StudentCustomizedExample {
    String name;
    int age;

    public StudentCustomizedExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentCustomizedExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
}
