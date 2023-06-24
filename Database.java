import java.util.ArrayList;

public class Database {
	private ArrayList<CustomerCard> customers;
	private ArrayList<VehicleCard> vehicles;
	
	private float revenew;
	private ArrayList<Repair> repairs;
	private ArrayList<SpareParts> spareParts;
	
	public Database(
			ArrayList<CustomerCard> customers,
			ArrayList<VehicleCard> vehicles,
			float revenew,
			ArrayList<Repair> repairs,
			ArrayList<SpareParts> spareParts
			) {
		this.customers = customers;
		this.vehicles = vehicles;
		
		this.revenew = revenew;
		this.repairs = repairs;
		this.spareParts = spareParts;
	}
	
	public void createClientReport() {
		
	}
	
	public void createVehicleReport() {
		
	}
	
	public void createRevenewReport() {
		
	}
	
	public void createRepairReport() {
		
	}
	
	public void createSparePartsReport() {
		
	}
}
