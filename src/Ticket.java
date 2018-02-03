public class Ticket {
	
	private double price; // price of the ticket
	private String passName; // name of the passenger
	private String seatNum; // seat number of the ticket

	/** 
	 * This constructor initializes the price, passName, and 
	 * seatNum fields
	 * @param price The price of the ticket.
	 * @param passName The name of the passenger.
	 * @param seatNum The number of the seat.
	 */
	public Ticket(double price, String passName, String seatNum) {
		this.price = price;
		this.passName = passName;
		this.seatNum = seatNum; 
	}

	/**
	 * The set method sets a value for each of the fields.
	 * @param price The price of the ticket.
	 * @param passName The name of the passenger.
	 * @param seatNum The number of the seat.
	 */
	public void set(double price, String passName, String seatNum) {
		this.price = price;
		this.passName = passName;
		this.seatNum = seatNum; 
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double num) {
		price = num;
	}
	
	public String getPassName() {
		return passName;
	}
	

	public void setPassName(String pass) {
		this.passName = pass;
	}
	
	public String getSeatNum() {
		return seatNum;
	}
	
	public void setSeatNum(String seatName) {
		this.seatNum = seatName;
	}
	
	
	/**
	 * toString method which provides this object as a string.
	 * @return String containing the ticket information.
	 */
	public String toString() {
		String str = "Passenger: " + passName +
				"\nSeat No.: " + seatNum +
				"\nPrice: " + price;
		return str;
	}
}