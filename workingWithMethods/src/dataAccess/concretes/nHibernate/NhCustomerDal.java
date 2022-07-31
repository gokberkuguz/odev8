package dataAccess.concretes.nHibernate;

import dataAccess.abstracts.ICustomerDal;
import entity.concrete.Customer;

public class NhCustomerDal implements ICustomerDal {
    @Override
    public void add(Customer customer) {
        System.out.println("Nhibernate kullanarak Veritabanına Eklendi");
    }

    @Override
    public boolean customerExist(Customer customer) {
        return true;
    }
}
