import java.util.Collections;
import java.util.Scanner;

import java.util.Arrays;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		ArrayList<Integer> L = new ArrayList<>();
		int Dist = 0;

		Scanner scan = new Scanner(System.in);
		// scan.useDelimiter(" |¥n");
		System.out.println("ok");

		for (int i = 0; i < 3; i++) {
			L.add(scan.nextInt());
		}
		Dist = scan.nextInt();
		scan.close();

		// 長い順にソート
		Collections.sort(L, Collections.reverseOrder());

		System.out.println("sort by (DSC):");
		for (int var : L) {
			System.out.println(var);
		}
		
		int a = L.get(0) - L.get(1);
		int b = L.get(1) - L.get(2);
		if ( a <= Dist && b >= Dist ) {
			// Do compare <3>
			System.out.println("<3>:");

		}
		if ( a >= Dist && b <= Dist) {
			// Do compare <1>
			System.out.println("<1>:");
		}
		if (a >= Dist && b >= Dist) {
			// Do compare <3>
			System.out.println("<3>:");
		}

	}
}