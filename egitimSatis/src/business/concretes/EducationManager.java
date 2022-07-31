package business.concretes;

import business.abstracts.EducationService;
import business.campaign.abstracts.CampaignService;
import dataAccess.abstracts.EducationRepository;
import entitiy.concretes.Education;

import java.util.ArrayList;
import java.util.List;

public class EducationManager implements EducationService {
    EducationRepository educationRepository;
    CampaignService campaignService;

    public EducationManager(EducationRepository educationRepository, CampaignService campaignService) {
        this.educationRepository = educationRepository;
        this.campaignService = campaignService;
    }

    @Override
    public List getList() {
        List<Education> educations = educationRepository.getList();
        campaignService.updatePrice(educations);
        return educations;
    }
}
