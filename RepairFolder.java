import java.util.ArrayList;

public class RepairFolder {
	private float cost;
	private String duration;
	private boolean repaired;
	
	private VehicleCard vehicle;
	private ArrayList<Job> jobs;
	
	public RepairFolder(float cost, String duration, boolean repaired, VehicleCard vehicle, ArrayList<Job> jobs) {
		this.cost = cost;
		this.duration = duration;
		this.repaired = repaired;
		
		this.vehicle = vehicle;
		this.jobs = jobs;
	}
	
	public void sendToSecretary() {
		
	}
}
