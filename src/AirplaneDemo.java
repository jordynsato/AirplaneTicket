public class AirplaneDemo {
	public static void main(String[] args) {
		Ticket ticket = new Ticket(35.99, "Arnold", "1-1");
		Seat seat = new Seat(true, ticket);
		// for testing purposes, setting every seat to these values
		Airplane planeTest = new Airplane();

		//Add .getPlane() method, set indexes to 0
		for (int r = 0; r < planeTest.getPlane().length; r++) {
			for (int c = 0; c < planeTest.getPlane()[0].length; c++) {
				planeTest.getPlane()[r][c].set(seat.getTaken(), ticket);
				/*planeTest[r][c].taken = seat.taken;
				planeTest[r][c].ticket.price = ticket.price;
				planeTest[r][c].ticket.passName = ticket.passName;
				planeTest[r][c].ticket.seatNum = ticket.seatNum;*/
			}
		}
		System.out.println(planeTest);
	}
}