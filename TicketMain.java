
public class TicketMain {

	public static void main(String[] args) {

		//Ticket t = new WalkupTicket(1001);
		//Ticket t = new AdvanceTicket(1002, 15);
		//Ticket y = new AdvanceTicket(1003, 7);
		
		Ticket[] k = new Ticket[3];
		
		k[0] = new WalkupTicket(1001);
		//15 days Advance Ticket, more discounted
		k[1] = new AdvanceTicket(1002, 15);
		//7 days Advance Ticket, less discounted
		k[2] = new AdvanceTicket(1003, 7);
		
		for (int i = 0; i < k.length; i++) {
			String s = k[i].getClass().toString().substring(6);
			System.out.println(s + " " + k[i].toString());
		}
		
	}

}
