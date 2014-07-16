import java.util.*;
import java.lang.*;

public class CubicSum {
	public static void main(String[] args) {
		int num,temp=1;
		double sum=0;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Please enter a number and I find the sum of their digits: ");
		num = scan.nextInt();

		while (temp != 0) {
			temp = num%10;
			num/=10;
			sum += Math.pow(temp,3);
		}

		System.out.print("The sum is : " + sum);
	}

}
