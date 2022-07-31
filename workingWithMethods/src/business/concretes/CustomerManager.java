package business.concretes;

import business.abstracts.IPersonService;
import dataAccess.abstracts.ICustomerDal;
import entity.concrete.Customer;
import entity.concrete.Person;


public class CustomerManager {

    ICustomerDal customerDal;
    IPersonService personService;

    public CustomerManager(ICustomerDal customerDal, IPersonService personService) {
        this.customerDal = customerDal;
        this.personService = personService;
    }

    public void add(Customer customer) throws Exception {

        validateFirstNameIfEmpty(customer);
        validateLastNameIfEmpty(customer);

        checkPersonExists(customer);

        checkCustomerExist(customer);
        customerDal.add(customer);


    }
    /**
     * Veritabanına kayıt girilmesi için çalışır. Kullanıcı adının en az iki karakterden oluşması istenilen durumlarda kullanılır
     */
    public void addByOtherBusiness(Customer customer) throws Exception {

        validateFirstNameIfEmpty(customer);
        validateLastNameIfEmpty(customer);
        validateFirstNameLenght(customer);
        checkPersonExists(customer);
        checkCustomerExist(customer);

        customerDal.add(customer);

    }
    /**
     * Kullanıcının İsminin Girilme Durumunu Kontrol Eder
     */
    private void validateFirstNameIfEmpty(Customer customer) throws Exception {
        if (customer.firstName == null){
            throw new Exception("Validation");
        }
    }
    /**
     * Kullanıcının Soyadının Girilme Durumunu Kontrol Eder
     */
    private void validateLastNameIfEmpty(Customer customer) throws Exception {
        if (customer.lastName == null){
            throw new Exception("Validation");
        }
    }
    /**
     * Kullanıcının TcKimlikNo Girilme Durumunu Kontrol Eder
     */
    private void validateIdentityNumberIfEmpty(Customer customer) throws Exception {
        if (customer.identityNumber == null){
            throw new Exception("Validation");
        }
    }
    /**
     * Kullanıcının İsminin En Az İki Karakterden Oluşması Durumunu Kontrol Eder
     */
    private void validateFirstNameLenght(Customer customer) throws Exception {
        if (customer.firstName.length()<2){
            throw new Exception("Validation");
        }
    }
    /**
     * Kullanıcının daha önce veritabanına girilip girilmediğini kontrol eder.
     */
    private void checkCustomerExist(Customer customer) throws Exception {


        if (!customerDal.customerExist(customer)){
            throw new Exception("Müşteri Mevcut");
        }else {
            customerDal.add(customer);
        }
    }
    /**
     * Kullanıcı bilgilerini mernis kullanarak kontrol eder.
     */
    private void checkPersonExists(Person person) throws Exception {
        if (!personService.checkPerson(person)){
            throw new Exception("Kimlik Doğrulanamadı");
        }
    }

}
