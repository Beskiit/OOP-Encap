package package1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunBloodData {
	public static void main(String[]args)throws InputMismatchException{
		Scanner sc = new Scanner(System.in);
		boolean cont = true;
		
		BloodData bd = new BloodData();
		
		try{
			while(cont) {
				System.out.print("Enter blood type of patient: ");
				bd.setBloodType(sc.nextLine());
				System.out.print("Enter Rhesus factor of patient (+ or -): ");
				bd.setRhFactor(sc.nextLine());
				
				if(bd.getBloodType().isBlank() && bd.getRhFactor().isBlank()) {
					BloodData bd1 = new BloodData();
					System.out.println(bd1.getBloodType() + bd1.getRhFactor() + " added to the blood bank.\n");
				}else{
					display(bd.getBloodType(), bd.getRhFactor());
				}
				
				System.out.println("Do you still want to add another blood type of patient? [Y] / [N]");
				String choice = sc.next();
				
				if(choice.equalsIgnoreCase("Y")) {
					sc.nextLine();
					System.out.println();
				}else if(choice.equalsIgnoreCase("N")) {
					System.out.println("Thank you for using our system.");
					cont = false;
				}else {
					System.err.println("Please choose from [Y] / [N] only. Please try again.");
				}
			}
		}catch(InputMismatchException ime){
			System.err.println(ime.getMessage());
		}
	}
	
	public static void display(String bt, String rh){
		if((bt.equalsIgnoreCase("O") || bt.equalsIgnoreCase("A") || bt.equalsIgnoreCase("B") || bt.equalsIgnoreCase("AB")) && (rh.equalsIgnoreCase("+") || rh.equalsIgnoreCase("-"))) {
			if(bt.equalsIgnoreCase("O")) {
				bt = "O";
			}else if(bt.equalsIgnoreCase("B")) {
				bt = "B";
			}else if(bt.equalsIgnoreCase("A")) {
				bt = "A";
			}else if(bt.equalsIgnoreCase("AB")) {
				bt = "AB";
			}
			
			if(rh.equals("+")) {
				rh = "+";
			}else if(rh.equals("-")) {
				rh= "-";
			}
			System.out.println(bt + rh + " added to the blood bank.\n");
		}else {
			System.err.println("Your input is wrong. Please try again.");
		}
	}
}