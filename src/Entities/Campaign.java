package Entities;

public class Campaign {
	
	public int Id;
	public String campaignName;
	public int DiscountPercent;
	
	public Campaign(int id, String campaignName, int discountPercent) {
		super();
		Id = id;
		this.campaignName = campaignName;
		DiscountPercent = discountPercent;
	}
}
