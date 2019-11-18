/**Sep 25, 2019
 * @author Joseph Kirkish
 */
package chapter10;

/**
 * @author jkirkish
 *
 */
public class AircraftTypeTest {

	
	public static void main(String[] args)
	{
		//Create subclass objects
		AirplaneCat airplane = new AirplaneCat("Citation Longitude","Multi-Engine Land","Jet A","SweptBack","Retractable");
		RotorCraft roto = new RotorCraft("Eurocopter HH-65 Dolphin","Helicopter Multi-Engine","Jet A",4);
		PoweredLift powerLift = new PoweredLift("Bell Boeing V-22 Osprey","Multi-Engine","Jet A",6150);
		Glyder glide = new Glyder("DG Flugzeugbau DG-800","Land","100LL");
		lighterThanAir lightAir = new lighterThanAir("Hot-Air-Ballon","Land","Propane", 100);
		PoweredParachute chute = new PoweredParachute("Powered Parachute Two seater","Land","Jet Fuel",2);
		WeightShiftControl control = new WeightShiftControl("Ultralight","Land","Diesel");
		
		System.out.println("Different Aircraft types in the Airport Corporate Hangar:\n");
		
		System.out.printf("1. %s", airplane.toString());
		System.out.println("\n");
		System.out.printf("2. %s", roto.toString());
		System.out.println("\n");
		System.out.printf("3. %s", powerLift.toString());
		System.out.println("\n");
		System.out.printf("4. %s", glide.toString());
		System.out.println("\n");
		System.out.printf("5.%s", lightAir.toString());
		System.out.println("5. \n");
		System.out.printf("6. %s", chute.toString());
		System.out.println("\n");
		System.out.printf("7. %s", control.toString());
		System.out.println("\n");
		
		//create a Seven element aircraft array
		Aircraft[] aircraft = new Aircraft[7];
		
		//initialize the Array
		aircraft[0] =airplane;
		aircraft[1] =roto;
		aircraft[2] =powerLift;
		aircraft[3] =glide;
		aircraft[4] =lightAir;
		aircraft[5] =chute;
		aircraft[6] =control;
		
		System.out.println("Aircraft categories processed polymorphically:\n");
		
		//generically process each element in array employees
		for(Aircraft currentAirCat : aircraft)
		{
			System.out.println(currentAirCat + "\n"); // invokes toString
			
			//evaluate whether element is a powerLift
			if(currentAirCat instanceof PoweredLift)
			{
				//downcast Employee reference to PowerLift reference
				PoweredLift category = (PoweredLift) currentAirCat;
				
				category.setFuelType("Rocket Fuel");
				
				System.out.printf("The new fuel with fuel propulsion is: %s\n", category.getFuelType());
			}// end if
			System.out.printf("Aircraft category %s\n", currentAirCat.getAirCategory());
		}//end for
		
		//get type name of each object in the Aircraft Category array
		for(int j= 0; j < aircraft.length; j++)
		{
			System.out.printf("Aircraft %d category is a %s\n", j, aircraft[j].getClass().getName());
		}
	}

}
