package lu;
import java.io.*;

public class Avengers {
	
	String name;
	int age;
	String power;
	String weapon;
	String planet;
	
	public Avengers(String name) {
		this.name = name;
	}
	public void avAge(int avAge) {
		age = avAge;
	}
	public void avPower(String avPower) {
		power = avPower;
	
	}
	public void avWeapon(String avWeapon) {
		weapon = avWeapon;
	}
	public void avPlanet(String avPlanet) {
		planet = avPlanet;
	}
	public void displayDetails() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("power: "+power);
		System.out.println("weapon: "+weapon);
		System.out.println("planet: "+planet);
	}

}
