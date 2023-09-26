import java.util.Scanner;
public class AttendancePercentage {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your attendance percentage: ");
		int attper=sc.nextInt();
		float att=(float)attper/10;
		if(attper>90) {
			System.out.println("Attendance is 10");
		}else if(attper<90) {
			System.out.println("Attendance is "+att);
		}
	}
	
}
