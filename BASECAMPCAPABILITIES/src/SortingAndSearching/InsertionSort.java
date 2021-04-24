/*1-)	First take array from user Input.
2-)Iterate from arr[1] to arr[n] over the array
3-) Compare the current element(Key) to its predecessor
4)-If key element is smaller than its predecessor then compare to the eements befor
5_)-Move the greater elements one position up to make the space for swap elements.
6)-Return the resultant array and print it to the main functions.

*/



package SortingAndSearching;

import java.util.Scanner;



public class InsertionSort {
	public int[] insertionSort(int[] arr,int n)
	{
        for(int j=1;j<n;j++)
		{
			int key=arr[j];
			int i=j-1;
			while((i>-1)&&(arr[i]>key))
			{
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
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
InsertionSort obj=new InsertionSort();
int[] result1=obj.insertionSort(arr, n);
for(int i=0;i<result1.length;i++)
{
	System.out.println(result1[i]);
}


	}}
