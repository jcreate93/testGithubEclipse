
public class StarshipApp {

	public static void main (String[] args){
		
		Starship shipNumberOne = new Starship(); //gives the new starship called shipNumberOne the variables (material, year, remainFuel, position) from the separate Starship class i- allots space in memory
		
		System.out.println("Material: " + shipNumberOne.material);
		System.out.println("Year: " + shipNumberOne.year);
		System.out.println("Fuel: " + shipNumberOne.getRemainFuel());
		System.out.println("Position: " + shipNumberOne.getPosition());
		
	}
	
}
