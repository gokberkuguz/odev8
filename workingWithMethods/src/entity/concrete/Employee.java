package entity.concrete;

public class Employee extends Person{
    public long salary;

    public Employee() {
    }

    public Employee(long salary) {
        this.salary = salary;
    }

    public Employee(int id, String firstName, String lastName, String identityNumber, int yearOfBirth, long salary) {
        super(id, firstName, lastName, identityNumber, yearOfBirth);
        this.salary = salary;
    }
}
