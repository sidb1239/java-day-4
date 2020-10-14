package lu;
import java.io.*;

public class AvengerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avengers av1 = new Avengers("robert");
		Avengers av2 = new Avengers("amanda");
		Avengers av3 = new Avengers("lelepons");
		Avengers av4 = new Avengers("twan");
		Avengers av5 = new Avengers("tom");
		
		av1.avAge(22);
		av1.avPower("iron");
		av1.avWeapon("flame thrower");
		av1.avPlanet("MARS");
		
		av2.avAge(21);
		av2.avPower("high intesity lighting ");
		av2.avWeapon("laser gun");
		av2.avPlanet("uranus");
		
		av3.avAge(23);
		av3.avPower("opaque");
		av3.avWeapon("invisible watch");
		av3.avPlanet("saturn");
		
		av4.avAge(24);
		av4.avPower("water");
		av4.avWeapon("high vacum gun ");
		av4.avPlanet("Earth");
		
		av5.avAge(25);
		av5.avPower("rock");
		av5.avWeapon("stone ejector");
		av5.avPlanet("neptune");
		
		
		

	}

}
