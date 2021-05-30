package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" kampanyası kaydedildi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" kampanyası güncellendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" kampanyası silindi");
		
	}

}
