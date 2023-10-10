import java.util.Scanner;

public class Revszpal {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String : ");
		String input=sc.next();
		boolean isPal = YesPalindrome(input);
		if(isPal){
			System.out.println("Entered String is Palindrome ");
		}else{
			System.out.println("Entered String is Not Palindrome ");
		}
	}
		static boolean YesPalindrome (String input){
			char[] charArray=input.toCharArray();
			int length=input.length();
			for(int i=0;i<length/2;i++) {
				if(charArray[i]!=charArray[length-i-1]) {
					return false;
				}
			}
				return true;
			}
		
	}


