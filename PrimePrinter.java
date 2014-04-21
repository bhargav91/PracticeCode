public class PrimePrinter{
	
	public static void main(String[] args){

		System.out.println("2");
		System.out.println("3");

		for(int i = 5; i < 100; i+=2){

			int j = 3;
			boolean isPrime = true;

			do{
				if(i % j !=0){
					j+=2;
				}else{
					isPrime = false;
				}
				
			}while(isPrime && j < Math.sqrt(i));

		if(isPrime){
			System.out.println(i);
		}

		}		

	}

}