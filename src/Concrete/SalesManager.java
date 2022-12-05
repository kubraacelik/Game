package Concrete;

import Abstract.ISalesService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SalesManager implements ISalesService{

	@Override
	public void Sales(Customer customer, Game game) {
		System.out.println(customer.Name + " oyuncusuna " + game.gameName + " oyunu satıldı.");
		
	}

	@Override
	public void SalesWithCampaign(Customer customer, Campaign campaign, Game game) {
		System.out.println(customer.Name + " oyuncusuna " + campaign.campaignName + " kampanyasıyla " + game.gameName + " oyunu satıldı.");
	}

}
