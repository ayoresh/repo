import java.util.Scanner;
public class SphereVolume{
	
	public static void main(String[] args){
		
		System.out.println("The program will print the valume of a sphere.");
		
		System.out.println("Please enter the diameter of the sphere.");
		
		Scanner input = new Scanner(System.in);
		
		double diam, radius, volume;
		diam = input.nextDouble();
		
		radius = diam / 2;
		
		volume = (4.0*(Math.PI)*(Math.pow(radius, 3))) / 3;
		
		System.out.println("The volume of the sphere is " + volume + ".");
		
	}

}