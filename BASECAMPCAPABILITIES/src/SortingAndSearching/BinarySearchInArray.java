/*1-)compare key with the middle element
2-) If Key matches with middle element print its position.
3-)Else if key greater than middle element then key must be present in right half sub array.
4-) search the element in right half of sub array
5)-Otherwise search element in left half sub array

*/



package SortingAndSearching;
import java.util.Scanner;
public class BinarySearchInArray {
	public void BinarySearch(int[] arr,int key)
	{
		A:{
		for(int i=0;i<arr.length;i++)
		{
			int left=0;
			int right=arr.length-1;
			int mid=(left+right)/2;
			if(key==arr[mid])
			{
				System.out.println("Element found at"+mid+"position");
				break A;
			}
			else if(key>arr[mid])
			{
				left=arr[mid]+1;
				for(int j=0;j<arr.length;j++)
				{
					if(key==arr[j])
					{
						System.out.println("Element found at "+ j+ " position");
						break A;
					}
				}
			}
			else if(key<arr[mid])
			{
				right=arr[mid]-1;
				for(int j=0;j<arr.length;j++)
				{
					if(key==arr[j])
					{
						System.out.println("Element found at  "+ j+ " position");
						break A;
					}
				}
			}
			else
			{
				System.out.println("Element is not found.....");
			}
			
		}
	}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements in array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a key to be searched");
		int key=sc.nextInt();
		BinarySearchInArray obj=new BinarySearchInArray();
		obj.BinarySearch(arr, key);

	}

}
