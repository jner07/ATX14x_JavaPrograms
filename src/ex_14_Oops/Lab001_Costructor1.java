package ex_14_Oops;

import javax.xml.namespace.QName;

public class Lab001_Costructor1 {
    static void main() {
        Student s1 = new Student();
        Student s2 = new Student("Jayesh");
    }
   }

        class Student {
            String name;

            //DC
            Student(){
                System.out.println("Hi this is default constructor");
            }

            //PC
            Student (String name){
                System.out.println("Hi " + name + " I am parameterized constructor");
            }



            void sleep (){}
            void study (){}
            void eat (){}


        }

