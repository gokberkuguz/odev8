package business.campaign.abstracts;

import entitiy.concretes.Education;

import java.util.List;

public interface CampaignService {
    void updatePrice(List<Education> educations);
    float getCurrentStandardPrice();
}
