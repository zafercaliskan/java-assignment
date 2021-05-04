package Abstract;

import Entities.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(int campaignId);
	void printAllItems();
}