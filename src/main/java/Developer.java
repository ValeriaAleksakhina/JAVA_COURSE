public class Developer extends Employee {
    public Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " Делает что-то полезное, приносит прибыль компании. Поэтому ему платят " + salary);
    }
}
