package ArrayQuestions;

import java.util.Scanner;

public class BinarySearch {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter an elements in array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		BinarySearch obj=new BinarySearch();
		int[] result=obj.insertionSort(arr);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}

	}

	private int[] insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int j=1;j<arr.length;j++)
		{
			int key=arr[j];
			int i=j-1;
			while((i>-1) && (arr[i]>key))
			{
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
		}
		arr=binarySearch(arr);
		return arr;
	}

	private int[] binarySearch(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Enter the element do you want to search");
		int x=sc.nextInt();
		int left=0;
		int right=arr.length-1;
		if(right>=left)
		{
			int mid=left+(right-1)/2;
			if(arr[mid]==x)
			System.out.println("Element found at index"+mid);
			else if(arr[mid]>x)
			{
				left=mid+1;
				for(int i=0;i<arr.length;i++)
				{
					if(x==arr[i])
					{
						System.out.println("Element found at index"+i);
					}
				}
					
			}
			else if(arr[mid]<x)
			{
				right=mid-1;
				for(int i=0;i<arr.length;i++)
				{
					if(x==arr[i])
					{
						System.out.println("Element found at index"+i);
					}
				}
					
			}
			
		}
		
		return arr;
	}

}
