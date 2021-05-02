package Abstract;

import Entities.Gamer;

public interface CampaignService {
	void add(Gamer gamer);
	void update(Gamer gamer);
	void delete(int gamerId);
}