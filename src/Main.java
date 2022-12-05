import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Kübra", "Çelik" , LocalDate.of(2001, 7, 13), Long.parseLong("929292"));
		Game game1 = new Game(1, "Valorant", 25);
		Campaign campaign1 = new Campaign(1, "Üniversite", 15);
		
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		SalesManager salesManager = new SalesManager();
		
		//customerManager.Add(customer1);
		customerManager.Delete(customer1);
		gameManager.Add(game1);
		campaignManager.Add(campaign1);
		salesManager.Sales(customer1, game1);
		salesManager.SalesWithCampaign(customer1, campaign1, game1);
	}

}
