
public class Job {
	private String type;
	private String duration;
	private float cost;
	
	public Job(String type, String duration, float cost) {
		this.type = type;
		this.duration = duration;
		this.cost = cost;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public String getType() {
		return type;
	}
}
