package TwoDArrayQuestions;
import java.util.Scanner;
public class SortingIncolumns {
	public int[][] sortingBycol(int[][] arr,int rows,int col){
		int temp=0;
	for(int i=0;i+1<rows;i++)
	{
		for(int j=0;j+1<col;j++)
		{
			for(int k=0;k<col;k++)
			if(arr[j][k]>arr[j+1][k] )
			{
				temp=arr[j][k];
				arr[j][k]=arr[j+1][k];
				arr[j+1][k]=temp;
			}
		}
	}
	
		return arr;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		System.out.println("Enter number of columns");
		int col=sc.nextInt();
		int arr[][]=new int[rows][col];
		System.out.println("Enter the elements in 2-d array");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		SortingIncolumns obj=new SortingIncolumns();
		int[][] result=obj.sortingBycol(arr, rows, col);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(" "+ result[i][j]);
			}
			System.out.println();
		}
		
	}

}
