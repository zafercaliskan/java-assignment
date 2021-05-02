package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;


public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+ " eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+ " güncellendi.");
		
	}

	@Override
	public void delete(int campaignId) {
		System.out.println(campaignId + " silindi.");
		
	}
}
