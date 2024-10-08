package app.models;

public class Student {
    private String id;
    private String name;
    private String email;

    public Student() {
    }

    public Student(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + this.id + ", name=" + this.name + ", email=" + this.email + '}';
    }
}
