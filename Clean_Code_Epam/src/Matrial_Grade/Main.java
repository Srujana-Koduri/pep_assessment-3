package Matrial_Grade;

import java.io.IOException;

public class Main {

	public static Material mat = new Material();
	public static void main(String[] args) throws IOException {
		mat.input();
		double ans = mat.operation();
		mat.output(ans);
	}

}
