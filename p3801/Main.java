package p3801;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import p3801.Cal.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(" |¥n");
		
		String str_[][] = new String[2][5];
		int num_[][] = new int[2][5];
		
		str_[0] = scan.nextLine().split(" ");
		str_[1] = scan.nextLine().split(" ");
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				num_[i][j] = Integer.parseInt(str_[i][j]);
			}
		}
		
		// Minutes
		long minutes = num_[1][4] - num_[0][4];
		if(minutes < 0) {
			num_[1][3]--;
			minutes = minutes + 60;
		}
		
		// Hours
		long hours =  num_[1][3] - num_[0][3];
		if(hours < 0) {
			num_[1][2]--;
			hours = hours + 24;
		}
		
		// Days
		long days =  num_[1][2] - num_[0][2];
		if(days < 0) {
			num_[1][1]--;
			days = days + 30;
		}
		
		// Months
		long months =  num_[1][1] - num_[0][1];
		if(months < 0) {
			num_[1][0]--;
			months = months + 12;
		}
		
		// Years
		long years =  num_[1][0] - num_[0][0];
		
		System.out.print(years + " " + months + " " + days+ " " + hours + " " + minutes);

		// Debug
		num_ = Cal.minus(num_);
		System.out.println("debug : " + num_[1][4]);
        
	}

}
