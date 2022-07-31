package business.campaign.concretes;

import business.campaign.abstracts.CampaignService;
import entitiy.concretes.Education;

import java.util.ArrayList;
import java.util.List;

public class UpdateForPercentile implements CampaignService {

    @Override
    public void updatePrice(List<Education> educations) {
        for (Education education : educations) {
            education.setPrice((long) (education.getPrice()*(1 - getCurrentStandardPrice())));
        }
    }

    @Override
    public float getCurrentStandardPrice() {
        return 0.75F;
    }
}



