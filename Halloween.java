/*
-----------------------------------------------------------------
==>This problem is from hackerrank.com <==
https://www.hackerrank.com/challenges/halloween-party
-----------------------------------------------------------------

*/

import java.util.*;
public class Halloween{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		long testCases = in.nextLong();
		for(long i = 0; i < testCases; i++){
			System.out.println(solve(in.nextLong()));
		}
	}
	public static long solve(long k){

		long pieces = 1;
		if(k < 2)
			return 0;
		if(k == 2)
			return pieces;

		long add = 1;
		
		for(long j = 3; j <= k; j++){
			if(j % 2 == 1){
				pieces += add;
			}else{
				pieces += ++add;
			}
		}
		return pieces;
	}	
}