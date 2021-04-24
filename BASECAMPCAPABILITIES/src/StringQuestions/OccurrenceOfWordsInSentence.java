/*1-)Take a input String from UserInput.
2-)Pass a string in method name as convertingStringToLowerCase().
3-) pass the resultant string in method name as findOccurreneceInString()

*
*/
package StringQuestions;

import java.util.Scanner;

public class OccurrenceOfWordsInSentence {
	static Scanner sc = new Scanner(System.in);

	public int convertingStringToLowerCase(String sentence) {
		char character = ' ';
		String str = "";
		int result = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') {
				character = sentence.charAt(i);
				character = (char) ((int) (sentence.charAt(i)) - 32);
				str = str + character;
				}
		}
		result = findOccurreneceInString(str);
		return result;
	}

	public int findOccurreneceInString(String sentence) {
		System.out.println("Enter substring");
		String subStr=sc.nextLine();
		int noOfOccurrence = 0;
		for(int i=0;i<subStr.length();i++)
		{
			for(int j=0;j<subStr.length();j++)
			{
				if(sentence.charAt(i)==subStr.charAt(j))
				{
					for(int k=1;k<subStr.length();k++)
					{
						if(sentence.charAt(k)==subStr.charAt(k))
						{
							
						}
					}
					noOfOccurrence++;
					
				}
			}
		}
		
	     return noOfOccurrence ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a sentence...");
		String sentence = sc.nextLine();
		OccurrenceOfWordsInSentence obj = new OccurrenceOfWordsInSentence();
		int result = obj.convertingStringToLowerCase(sentence);
		System.out.println(result);
	}

}
