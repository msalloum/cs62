public class Student implements Comparable<Student> {

    protected String name;
    protected int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int compareTo(Student s) {
        if (id < s.id) {
            return -1;
        }
        if (id == s.id) {
            return 0;
        }
        return 1;
    }

    public String toString() {
        return "(" + name + ", " + id + ")";
    }

}
