package ArrayQuestions;
import java.util.Scanner;
 
public class AddAndDelete {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddAndDelete obj=new AddAndDelete();
		boolean flag=true;
		do {
		int choice=obj.choice();
		
		
		switch(choice)
		{
		case 1:
			System.out.println("This method is for performing Addition");
			int result1=obj.additionOfTwoNumbers();
			System.out.println("The addition of two number is"+result1);
		obj.binaryConversion(result1);
			break;
		case 2:
			System.out.println("This method is for performing Subtraction");
			int result2=obj.subtractionOfTwoNumbers();
			System.out.println("The subtraction of two number is"+result2);
			obj.binaryConversion(result2);
			break;
		default:
			System.out.println("Please enter valid choice");
		}
		}while(flag);
	}

	private void binaryConversion(int result1) {
		int [] binary=new int[20];
		int temp=0;
		while(result1>0)
		{
			binary[temp++]=result1%2;
			result1=result1/2;
		}
		
		// TODO Auto-generated method stub
		displayBinaryDigit(binary,temp);
		
	}

	private void displayBinaryDigit(int[] binary, int temp) {
		// TODO Auto-generated method stub
		for(int i=temp-1;i>=0;i--)
		{
			System.out.println(binary[i]);
		}
		
	}

	private int subtractionOfTwoNumbers() {
		// TODO Auto-generated method stub
		int subtraction=0;
		System.out.println("Enter first Number");
		int firstNumber=sc.nextInt();
		System.out.println("Enter second number");
		int secondNumber=sc.nextInt();
		subtraction=firstNumber-secondNumber;
		return subtraction;
		
	}

	private int additionOfTwoNumbers() {
		// TODO Auto-generated method stub
		int addition=0;
		System.out.println("Enter first Number");
		int firstNumber=sc.nextInt();
		System.out.println("Enter second number");
		int secondNumber=sc.nextInt();
		addition=firstNumber+secondNumber;
		return addition;
		
		
	}

	private int choice() {
		// TODO Auto-generated method stub
		System.out.println("Perform addition");
		System.out.println("Perform subtraction");
		System.out.println("Enter choice");
		int choice=sc.nextInt();
		return choice;
	}

}
