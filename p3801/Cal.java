package p3801;

public class Cal {
	public static int[][] minus(int i[][]) {
		i[1][4] -= i[0][4];
		if (i[1][4] < 0) {
			i[1][3]--;
			i[1][4]+=60;
		}
		return i;
	}
}

