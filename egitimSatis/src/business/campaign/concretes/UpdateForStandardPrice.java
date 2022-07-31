package business.campaign.concretes;

import business.campaign.abstracts.CampaignService;
import entitiy.concretes.Education;

import java.util.List;

public class UpdateForStandardPrice implements CampaignService {


    @Override
    public void updatePrice(List<Education> educations) {
        for (Education education : educations) {
            education.setPrice((getCurrentStandardPrice()));
        }
    }

    @Override
    public float getCurrentStandardPrice() {
        return 75;
    }
}

