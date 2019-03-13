
public class AdvanceTicket extends Ticket {

	private int daysInAdvance;

	public AdvanceTicket(int number, int daysInAdvance) {
		super(number);
		this.daysInAdvance = daysInAdvance;
		
	}

	@Override
	public double getPrice() {
		if(daysInAdvance < 10) {
			return 40.0;
		} else {
			return 30.0;
		}
	}
	
	
}
