
public class Airplane {

	private final int ROW = 10, COL = 4; //number of rows 10, number of columns is 4
	private Seat[][] plane = new Seat[ROW][COL]; //assume all seats are taken

	public Airplane() { //default constructor
		for (int r = 0; r < plane.length; r++)	{
			for (int c = 0; c < plane[0].length; c++) {
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
		for (int r = 0; r < plane.length; r++)	{
			for (int c = 0; c < plane[0].length; c++) {
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
		for (int r = 0; r < plane.length; r++)	{
			for (int c = 0; c < plane[0].length; c++) {
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
		//Changed r from 10 to 0 and c from 4 to 0
		for (int r = 0; r < plane.length; r++)	{
			for (int c = 0; c < plane[0].length; c++) {
				str += plane[r][c].toString();
			}
		}
		return str;
	}
	
	//Need to add these methods to access the thing
	public Seat[][] getPlane() {
		//Seat[][] p = new Seat[plane.length][plane[0].length];
		Seat[][] p = plane;
		return p;
	}
}
