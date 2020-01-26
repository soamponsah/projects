package org.amalitech.classtest;
import java.util.Scanner;
public class ClassTestRevised {
	
		public static void main  (String[] args) {
		//Initializations
		boolean program_Running_bool = false;
		String code_trigger_stater_str = "start";
		//String code_trigger_ender_str = "end";

		re_run_kybd_input(code_trigger_stater_str);
		//We need a trigger to end the code

		}

		static String code_trigger_ender_str = "end";

		private static void re_run_kybd_input(String code_trigger_stater_str) {
		boolean program_Running_bool;
		Scanner kybd_input = new Scanner (System.in);
		String kybd_input_str = kybd_input.nextLine();
		
		System.out.println("You entered: "+ kybd_input_str);

		if (kybd_input_str.equalsIgnoreCase(code_trigger_stater_str)) {

		program_Running_bool = true;
		
		System.out.println("Congratulations, the program has started......");
		
		for(int i=0; i<=5; i++ ) {
		
		System.out.println("Enter what to display: ");

		String word = kybd_input.nextLine();

		System.out.println("You entered: " + word);
		
		if(word.equalsIgnoreCase("end")) {
			System.out.println("The program has ended");
			System.exit(0);
		}
		
		}//end of for loop
		}
		else if (kybd_input_str.equalsIgnoreCase(code_trigger_ender_str)) {
			
		System.out.println("The program has ended");
		//kybd_input.close();
		System.exit(0);
		}
		else {
		System.out.println(// the user entered the wrong number
		"Please restart" + " and enter start to run code");
		re_run_kybd_input(code_trigger_stater_str);

		}

		//re_run_kybd_input(code_trigger_stater_str);
		}
	}


