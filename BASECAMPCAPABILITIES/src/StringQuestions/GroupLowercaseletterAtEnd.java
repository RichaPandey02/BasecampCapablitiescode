package StringQuestions;
import java.util.Scanner;
public class GroupLowercaseletterAtEnd {
	public String split(String str)
	{
		int count=0;
		int j=0;
		String emptyStr=" ";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		String[] arr=new String[count+1];
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				emptyStr=emptyStr+str.charAt(i);
				arr[j]=emptyStr;
			}
			else {
				j++;
				emptyStr=" ";
			}
		}
		 str=groupLowecaseInEnd(arr);
		 return str;
	}

	private String groupLowecaseInEnd(String[] arr) {
		// TODO Auto-generated method stub
		String[] newArr=new String[arr.length];
	int tempIndex=0;
		for(int i=0;i<arr.length;i++)
		{
			String emtStr = "";
			String result="";
			String finalResult;
			for( int j=0;j<arr[i].length();j++)
			{
			if(arr[i].charAt(j)>='a' && arr[i].charAt(j)<='z')
			{
				emtStr=emtStr+arr[i].charAt(j);
			}
			else if(arr[i].charAt(j)>='A' && arr[i].charAt(j)<='Z')
			{
				result=result+arr[i].charAt(j);
				
			}
		}
			
			finalResult=result+emtStr;
			newArr[tempIndex++]=finalResult;
			
		}
		String output="";
		for(int i=0;i<newArr.length;i++)
		{
			output+=newArr[i];
			output+=' ';
		}
		
		
		
		
		
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		GroupLowercaseletterAtEnd obj=new GroupLowercaseletterAtEnd();
		String result=obj.split(str);
		for(int i=0;i<result.length();i++)
		{
			System.out.println(result);
			break;
		}
		

	}

}
