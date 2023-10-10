import java.util.Scanner;

public class FreqRev {
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter String : ");
	 String given=sc.nextLine();
	 System.out.println("Enter character to Search : ");
	  char key = sc.next().charAt(0);
	  int sent = checkFreq(given,key);
	  if(sent>0) 
		  System.out.println("Number of Occurance :"+sent);
	  else 
		  System.out.println("Number not found");  
	}
	
     static char checkFreq(String given,char key) {
    	 Scanner sc=new Scanner(System.in);
     char a[]=given.toCharArray();
     char count=0;
     int len=given.length();
     for(int i=0;i<given.length();i++)
     {
    	 if(key==a[i]) 
    		 count++;
     }

    	 return count;
     }
     
}
