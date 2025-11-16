package ex_Test_tasks;

public class Constructor_calling {
    static void main() {
        Constructor_calling cc = new Constructor_calling("jayesh", 25);
        cc.show();

    }


        private String  name;
        private int age;

        //constructor
    public Constructor_calling(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show () {
        System.out.println("Name >> " + name );
        System.out.println("Age >> " + age );

    }

}
