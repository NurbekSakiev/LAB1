import java.util.*;
import java.lang.*;

public class BodyMass {
	public static void main (String[] args) {

		int mass;
		double bmi, height;
		String gender;
		
		Scanner scan = new Scanner(System.in);

		System.out.print ("Please enter your mass: ");
		mass = scan.nextInt();
		System.out.print ("Please enter your height in meters: ");
		height = scan.nextInt();
		System.out.print ("Male or female? (M/F)");
		gender = scan.nextLine();

		bmi = mass/ Math.pow(height,2);

		if (gender.equals("M")) {
			if(bmi<20.7) {
				System.out.print("Too skinny!");
			}

			else if(bmi>=20.7 && bmi<=26.4) {
				System.out.print("You are good");
			}
			else {
				System.out.print("Too fat!");
			}
		}
		else {
			if(bmi<19.1) {
				System.out.print("Too skinny!");
			}

			else if(bmi>=19.1 && bmi<=25.8) {
				System.out.print("You are good");
			}
			else {
				System.out.print("Too fat!");
			}
		}
	}
}