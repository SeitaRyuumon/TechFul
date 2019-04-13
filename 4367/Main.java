import java.util.Collections;
import java.util.Scanner;

import java.util.Arrays;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		ArrayList<Integer> L = new ArrayList<>();
		int Dist 	= 0;
		int result	= 0;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			L.add(scan.nextInt());
		}
		Dist = scan.nextInt();
		scan.close();

		// 長い順にソート
		Collections.sort(L, Collections.reverseOrder());
		
		int a = L.get(0) - L.get(1);
		int b = L.get(1) - L.get(2);
		int c = L.get(2) - Dist;
		if ( a <= Dist && b >= Dist ) {
			result = 3;
		}
		if ( a >= Dist && b <= Dist ) {
			result = 1;
			if ( c <= 1 ) {
				result = 2;
			}
		}
		if ( a >= Dist && b >= Dist ) {
			result = 3;
		}
		if ( a <= Dist && b <= Dist ) {
			result = 1;
			if ( c <= 1 ) {
			}
		}
		if (a == Dist && b == Dist) {
			result = 0;
		}

		// Display the result
		if ( result == 1 ) {
			L.set(1, L.get(0) - Dist);
			L.set(2, L.get(1) - Dist);
		} else if ( result == 2 ) {
			L.set(2, L.get(1) - Dist);
			L.set(0, L.get(1) + Dist);
		} else if ( result == 3 ) {
			L.set(1, L.get(2) + Dist);
			L.set(0, L.get(1) + Dist);
		} else {
			// Do nothing
		}
		for (int var : L) {
			System.out.println(var);
		}

	}
}