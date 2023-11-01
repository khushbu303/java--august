package oct28;

public class CustomizedDemo {
        String name;
        int age;
        String country;

    public CustomizedDemo(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "CustomizedDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
