/*1-)Starting from the first index compare the first and second elements.
2-)If the first element is greater than the second element then swapped them.
3-)  now compare the second element with third element if they are not in order then swapped them.
4)-This process is going on until all the elements got sorted.abstract
*/


package SortingAndSearching;
import java.util.Scanner;
public class BubbleSortInJava {
	public int[] bubbleSort(int arr[])
	{
		int temp=0;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-1);j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size if an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements in array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		BubbleSortInJava obj=new BubbleSortInJava ();
		int[] result=obj.bubbleSort(arr);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
