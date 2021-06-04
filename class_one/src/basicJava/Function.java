package basicJava;


// swap, checkPrime 


public class Function {
	
	public int sum(int a, int b) {
		
		return a+b;
	}
	
	
	public int sub(int c, int d) {
		
		return c-d;
	}
	

	public int multi(int e, int f) {
		
		return e*f;
	}
	

	public int div(int g, int h) {
		
		return g/h;
	}
	
	
	public static void main(String[] args){
		
		
		
		
		
		Function obj = new Function();
		
		
		
		
		
		int sum = obj.sum(10,20);
		System.out.println("sum : "+ sum);
		
		int sub = obj.sub(60,20);
		System.out.println("subtract : "+ sub);
		
		int mult = obj.multi(10,20);
		System.out.println("multiply : "+ mult);
		
		int div = obj.div(20,4);
		System.out.println("divide : "+ div);
		
		swappFunction(10,20);
		
		checkPrime(117);
	}
	
	
	
	public static void swappFunction(int x, int y) {
		System.out.println(" Swapping Function");
		
		
		System.out.println("Before Swapping:, x =  " + x + ", " + "y = " + y);
		
		int z=  x;
		x = y;
		y = z;
		
		
		System.out.println("After Swapping:, x =  " + x + ", "+ "y = " + y);
	}
	
	
	
	//Checking prime number
	
	public  static void checkPrime(int n) {
		
		System.out.println("Checking prime number");
		int i;
		for( i=2;i<n; i++) {
			if(n%i==0) {
				System.out.println("The given number"+ n + " is not a prime number");
				break;
			}
			System.out.println("The given number "+ n + " is a prime number");
			break;
		}
	}
}
	
	 
	
		
		
		
	
	
	
	
	
	


































