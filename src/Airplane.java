<<<<<<< HEAD
=======
public class Airplane {
	
	private Seat[][] plane = new Seat[10][4]; //assume all seats are taken

	public Airplane() { //default constructor
		for (int r = 10; r < plane.length; r++)	{
			for (int c = 4; c < plane[0].length; c++) {
				Ticket t = new Ticket(0, "", "");
				plane[r][c].set(false, t);
				//Trying to access private fields
				/*plane[r][c].taken = false;
				plane[r][c].ticket.price = 0;
				plane[r][c].ticket.passName = "";
				plane[r][c].ticket.seatNum = "";*/
			}
		}
	}

	/**
	 * This is a copy constructor
	 * @param plane2 The Airplane object to copy
	 */
	public Airplane(Airplane plane2) {
		for (int r = 10; r < plane.length; r++)	{
			for (int c = 4; c < plane[0].length; c++) {
				//Trying to access private fields from the Seat class
				/*plane[r][c].taken = plane2[r][c].taken;
				plane[r][c].ticket.price = plane2[r][c].ticket.price;
				plane[r][c].ticket.passName = plane2[r][c].ticket.passName;
				plane[r][c].ticket.seatNum = plane2[r][c].ticket.seatNum;*/
			}
		}
	}

	/**
	 * The set method sets a value for each field.
	 * @param plane2 is the Airplane object to copy 
	 */
	public void set(Airplane plane2) {
		for (int r = 10; r < plane.length; r++)	{
			for (int c = 4; c < plane[0].length; c++) {
				/*plane[r][c].taken = plane2[r][c].taken;
				plane[r][c].ticket.price = plane2[r][c].ticket.price;
				plane[r][c].ticket.passName = plane2[r][c].ticket.passName;
				plane[r][c].ticket.seatNum = plane2[r][c].ticket.seatNum;
				*/
			}
		}
	}

	/**
	 * toString method returns object as a string
	 * @return A string containing the seat information.
	 */
	public String toString() { //needs to be fixed
		//Need to have them initialize str
		String str = "";
		for (int r = 10; r < plane.length; r++)	{
			for (int c = 4; c < plane[0].length; c++) {
				str += plane[r][c].toString();
			}
		}
		return str;
	}
	
	//Need to add these methods to access the thing
	public Seat[][] getPlane() {
		Seat[][] p = plane;
		return p;
	}
}
>>>>>>> 2715434075c8615d78c01814760e7630ba30f365
