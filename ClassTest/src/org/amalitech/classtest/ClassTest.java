package org.amalitech.classtest;

import java.util.Scanner;

public class ClassTest {
	
	public static void main(String[] args) {
		

		//Initializations
		String codeTriggerStarter = "start";//this causes the program to run
		
		boolean startCheck = false;//variable to check if user has already entered start

		reRunKeyboardInput(codeTriggerStarter,startCheck);

		}

		static String codeTriggerStopper = "end"; //this causes the program to end
		static String whatTheUserEnters="";

		private static void reRunKeyboardInput(String codeTriggerStarter, boolean startCheck) {
		
			boolean programRunningBool=false;
		
		Scanner input = new Scanner (System.in);
		whatTheUserEnters = input.nextLine();

		if (whatTheUserEnters.equalsIgnoreCase(codeTriggerStarter)) {
			programRunningBool = true;
		
			startCheck = true;
		int x=0;
		int y=5;

		while (programRunningBool == true) {
		
			if(x<y) {

			System.out.println("We are still in the while: " + Integer.toString(x));
			x+=1;
			}
		else {
			programRunningBool =false;
			
		startCheck = true;
		System.out.println("we are still in the while loop \n");
		}
		}

		System.out.println("Hurray! we are out of the loop \n");
		
		System.out.println("Please enter start to re-run the program or end to quit");
		}
		else if (whatTheUserEnters.equalsIgnoreCase(codeTriggerStopper)) {
		if (startCheck) {
		System.out.println("You are out of the program....bye!!!");
		
		System.exit(0);
		}else {
		System.out.println("You entered the word  " + whatTheUserEnters + ",  Please enter the word start to run the program before ending");
		}
		}
		
		// should a user enter the wrong input, the msg below is displayed
		else {
		System.out.println("You entered the word  " + whatTheUserEnters +  ",  Please enter the word start to run the program");
		
		//Should the user enter the correct input, the code below runs
		startCheck=true;
		reRunKeyboardInput(codeTriggerStarter,startCheck);

		}
		startCheck=true;
		reRunKeyboardInput(codeTriggerStarter,startCheck);
		}

		}

	




