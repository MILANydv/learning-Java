package basicJava;

public class Main {
	
	String heplStatus= "emergency";
	
	public static void main(String[] args) {
		System.out.println("Hello Corona");
		
		Main obj = new Main();
		
		obj.callHospital();
	}

	public void callHospital() {
		String hospital = "XYZ Hospital";
		System.out.println(hospital +": Call 100");
		callDoctor();
	}
	
	public static void callDoctor() {
		
		String doc = "Dr.Milan";
		System.out.println(doc +":  Call 9800000000");
	}
	
	
}
