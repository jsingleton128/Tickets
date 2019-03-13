
public abstract class Ticket {
	int number;

	
	public Ticket(int number) {
		this. number =  number;
	}
	
	public abstract double getPrice();
	
	@Override
	public String toString() {
		
		return "Number: " + number + ", Price: " + getPrice();
	}


}
