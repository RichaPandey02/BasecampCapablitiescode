/*1-)First take 2D array matrix from user input
2-) create a method transposeMatrix() and pass this 2d array in it
3-)create a new matrix in this method name as transpose matrix
4)-store the elements in this transpose matrix
5)Return the matrix in main method and print it.

*/



package TwoDArrayQuestions;

import java.util.Scanner;

public class TransposeTheMatrix {
	
	
	public int[][] transposeMatrix(int[][] arr,int rows,int col)
	{
		int [][] transpose=new int[rows][col];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				transpose[i][j]=arr[j][i];
			}
		}
		return transpose;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			TransposeTheMatrix obj=new TransposeTheMatrix ();
			int[][] mat=obj.transposeMatrix(arr, rows, col);
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(" "+mat[i][j]);
				}
				System.out.println();
			}
	}

}
