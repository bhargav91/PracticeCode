import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;

public class PlusMinus {

    public static void main(String[] args) {
     	Scanner in =  new Scanner(System.in);
     	int numOfInputs = in.nextInt();
     	int positives=0;
     	int negatives=0;
     	int zeros=0;

     	List<Integer> numbers = new ArrayList<Integer>();

     	for(int i=0; i<numOfInputs; i++){
     		numbers.add(in.nextInt());
     		System.out.println(numbers);
     	}
     	
     	
     	for(int j=0; j<numOfInputs; j++){
     		if (numbers.get(j) < 0){
     			negatives++;
     		}     			
     		else if(numbers.get(j) > 0){
     			positives++;
     		}
     		else{
     			zeros++;
     		}
     	}
     	
    
    	double d = (double)positives/numOfInputs;     
     	double d1 =  (double)negatives/numOfInputs;     
     	double d2=  (double)zeros/numOfInputs;     	
     	
     	System.out.println( Math.round( d * 1000.0) / 1000.0  );
     	System.out.println( Math.round( d1 * 1000.0) / 1000.0  );
     	System.out.println( Math.round( d2 * 1000.0) / 1000.0  );

    }

}