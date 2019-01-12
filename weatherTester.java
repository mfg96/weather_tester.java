import java.util.Scanner;

/**
 * weather tester class
 * @author mfarazsohail
 * main is inside this class
 */

public class weatherTester {
	
	/**
	 * main method
	 * @param args
	 */
	
	public static void main(String args[]) {
	
	Scanner sc= new Scanner(System.in);
	weather T=new weather();	
	System.out.printf("Please enter Temperature:");
	T.setTempF(sc.nextInt());
	System.out.printf("Please enter wind speed:");
	T.setWindSpeed(sc.nextInt());
	T.getWindChill();
	//T.isSevere();
	System.out.println(T.toString());
	sc.close();
	
	
	
	}
	

}
