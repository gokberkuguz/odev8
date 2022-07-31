package dataAccess.abstracts;

import entitiy.concretes.Education;

import java.util.List;

public interface EducationRepository {
    List<Education> getList();
}
