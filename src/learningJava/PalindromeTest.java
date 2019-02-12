package learningJava;

public class PalindromeTest {

	
	public static void main(String[] args) {
		
		palindromeNumber(151);
		palindromeString("madam");
		palindromeString("funny");
	}

	public static void palindromeNumber(int num) {
		
		int rem=0;
		int rev=0;
		int temp;
		
		temp=num;
		
		while (num > 0) {
			
			rem = num % 10;
			rev =(rev * 10) + rem;
			num =num/10;
			}
		
		if(temp == rev) {
			System.out.println(rev+ ": Number is Palindrome");
		}else {
			System.out.println(rev+ ": Number is not Palindrome");
		}
	
		
	}
	
	public static void palindromeString(String Original) {
		
		int length =Original.length();
		String reverse ="";
		for (int i=length-1;i>=0;i--) {
			reverse = reverse + Original.charAt(i);
		}
		if(Original.equals(reverse))
	  {
			System.out.println("Given String "+Original+ " is a palindrome");
		
	}else {
		System.out.println("Given String "+Original+ " is not a palindrome");
	}

		
	
	
	}}
	

