package dataAccess.abstracts;

import entity.concrete.Employee;

import java.util.List;

public interface IEmployeeDal<Employee> {
    List<Employee> getAll();
    void add(Employee employee);
}
