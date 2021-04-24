/*1)-create a class TwodMatrrix .
	2)-Take a two-d matrix of size 3*3 from user input.
	3)-Create a method avrgOfOddNumbersInDiagonal.
			1)-First check how many negative numbers are present in right diagonal
			2)-Then divide these numbers of sum  by negative numbers present in right diagonal.
			3)-store this result in result.
			4)- check how many negative numbers are present in left diagonal
			5)-Then divide these numbers of sum  by negative numbers present in left diagonal.
			6)-store this result in result1
			7)-print both the results.*/

package ArrayQuestions;
import java.util.Scanner;
public class AverageOfOddAndEvenInDiagonal {
	public void avrgOfOddNumbersInDiagonal(int[][] arr) {
		int countOfNegativeNumber = 0;
		int result1 = 0;
		int result2 = 0;
		int k = 0;
		int k1 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					if (arr[i][j] % 2 != 0) {
						countOfNegativeNumber++;
					}
				}
			}
		}
	for (int i = 0; i < arr.length; i++) {
			int m = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {

					if (arr[i][j] % 2 != 0) {

						k = k + arr[i][j];
					}
				}
			}
			k = k + m;
			result1 = k / countOfNegativeNumber;
	}
		int countOfNegativeNumberInRightDiagonal = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if ((i + j == (arr.length - 1))) {
					if (arr[i][j] % 2 != 0) {
						countOfNegativeNumberInRightDiagonal++;
					}
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			int m1 = 0;
			for (int j = 0; j < arr.length; j++) {
				if ((i + j) == (arr.length - 1)) {

					if (arr[i][j] % 2 != 0) {

						k1 = k1 + arr[i][j];
					}
				}

			}
			k1 = k1 + m1;

			result2 = k1 / countOfNegativeNumberInRightDiagonal;

		}
		System.out.println(result1);
		System.out.println(result2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		System.out.println("Enter element in matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		AverageOfOddAndEvenInDiagonal obj = new AverageOfOddAndEvenInDiagonal();
		obj.avrgOfOddNumbersInDiagonal(arr);

	}

}
