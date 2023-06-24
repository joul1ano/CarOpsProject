import java.util.ArrayList;

public class CarOps {
	private ArrayList<Job> jobs;
	private ArrayList<SpareParts> spareParts;
	private ArrayList<Repair> repairs;
	
	public CarOps() {
		// 2 FIRST DOTS
		jobs = new ArrayList<Job>();
		spareParts = new ArrayList<SpareParts>();
		
		// DOT 3
		repairs = new ArrayList<Repair>();
	}
	//GETTERS KAI SETTERS
	public ArrayList<Job> getJobs() {
		return jobs;
	}

	public void setJobs(ArrayList<Job> jobs) {
		this.jobs = jobs;
	}

	public ArrayList<SpareParts> getSpareParts() {
		return spareParts;
	}

	public void setSpareParts(ArrayList<SpareParts> spareParts) {
		this.spareParts = spareParts;
	}

	public ArrayList<Repair> getRepairs() {
		return repairs;
	}

	public void setRepairs(ArrayList<Repair> repairs) {
		this.repairs = repairs;
	}

	//1H TELEIA
	public void insertJobs() {
		Job job1 = new Job("Αλλαγή λαδιών", "20", 20);
		Job job2 = new Job("Αλλαγή φίλτρου καμπίνας", "2", 5);
		Job job3 = new Job("Συντήρηση φρένων", "30", 30);
		
		jobs.add(job1);
		jobs.add(job2);
		jobs.add(job3);
	}
	
	//2H KAI 3H TELEIA
	public void insertSparePartsAndRepairs() {
		SpareParts spare1 = new SpareParts(30, "Συσκευασία λαδιών 4lt", 1);
		SpareParts spare2 = new SpareParts(20, "Φίλτρο λαδιού", 1);
		SpareParts spare3 = new SpareParts(30, "Φίλτρο καμπίνας", 1);
		SpareParts spare4 = new SpareParts(5, "Τακάκι φρένων εμπρός τροχού", 4);
		SpareParts spare5 = new SpareParts(5, "Τακάκι φρένων πίσω τροχού", 4);
		SpareParts spare6 = new SpareParts(10, "Υγρό φρένων", 1);
		
		spareParts.add(spare1);
		spareParts.add(spare2);
		spareParts.add(spare3);
		spareParts.add(spare4);
		spareParts.add(spare5);
		spareParts.add(spare6);
	
		ArrayList<Job> tempJobs = new ArrayList<>();
		tempJobs.add(jobs.get(0));
		tempJobs.add(jobs.get(1));
		
		
		//REPAIRS
		ArrayList<SpareParts> tempParts = new ArrayList<>();
		for(int i=0; i<3; i++) {
			tempParts.add(spareParts.get(i));
		}
		
		
		Repair repair1 = new Repair(100,"Episkevh1", tempParts, tempJobs, "1 Ημέρα");
		repairs.add(repair1);
		
		
		ArrayList<Job> tempJobs2 = new ArrayList<>();
		ArrayList<SpareParts> tempParts2 = new ArrayList<>();
		
		tempJobs2.add(jobs.get(2));
		
		tempParts2.add(spareParts.get(3));
		tempParts2.add(spareParts.get(4));
		tempParts2.add(spareParts.get(5));
		
		Repair repair2 = new Repair(120,"Episkevh2", tempParts2, tempJobs2, "2 Ημέρες");
		repairs.add(repair2);
		
	}  
}
