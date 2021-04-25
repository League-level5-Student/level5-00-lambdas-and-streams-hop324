package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String holder = "";
			for(int i = s.length(); i > 0; i--) {
				holder += s.charAt(i-1);
			}
			System.out.println(holder);
		}, "backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String yeaboi = "";
			for(int i = 0; i < s.length(); i++) {
				if(i%2 == 0) {
					yeaboi +=  s.toUpperCase().charAt(i);
				}
				else {
					yeaboi += s.toLowerCase().charAt(i);
				}
			}
			System.out.println(yeaboi);
		}, "wacky weird sentence");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		printCustomMessage((s)->{
			String yeaboi = "";
			for(int i = 0; i < s.length(); i++) {			
				yeaboi += s.charAt(i) + ".";		
			}
			System.out.println(yeaboi);
		}, "thingy majigy");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	printCustomMessage((s) ->{
		String yeaboi = "";
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.toLowerCase().charAt(i));
			System.out.println('a');
			if(s.toLowerCase().charAt(i)!= 'a' &&  s.charAt(i)!= 'e' && s.charAt(i)!= 'i' && s.charAt(i)!= 'o' && s.charAt(i)!= 'u') {
				yeaboi += s.charAt(i);
			}
				
		}
		System.out.println(yeaboi);
	}, "Absolutely");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
