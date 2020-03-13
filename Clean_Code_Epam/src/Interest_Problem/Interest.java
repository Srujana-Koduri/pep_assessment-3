package Interest_Problem;

import java.io.IOException;
import java.util.Scanner;

public class Interest {
	
	public static double amount, rate, interest;
	public static int year;
	public static Scanner scan = new Scanner(System.in);
	
	public Interest() {
		this.amount = 0.0;
		this.rate = 0.0;
		interest = 0.0;
		this.year = 0;
	}
	
	public void input() throws IOException {
		System.out.write("\n\t Enter the amount to deposit : \n".getBytes());
		amount = scan.nextDouble();
		System.out.write("\n\t Enter the rate of interest : \n".getBytes());
		rate = scan.nextDouble();
		System.out.write("\n\t Enter the year of duration : \n".getBytes());
		year = scan.nextInt();
	}
	
	public double simple_in() {
		return ((amount * rate * year) / 100);
	}
	
	public double compound_in() {
		double act_amount = amount;
		for(int i = 0; i < year; i++) {
			interest = ((amount * rate) / 100);
			amount = (interest + amount);
		}
		return (amount- act_amount);
	}
	
	public void output(double ans) throws IOException {
		System.out.write(("\n\t The Interest is : " + ans).getBytes());
	}
}
