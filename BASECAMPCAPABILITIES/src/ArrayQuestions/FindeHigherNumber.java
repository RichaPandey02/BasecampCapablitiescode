/*1-)Take the array from user input
2-)Ask the number from the user to find the just higher number then this number
3-) create a method name as findJustHigherNumber() and pass array and number as argument in this method.
4-)In this method first find that how many elements are smaller then this number and according to the count
of numbers set a newarr size
5)- check if arr[i]>num store these elements in newarr
6)-print the just higher element in newarr.
*/





package ArrayQuestions;
import java.util.Scanner;
public class FindeHigherNumber {
	public void findJustHigherNumber(int[] arr,int num)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>num)
			{
				count++;
				
			}
		}
		
		int []newarr=new int[count];
		for(int i=0;i<count;i++)
		{
			if(arr[i]>num)
			{
				newarr[i]=arr[i];
			}
		}
		
		
		for(int i=0;i<newarr.length;i++)
		{
			if(newarr[i]!=0)
			{
			System.out.println(newarr[i]);
			break;
		}
		}
	}

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements in array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number");
		int num=sc.nextInt();
		FindeHigherNumber obj=new FindeHigherNumber();
	obj.findJustHigherNumber(arr, num);
	//System.out.println(numHigherThenInput);
		
	}

}
