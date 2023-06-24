
public class MotodikeCard extends VehicleCard {
	private int cc;
	
	public MotodikeCard(String plateNumber, String Marka, String model, int constructionYear, int cc) {
		super(plateNumber, Marka, model, constructionYear);
		this.cc = cc;
	}
}
