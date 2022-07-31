package dataAccess.concretes.entityFramework;

import dataAccess.abstracts.ICustomerDal;
import entity.concrete.Customer;

public class EFCustomerDal implements ICustomerDal {
    @Override
    public void add(Customer customer) {
        System.out.println("Entity Framework Veritabanına Eklendi");
    }

    @Override
    public boolean customerExist(Customer customer) {
        return true;
    }
}
