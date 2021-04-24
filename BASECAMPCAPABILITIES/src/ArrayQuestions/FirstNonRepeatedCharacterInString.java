/*1)-	Take a string from user.
2)-Take a method name as firstNonRepChar() and pass string in this method.
3)-Use the label and check if count of character is equal to 1 then break the loop
4)-Print the first non-Repeated Character.

*/

package ArrayQuestions;
import java.util.Scanner;
public class FirstNonRepeatedCharacterInString {
	public void firstNonRepChar(String str,int n)
	{
		A:{
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count=count+1;
					
				}
			}
			if(count==1)
			{
				System.out.println("the first non repeating char is  "+str.charAt(i));
				break A;
			}
			}}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a string");
			String str=sc.nextLine();
			int n=str.length();
			FirstNonRepeatedCharacterInString obj=new FirstNonRepeatedCharacterInString();
			obj.firstNonRepChar(str, n);
		}
		public void firstRepChar(String str, int n) {
			// TODO Auto-generated method stub
			
		}

	}



