package Matrial_Grade;

import java.io.IOException;
import java.util.Scanner;

public class Material {

	public static double area;
	public static char auto, std_mat;
	public static Scanner scan = new Scanner(System.in);
	
	public Material() {
		this.std_mat = ' ';
		this.area = 0.0;
		this.auto = ' ';
	}
	
	public void input() throws IOException {
		System.out.write("N. Normal. \n".getBytes());
		System.out.write("A. Above. \n".getBytes());
		System.out.write("H. High. \n".getBytes());
		std_mat = scan.next().charAt(0);
		
		System.out.write("\n\t Enter the area of the house : \n".getBytes());
		area = scan.nextDouble();
		
		System.out.write("\n\t Do you want a fully automated house(y/Y) or not(n/N) : \n".getBytes());
		auto = scan.next().charAt(0);
	}
	
	public double operation() {
		if(std_mat == 'N') {
			area = area * 1200; 
		} else if(std_mat == 'A') {
			area = area * 1500; 
		} else if(std_mat == 'H') {
			if((auto == 'Y') || (auto == 'y')) {
				area = area * 2500;
			} else {
				area = area * 1800;
			}
		}
		return area;
	}
	
	public void output(double ans) throws IOException {
		System.out.write(("\n\t The actual amount is : " + ans).getBytes());
	}
}
