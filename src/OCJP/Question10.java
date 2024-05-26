package OCJP;


class Person {
    String name = "No Name";

    public Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    String empId = "0000";

    public Employee(String name) {
        super(name);
        this.empId = name;
    }
}

public class Question10 {
    public static void main(String[] args) {
        Employee e = new Employee("4321");
        System.out.println(e.empId);
    }
}
