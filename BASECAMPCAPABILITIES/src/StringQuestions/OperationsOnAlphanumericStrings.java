

/*1)-create a class name as OperationsOnAlphanumericStrings.
 * 2)-In main method take two alphanumeric strings from user and check these Strings are alphanumeric or not while taking user input.
 * 3)-create method  StringFinalOutput.
 * 		1-)In this method on first string take all the characters those are alphabets in one string and take all the characters those are numbers in another strings.
 * 		2-)Apply the same logic on second string.
 * 		3-)concatenate the strings those are having alphabets.
 * 		4-)concatenate the strings those are having digits.
 * 4)-Print the results.
 * */


package StringQuestions;
import java.util.Scanner;

public class OperationsOnAlphanumericStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperationsOnAlphanumericStrings obj = new OperationsOnAlphanumericStrings();
		Scanner sc = new Scanner(System.in);

		String firstString;
		// sc.nextLine();
		do {
			System.out.println("Enter first string");
			firstString = sc.nextLine();

			if (!obj.validate(firstString))

			{
				System.out.println("string Invalid!!!!");
			}
		} while (!obj.validate(firstString));

		String secondString;
		do {
			System.out.println("Enter Second string");
			secondString = sc.nextLine();
			// sc.next();
			if (!obj.validate(secondString))

			{
				System.out.println("string Invalid!!!!");
			}
		} while (!obj.validate(secondString));
		obj.StringFinalOutput(firstString, secondString);
	}

	public void StringFinalOutput(String str1, String str2) {
		String newstr1 = "";
		String newstr1a = "";
		String newstr2 = "";
		String newstr2a = "";
		
		for (int i = 0; i < str1.length(); i++) {

			if ((str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') || (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')) {
				newstr1 = newstr1 + str1.charAt(i);
			}
			if (str1.charAt(i) >= 48 && str1.charAt(i) <= 57) {
				newstr1a = newstr1a + str1.charAt(i);
			}
		}

		for (int i = 0; i < str2.length(); i++) {

			if ((str2.charAt(i) > 'a' && str2.charAt(i) < 'z') || (str2.charAt(i) > 'A' && str2.charAt(i) < 'Z')) {
				newstr2 = newstr2 + str2.charAt(i);
			}
			if (str2.charAt(i) >= 48 && str2.charAt(i) <= 57) {
				newstr2a = newstr2a + str2.charAt(i);
			}
		}
		System.out.println(newstr1 + newstr2);
		System.out.println(newstr1a + newstr2a);

	}

	private boolean validate(String str1) {
		boolean falg = true;
		OperationsOnAlphanumericStrings obj = new OperationsOnAlphanumericStrings();

		for (int i = 0; i < str1.length(); i++) {
			if (!((str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') || (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
					|| (str1.charAt(i) >= 48 && str1.charAt(i) <= 57))) {

				return false;

			}

		}

		// TODO Auto-generated method stub
		return true;
	}

}
