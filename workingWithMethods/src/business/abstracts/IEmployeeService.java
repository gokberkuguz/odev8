package business.abstracts;

import entity.concrete.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAll();
    void add(Employee employee);
}
