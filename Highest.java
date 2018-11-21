import java.util.Scanner;
public class Highest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Provide 3 numbers to find the highest among them");
		/* This program is to find the highest among given 3 numbers. 
		 * As this involves decision I am using if-else to find the highest number*/
		System.out.println("Enter Number 1- ");
		int num1 = sc.nextInt();
		System.out.println("Enter Number 2- ");
		int num2 = sc.nextInt();
		System.out.println("Enter Number 3- ");
		int num3 = sc.nextInt();
		System.out.println("Given numbers are "+num1+", "+num2+",and "+num3);
		if ((num1>num2)&&(num1>num3)) // here we are comparing num1 with num2 and num3
			System.out.println("The highest number is: "+num1);
		else if ((num2>num1)&&(num2>num3)) // here we are comparing num2 with num1 and num3
			System.out.println("The highest number is: "+num2);
		else
			System.out.println("The highest number is: "+num3);
		sc.close();
	}
}
