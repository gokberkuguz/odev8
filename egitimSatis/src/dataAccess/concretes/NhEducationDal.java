package dataAccess.concretes;

import dataAccess.abstracts.EducationRepository;
import entitiy.concretes.Education;

import java.util.ArrayList;
import java.util.List;

public class NhEducationDal implements EducationRepository {
    List<Education> educations = new ArrayList<>();

    public NhEducationDal() {
        educations.add(new Education(1,"Java",300));
        educations.add(new Education(2,"Python",200));
        educations.add(new Education(3,"C#",350));
    }

    @Override
    public List<Education> getList() {
        return educations;
    }
}
