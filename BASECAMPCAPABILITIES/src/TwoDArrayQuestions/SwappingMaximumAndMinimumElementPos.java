package TwoDArrayQuestions;
import java.util.Scanner;
public class SwappingMaximumAndMinimumElementPos {
	public int[][] findMinElemennt(int[][] arr,int rows,int col)
	{	
		int min =arr[0][0];
		int max=arr[0][0];
		int minElement=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(min>=arr[i][j])
				{
					min=arr[i][j];
				}
				
			}
			
		}
		System.out.println(min);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(max<=arr[i][j])
				{
					max=arr[i][j];
				}
				
			}
			
		}
		System.out.println("hhdh"+max);
		int a1=0,p1=0,a2=0,p2=0;
		for(int i=0;i<rows;i++)
		{
			int temp=0;
			for(int j=0;j<col;j++)
			{
				
				if(arr[i][j]==min)
				{
					a1=i;
					p1=j;
				}
				if(arr[i][j]==max)
				{
					a2=i;
					p2=j;
				}
				
			}
		}
		arr[a1][p1]=max;
		arr[a2][p2]=min;
		
		
	return arr;
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
		SwappingMaximumAndMinimumElementPos obj=new SwappingMaximumAndMinimumElementPos();
	int[][] result	=obj.findMinElemennt(arr,rows,col);
	for(int i=0;i<rows;i++)
	{
		for( int j=0;j<col;j++)
		{
		System.out.print(" "+result[i][j]);
	}
			System.out.println();
		

	}

}}