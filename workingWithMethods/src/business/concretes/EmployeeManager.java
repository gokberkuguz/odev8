package business.concretes;

import business.abstracts.IEmployeeService;
import dataAccess.abstracts.IEmployeeDal;
import entity.concrete.Employee;

import java.util.List;

public class EmployeeManager implements IEmployeeService {
    IEmployeeDal employeeDal;

    public EmployeeManager(IEmployeeDal employeeDal) {
        this.employeeDal = employeeDal;
    }

    @Override
    public List getAll() {
        return employeeDal.getAll();
    }

    @Override
    public void add(Employee employee) {
        employeeDal.add(employee);
    }

}
