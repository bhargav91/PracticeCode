import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigSum {

     public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
	   int t;	  
	   long sum = 0;
	   t = in.nextInt();
	   for(int i=0; i<t; i++){		   
		   sum += in.nextInt();
	   }
       System.out.println(sum);
    }
	
}