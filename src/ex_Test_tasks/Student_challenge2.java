package ex_Test_tasks;

public class Student_challenge2 {
    static void main() {
        Student_challenge2 sc= new Student_challenge2("Amit", 34, 'A');
        sc.show();
    }

    private String name;
    private int rollno;
    private char section;

    public Student_challenge2(String name, int rollno, char section){
        this.name = name;
        this.rollno = rollno;
        this.section = section;
    }

    public void show(){
        System.out.println("Student name >> " + name);
        System.out.println("roll no >> " + rollno);
        System.out.println("section >> " + rollno);
    }

}
