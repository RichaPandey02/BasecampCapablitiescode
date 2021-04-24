package Patterns;

public class NumericTriangularPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
for(int i=0;i<5;i++)
{
	for(int j=0;j<=i;j++)
	{
		count++;
		
		if(j!=0)
		{
		System.out.print("*"+count);
		}
		else
		{
			System.out.print(count);
		}
		
		
}
	System.out.println();
	}

}}