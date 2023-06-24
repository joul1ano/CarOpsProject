
public class TruckCard extends VehicleCard {
	private int weight;
	
	public TruckCard(String plateNumber, String Marka, String model, int constructionYear, int weight) {
		super(plateNumber, Marka, model, constructionYear);
		this.weight = weight;
	}
}
