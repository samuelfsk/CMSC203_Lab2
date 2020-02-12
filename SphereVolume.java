import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		double diam;
		double radius;
		double volume;
		    System.out.println("This program calculates the volume of a sphere");
		    System.out.println("Enter the diameter of the sphere: ");
		diam=input.nextDouble();
		radius=diam/2;
		volume=(4*Math.PI*Math.pow(radius, 3))/3;
		     System.out.println("The volume of the sphere is : "+ volume +".");
		     
		
		
	}

}
