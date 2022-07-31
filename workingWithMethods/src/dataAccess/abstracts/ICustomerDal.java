package dataAccess.abstracts;

import entity.concrete.Customer;

public interface ICustomerDal {
    /**
     * Müşteriyi ekleme operasyonu.
     */
    void add(Customer customer);
    /**
     * Müşterinin daha önce veritabınana kaydedilme durumunu kontrol eder.
     */
    boolean customerExist(Customer customer);
}
