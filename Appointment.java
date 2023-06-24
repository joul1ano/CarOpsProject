
public class Appointment {
	private String clientCode;
	private String vehicleCode;
	private String day;
	private String time;
	
	public Appointment (
			String clientCode,
			String vehicleCode,
			String day,
			String time
			) {
		this.clientCode = clientCode;
		this.vehicleCode = vehicleCode;
		this.day = day;
		this.time = time;
	}
}
