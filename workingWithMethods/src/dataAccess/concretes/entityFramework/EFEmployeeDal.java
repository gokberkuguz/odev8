package dataAccess.concretes.entityFramework;

import dataAccess.abstracts.IEmployeeDal;
import entity.concrete.Employee;

import java.util.ArrayList;
import java.util.List;

public class EFEmployeeDal implements IEmployeeDal {
    List<Employee> employees = new ArrayList<>();


    @Override
    public List<Employee> getAll() {
        {
            return employees;
        }
    }

    @Override
    public void add(Object o) {
        System.out.println(" Entity Framework Veritabanına Eklendi");
    }


}
