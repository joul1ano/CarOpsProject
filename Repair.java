import java.util.ArrayList;

public class Repair {
	private float cost;
	private String type;
	private String duration;
	private ArrayList<SpareParts> spareParts;
	private ArrayList<Job> jobs;
	
	public Repair(float cost, String type, ArrayList<SpareParts> spareParts, ArrayList<Job> jobs,String duration) {
		this.cost = cost;
		this.type = type;
		this.duration = duration;
		this.spareParts = spareParts;
		this.jobs = jobs;
	}
	
	private void addSparePart(SpareParts sparePart) {
		this.spareParts.add(sparePart);
	}
	
	private void addJob(Job job) {
		this.jobs.add(job);
	}
	
	public float getTotalCost() {
		float cost = 0;
		for(SpareParts s : spareParts) {
			cost = cost + s.getCost()*s.getQuantity();
		}
		
		for(Job j : jobs) {
			cost = cost + j.getCost();
		}
		this.cost = cost;
		return cost;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
