	/*
	 * As part of you new star wars-like game, you want to build a class named Spaceship
	This class would contain the following members

	A) Variables
	1-Material :  represents the metal it was built from 
	2 -Year:   when it was built 

	The client does not mind if these 2 variables are known and accessed by others 

	3- Fuel remaining: amount of fuel remaining in thousand Gallons.(assuming you are using special space fuel)
	4- Position: assume this position is one number that represents 1 previously known point in space.  this is a very large number (18 digits)  

	These 2 variables are secret and you only want the spaceship itself to know/access these values of these variables directly.

	B) Methods

	in light of the variables and methods in the class : propose a method that can affect ( change)  the value of some of the variables of the spaceship.

	Specify method signature and code the method.  
	 */

public class Starship {
	
	public String material;
	public int year;
	private double remainFuel;	
	private long position;

	/*//example of a construct
	//whenever user wants to start a new starship it gives them a chance to send me all the dafault values for the starshp method variables 
	
	public Starship(String inputMaterial, int inputYear, double inputRemainFuel, long inputPosition) {
		
		//assign the values in the variables that are inside the object to the values that the user assigns
		material = inputMaterial;
		if(inputYear > 1980 && inputYear < 2900) {
			year = inputYear;
		}
		else { 
			year = 1999;
		}
		remainFuel = inputRemainFuel;
		position = inputPosition;
	}
	*/
	
	//method returns the remaining fuel variable
	public double getRemainFuel (){
		return remainFuel;
	}
		
	//method doesn't return a value so it can be void - this method affects the variable RemainFuel
	public void setRemainFuel (double inputFuel){  //double inputFuel reads the value that user wants to change RemainFuel to 
		if (inputFuel >= 0 && inputFuel <= 5) {
			remainFuel = inputFuel;
		}
		else if (inputFuel > 5) {
			System.out.println("Try again! Number must be less than 5.");
		}
		else {
			System.out.println("Try again! Number must be larger than 0.");
		}
	}

	public long getPosition (){
		return position;
	}
	
	public void setPosition (long inputPosition) {
		if (inputPosition >= 0 ) {
			position = inputPosition;
		}
		else if (inputPosition >= 1000) {
			System.out.println("Try again! Number must be 1000 or less.");
		}
		else {
			System.out.println("Try again! Number must be larger than 0.");
		}
	}









}
