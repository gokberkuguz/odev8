package business.concretes.serviceAdapters;

import business.abstracts.IPersonService;
import entity.concrete.Person;

public class KpsServiceAdapter implements IPersonService {
    @Override
    public boolean checkPerson(Person person) {
        KpsService kpsService = new KpsService();
        return kpsService.checkPerson(Long.parseLong(person.identityNumber),
                person.firstName, person.lastName,
                person.yearOfBirth);
    }
}
