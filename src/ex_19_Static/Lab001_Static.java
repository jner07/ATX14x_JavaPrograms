package ex_19_Static;

public class Lab001_Static {
    static void main() {
        Student s1= new Student (23);
        Student s2= new Student (33);

        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(Student.coursename);  
    }

}

 class Student{
        int age;
       static String coursename = "ATB"; //declared as static hence would be common for all methods

     public Student (int age_c){
         this.age = age_c;
     }


 }
