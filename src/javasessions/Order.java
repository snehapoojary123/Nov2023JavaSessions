package javasessions;

public class Order {
	
	public int getOrder(String customerName, int price, int tax) {
	
		System.out.println(customerName);
		int amount = price*tax;
		return amount;
	}

	public static void main(String[] args) {
		Order obj = new Order();
		int amt =obj.getOrder("Sneha", 120, 30);
		System.out.println(amt);
		

	}

}
