public class FindLargest{	
	public static void main(String[] args){
		int a = 10, b = 20, c = 30, d = 50;
		int x = 5;
		int p = 9, q = 3;

      	System.out.println("The largest number is : " + findLargest(a, b, c, d));

      	System.out.println("The largest number is : " + findLargest(x));
		
      	System.out.println("The largest number is : " + findLargest(p, q));

	}
	public static int findLargest(int a, int... nums){
      int largest = a; // assume the first value is largest
      for(int num : nums){
      	if(num > largest){
      		largest = num;
      	}
      }
      return largest;
   }
}
