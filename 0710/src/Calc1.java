
public class Calc1 {
	void calc(Product std) {
		int profit = std.getQuantity() - (std.getPurchasePrice() + std.getShippingCost();
		std.setProfit(profit);
		double profitRate = profit / std.purchasePrice * 100.;
		std.setProfitRate(profitRate);
	}
}
