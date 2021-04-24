/*1-)compare key with the middle element
2-) If Key matches with middle element print its position.
3-)Else if key greater than middle element then key must be present in right half sub array.
4-) search the element in right half of sub array
5)-Otherwise search element in left half sub array

*/




package SortingAndSearching;

import java.util.Scanner;

public class BinarySearchInString {
	public int BinarySearch(String[] str,String key)
	{
		int left=0;
		int right=str.length-1;
		while(left<=right)
		{
			int mid=left+(right-1)/2;
			int result=key.compareTo(str[mid]);
			if(result==0)
				return mid;
			if(result>0)
		
				left=mid+1;
		
			else
			
				right=mid-1;
			
			
				
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a the length of string array");
		int size=sc.nextInt();
		String[] str=new String[size];
		System.out.println("Enter element in String array");
		for(int i=0;i<size;i++)
		{
			str[i]=sc.nextLine();
			sc.next();
			
		}
		System.out.println("Enter a key to be searched");
		String key=sc.nextLine();
		sc.next();
		BinarySearchInString obj=new BinarySearchInString();
		int result=obj.BinarySearch(str, key);
		if(result==-1)
		{
		System.out.println("Element is not present");
		}
		else
		{
			System.out.println("Element found at index"+result);
		}

	}

}
