import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		CarOps company = new CarOps();
		company.insertJobs();
		//company.insertRepairs();
		company.insertSparePartsAndRepairs();
		
		ArrayList<Job> temporaryJobs = new ArrayList<>();
		temporaryJobs = company.getJobs();
		
		ArrayList<SpareParts> temporaryParts = new ArrayList<>();
		temporaryParts = company.getSpareParts();
		
		ArrayList<Repair> temporaryRepairs = new ArrayList<>();
		temporaryRepairs = company.getRepairs();
		
		System.out.println("Εργασίες Επισκευής:");
		for(Job j : temporaryJobs) {
			System.out.println("Όνομα Εργασίας: " + j.getType() + " --- Κόστος: " + j.getCost() + " Ευρώ");
			
		}
		
		System.out.println();
		System.out.println("Ανταλακτικά:");
		for(SpareParts s : temporaryParts) {
			System.out.println("Ονομασία ανταλακτικού: " + s.getType() + " --- Κόστος ανά τεμάχιο: " + s.getCost() + " Ευρώ");;
		}
		
		System.out.println();
		System.out.println("Επισκευές:");
		for(Repair r : temporaryRepairs) {
			System.out.println("Διάρκεια Επισκευής: " + r.getDuration() + " --- Συνολικό Κόστος Επισκευής: " + r.getTotalCost());
		}
		
	}
}
