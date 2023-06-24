
public class SpareParts {
	private int cost;
	private String type;
	private int quantity;
	
	public SpareParts(int cost, String type, int quantity) {
		this.cost = cost;
		this.type = type;
		this.quantity = quantity;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
