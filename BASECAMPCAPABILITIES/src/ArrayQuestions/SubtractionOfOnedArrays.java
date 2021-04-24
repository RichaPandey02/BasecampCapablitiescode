/*1-)Take the size of first and second array
2)-Declare both the arrays and ask elements from user input.
3)-Create a method subtractionOfArrays and pass both the arrays to the functions
*/
package ArrayQuestions;
import java.util.Scanner;
public class SubtractionOfOnedArrays {
		public int[] subtractionOfArrays(int[] arr1, int[] arr2) {
			int n;
			if (arr1.length < arr2.length) {
				n = arr1.length;
			} else {
				n = arr2.length;
			}
			int[] resultArray = new int[n];
			for (int i = 0; i < n; i++) {

				resultArray[i] = arr1[i] - arr2[i];
			}
			 resultArray=negativenumber(resultArray);
			 return resultArray;

		}
	public int[] negativenumber(int[] resultArray) {
			for (int i = 0; i < resultArray.length; i++) {
				if (resultArray[i] < 0) {
					System.out.print("" + resultArray[i]);
				}
			}
			return resultArray;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of first array");
			int size1 = sc.nextInt();
			int[] arr1 = new int[size1];
			System.out.println("Enter the size of second array");
			int size2 = sc.nextInt();
			int[] arr2 = new int[size2];
			System.out.println("Enter the element in first array");
			for (int i = 0; i < size1; i++) {
				arr1[i] = sc.nextInt();
			}
			System.out.println("Enter the elements in second array");
			for (int i = 0; i < size2; i++) {
				arr2[i] = sc.nextInt();
			}
			SubtractionOfOnedArrays obj = new SubtractionOfOnedArrays();
			int[] result1 = obj.subtractionOfArrays(arr1, arr2);
			for (int i = 0; i < result1.length; i++) {
				System.out.print(" " + result1[i]);
			}
			

		}

	}
