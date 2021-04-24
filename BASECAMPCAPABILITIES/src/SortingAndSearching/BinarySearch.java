package SortingAndSearching;
import java.util.Scanner;
public class BinarySearch {
	static Scanner sc=new Scanner(System.in);
 public String[] insertionSort(String[] arr)
 {
	 String temp;
	int j;
	 for(int i=1;i<arr.length;i++)
	 {
		 temp=arr[i];
		 j=i;
		 while(j>0 && arr[j-1].compareTo(temp)>0)
{
	arr[j]=arr[j-1];
	j=j-1;
}
		 arr[j]=temp;
	 }
	  arr=binarySearch(arr);
	  return arr;
 }
	private String[] binarySearch(String[] arr) {
	// TODO Auto-generated method stub
		System.out.println("Enter the element do you want to search");
		String element=sc.nextLine();
		sc.nextLine();
		int left=0;
		int right=arr.length-1;
		int mid=(left+(right-1))/2;
		
		
		
		int result=element.compareTo(arr[mid]);
		if(result==0)
		{
			System.out.println("Element found at index "+mid);
		}
		else if(result>0)
		{
			left=mid+1;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==element)
				{
					System.out.println("Element found at index"+i);
					break;
				}
			}
		}
		else if(result<0)
		{
			right=mid-1;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==element)
				{
					System.out.println("Element found at index"+i);
					break;
				}
			}
			
		}
		
	return arr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		System.out.println("Enter the size of string array");
		int sizeOfArray=sc.nextInt();
		String[] arr=new String[sizeOfArray];
		System.out.println("Enter elements in array");
		for(int i=0;i<sizeOfArray;i++)
		{
			arr[i]=sc.nextLine();
			sc.next();
		}
		BinarySearch obj=new BinarySearch();
		String[] result=obj.insertionSort(arr);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}

}
