import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
	  int numOfInputs = in.nextInt();
	  long sumLeft = 0;
	  long sumRight = 0;
	 
	  
	  for(int i=0; i<numOfInputs; i++){
		for(int j=0; j<numOfInputs; j++){
			long input = in.nextInt();
			if(i==j){
				sumLeft += input;
			}
			if(i+j == (numOfInputs - 1)){
				sumRight += input;
			}
		}
		
	  }
	  
		System.out.println(Math.abs(sumLeft - sumRight)); 
	
    }

}