package pkgMain;

import java.util.Scanner;

public class Default {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input the current cost of tuition:");
		double tuition = scan.nextDouble();
		System.out.println("Input the rate at which tuition increases (put as a decimal):");
		double rate = scan.nextDouble();
		
		scan.close();
		
		double cost = 0;
		
		for(int i = 0; i < 4; i++){
			cost = cost + tuition;
			tuition = Math.pow(tuition, (1 + rate));
		}
		
		cost = Math.round(cost * 100);
		cost = cost / 100;
		System.out.println("Total tuition cost: $" + cost);
		
	}
}
