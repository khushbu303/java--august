package oct28;
// Generics
public class Student<Type1,Type2,Type3> {
    Type1 ID;
    Type2 Name;
    Type3 email;

    public Student(Type1 ID, Type2 name, Type3 email) {
        this.ID = ID;
        Name = name;
        this.email = email;
    }

    public Type1 getID() {
        return ID;
    }

    public void setID(Type1 ID) {
        this.ID = ID;
    }

    public Type2 getName() {
        return Name;
    }

    public void setName(Type2 name) {
        Name = name;
    }

    public Type3 getEmail() {
        return email;
    }

    public void setEmail(Type3 email) {
        this.email = email;
    }
}
