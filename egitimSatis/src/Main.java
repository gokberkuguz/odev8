import business.abstracts.EducationService;
import business.campaign.concretes.UpdateForPercentile;
import business.campaign.concretes.UpdateForStandardPrice;
import business.concretes.EducationManager;
import dataAccess.concretes.NhEducationDal;
import entitiy.concretes.Education;

public class Main {
    public static void main(String[] args) {

        EducationService educationService = new EducationManager(new NhEducationDal(),new UpdateForStandardPrice());
        educationService.getList();
        for (Education education:educationService.getList()){
            System.out.println(education.getName()+" "+education.getPrice());
        }

    }
}