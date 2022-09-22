package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Value: ");
		int N = in.nextInt();
		double sqrtN = Math.sqrt(N);
		
		boolean[] sieveTF = new boolean[N];
		for (int i=0;i<=N;i++)
			sieveTF[i] = true;
		
		for (int prime = 2; prime*prime + i*prime;)
			prime = false;
		
			
		
		
		
	}

}
