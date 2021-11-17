package freddie;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment1b {

	public static void main(String[] args) {
	 
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		double hourlyWage;
		int hourAmount;
		
		String namn;
		
		System.out.print("Ange namn: ");
		namn = scan.nextLine();
		
		System.out.print("Ange timlön: ");
	    hourlyWage = scan.nextDouble(); 
	    
	    System.out.print("Ange antal arbetade timmar: ");
	    hourAmount= scan.nextInt();
	   
	    
	    namn = namn.toUpperCase();
	    
	    String weeklySalary = df.format(hourlyWage * hourAmount);
	    System.out.println("\n" + namn + ", du tjänade " + weeklySalary + " kr förra veckan. ");
	    
	    
		scan.close();  
		
		

	}

}
