package Interest_Problem;

import java.io.IOException;
import java.util.Scanner;

public class Simple_Compound {

	public static Interest in = new Interest();
	public static Scanner scan = new Scanner(System.in);
	public static double ans = 0;
	public static void main(String[] args) throws IOException {
		while (true) {
			in.input();
			System.out.write("Enter the option to choose simple and compound interest : \n".getBytes());
			System.out.write("1. Simple Interest. \n".getBytes());
			System.out.write("2. Compound Interest. \n".getBytes());
			System.out.write("3. Exit. \n".getBytes());
			int ch = scan.nextInt();
			
			switch (ch) {
			case 1 : ans = in.simple_in();
					in.output(ans);
					break;
			case 2 : ans = in.compound_in();
					in.output(ans);
					break;
			case 3 : System.exit(0);
			}
		}
	}
}
