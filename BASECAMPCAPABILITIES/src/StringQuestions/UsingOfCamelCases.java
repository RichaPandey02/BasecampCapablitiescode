package StringQuestions;

import java.util.Scanner;

public class UsingOfCamelCases {
	public String deletingFirstAndLastWord(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		String[] arr=new String[count+1];
		String s1="";
		int j=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				s1=s1+str.charAt(i);
				arr[j]=s1;
			}
			else
			{
				j++;
				s1="";
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("length is"+arr.length);
		String str2="";
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]!=null)
			{
				String emptStr=arr[i];
				String s3="";
				for( j=0;j<emptStr.length();j++)
				{
					if(j%2!=0)
					{
						s3=s3+(char)(emptStr.charAt(j)-32);
					}
					else
					{
						s3=s3+emptStr.charAt(j);
					}
				}
				str2=str2+s3;
				str2+= ' ';
			}
		}
		
		
		return str2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		UsingOfCamelCases obj=new UsingOfCamelCases();
		String result=obj.deletingFirstAndLastWord(str);
		System.out.println(result);
		

	}

}
