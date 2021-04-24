package TwoDArrayQuestions;
import java.util.Scanner;
public class SwappingPrimaryDiagonalWithLastRow {
	public int[][] swappingDiagonalWithLatRow(int[][] arr,int rows,int col)
	{
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==j)
				{
					int temp=arr[rows-1][j];
					arr[rows-1][j]=arr[i][j];
					arr[i][j]=temp;
					 
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=sc.nextInt();
		System.out.println("Enter the column");
		int col=sc.nextInt();
		int[][] arr=new int[rows][col];
		System.out.println("Enter elements in 2-D matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix elemnts are");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		
			System.out.println("**********************");
		SwappingPrimaryDiagonalWithLastRow obj=new SwappingPrimaryDiagonalWithLastRow();
		int[][] result=obj.swappingDiagonalWithLatRow(arr, rows, col);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(" "+result[i][j]);
			}
			System.out.println();
		}
		

	}

}
