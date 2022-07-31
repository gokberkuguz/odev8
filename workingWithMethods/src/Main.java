import business.abstracts.IEmployeeService;
import business.concretes.CustomerManager;
import business.concretes.EmployeeManager;
import business.concretes.serviceAdapters.KpsServiceAdapter;
import dataAccess.abstracts.IEmployeeDal;
import dataAccess.concretes.entityFramework.EFCustomerDal;
import dataAccess.concretes.entityFramework.EFEmployeeDal;
import dataAccess.concretes.nHibernate.NhCustomerDal;
import entity.concrete.Customer;
import entity.concrete.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        IEmployeeService employeeService = new EmployeeManager(new EFEmployeeDal());

        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.firstName = "Gökberk";
        employee1.lastName = "Uğuz";
        employee1.identityNumber = "11111";
        employee1.yearOfBirth = 94;
        employee1.salary = 2000;
        employeeService.add(employee1);

        Employee employee2 = new Employee();
        employee2.id = 2;
        employee2.firstName = "Ali";
        employee2.lastName = "Uğuz";
        employee2.identityNumber = "11112";
        employee2.yearOfBirth = 94;
        employee2.salary = 2000;
        employeeService.add(employee2);

        List<Employee> employees = new ArrayList<>();
        employees = employeeService.getAll();
        for (Employee employee:employees){
            System.out.println(employee);
        }

    }


    private static void customerDemo() throws Exception {
        CustomerManager customerManager = new CustomerManager(new NhCustomerDal(),new KpsServiceAdapter());

        Customer customer1 = new Customer();
        customer1.id =1;
        customer1.firstName ="Ali";
        customer1.lastName ="Veli";
        customer1.identityNumber ="111111";
        customerManager.add(customer1);


        Customer customer2 = new Customer();
        customer2.id =2;
        customer2.firstName ="Osman";
        customer2.lastName ="Erkan";
        customer2.identityNumber ="22222222";
        customerManager.addByOtherBusiness(customer1);
    }
    private static void employeeAddListDemo(){
        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.firstName = "Gökberk";
        employee1.lastName = "Uğuz";
        employee1.identityNumber = "11111";
        employee1.yearOfBirth = 94;
        employee1.salary = 2000;
        IEmployeeDal<Employee> employeeDal = new EFEmployeeDal();
        employeeDal.add(employee1);

        Employee employee2 = new Employee();
        employee2.id = 2;
        employee2.firstName = "Ali";
        employee2.lastName = "Uğuz";
        employee2.identityNumber = "11112";
        employee2.yearOfBirth = 94;
        employee2.salary = 2000;
        employeeDal.add(employee2);
    }

}
