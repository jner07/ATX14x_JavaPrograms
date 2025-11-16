package ex_Test_tasks;

public class Challenge_3 {
    static void main() {
        Challenge_3 ch = new Challenge_3("John doe", 3, 50000);
        ch.show();

        ch.setName("Jayesh");
        ch.setId(6);
        ch.setSalary(90000);

        System.out.println("updated info");
        System.out.println("Name >> " + ch.getName());
        System.out.println("ID >> " + ch.getId());
        System.out.println("Salary >> " + ch.salary);

    }


    String name = "John doe";
    int id = 1;
    int salary = 5000;

    public Challenge_3 (String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("Employye name >> " + name );
        System.out.println("Employee id >> " + id);
        System.out.println("Employee Salary >> " + salary);
    }
}
