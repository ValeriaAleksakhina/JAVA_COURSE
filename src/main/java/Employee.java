public class Employee {
    String name;
    int salary;




    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }

    public void work() {
        System.out.println(name + " Просто работает как специалист и получает " + salary);
    }




}
