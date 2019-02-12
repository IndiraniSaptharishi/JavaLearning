package learningJava;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		String Original="";
		String Reverse="";
		
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a string ");
		Original= in.nextLine(); 
		int len =Original.length();
		
		for (int i=len-1;i>=0;i--) {
			Reverse=Reverse+Original.charAt(i);
		}
		System.out.println("Reverse of the given String :" +Reverse);
		
		
		
	}

}
