package hw;

import java.util.Scanner;

public class hw03_105021038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		float a = scn.nextFloat();
		float b = scn.nextFloat();
		float c = scn.nextFloat();
		float d = scn.nextFloat();
		float e = scn.nextFloat();
		float f = scn.nextFloat();
		float x = Math.min(Math.round(a), Math.round(b));
		float y = Math.min(Math.round(c), Math.round(d));
		float z = Math.min(Math.round(e), Math.round(f));
		System.out.println(Math.min(Math.min(x, y), z));

	}

}
