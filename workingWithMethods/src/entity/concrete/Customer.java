package entity.concrete;

public class Customer extends Person {
    public int cityId;

    public Customer() {
    }

    public Customer(int cityId) {
        this.cityId = cityId;
    }

    public Customer(int id, String firstName, String lastName, String identityNumber, int yearOfBirth, int cityId) {
        super(id, firstName, lastName, identityNumber, yearOfBirth);
        this.cityId = cityId;
    }
}
