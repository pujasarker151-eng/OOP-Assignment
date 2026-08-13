public class Student {
       String name;
    int id;

    Student(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println(name + " " + id);
    }
}

public class Student {
    public static void main(String[] args) {
        Student s1 = new Student("Rahim", 101);
        Student s2 = new Student("Karim", 102);
        Student s3 = new Student("Sumi", 103);

        s1.display();
        s2.display();
        s3.display();
    }
}
