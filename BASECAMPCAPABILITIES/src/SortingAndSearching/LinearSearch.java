/*1-) create an array and ask enter an element by the user
 * 2-)Ask user to enter a key.
 * 3-_create a function name as linearSearch and pass element and key  in it.
 * 4-) check if key==element the
 * 
 * */


package SortingAndSearching;
import java.util.Scanner;
public class LinearSearch {
 public int linearSearch(int[] arr,int element)
 {
	 int position=0;
	 for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				position=i;
			}
		}
	 return position;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter an elemet to be searched");
		int element=sc.nextInt();
		LinearSearch obj=new LinearSearch();
		int result=obj.linearSearch(arr, element);
		System.out.println("element found at index" +result);

	}

}
