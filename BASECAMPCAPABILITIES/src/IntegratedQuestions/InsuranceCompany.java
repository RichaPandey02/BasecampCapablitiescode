
/*1-)First create the InsuranceCompany class.
2-)create a dynamic array of type Policy which size is of may be 0 or 1.
3-) Make a do while loop and display the menu there and take all the menu in switch cases.
4-) In case 1-
			1)-create a dynamic array.
			2)-Add the details in insuranceCompany system.
4-) In case 2-
			1)-create a method displayInsurancePolicyDetails.
			2)-Display all the details present in the system.
5-)In case 3-Display policies whose premium fee is less than or equal to given Amount for given mode...
			1)-Ask a premium fee and Mode from the user
			2-)create a function displayPoliciesAccordingtoPremimumFee and pass the fee and Mode and array as a argument
			3-)In displayPoliciesAccordingtoPremimumFee function create a new array of actual memory size needed and copy all the details in new arry.
			4-) Return array to the function.			
6-)	In case 5-
           Update Given fee details for given policy...
			1)-Ask user to enter id;
			2-)create updatePoliciesAccordingtoPremimumFee method
			3)-In updatePoliciesAccordingtoPremimumFee create a new array of actual memory size needed and copy all the details in new arry.
			4)-Return newArray to the function.
7)- In Exit-
			If value of flag is false then exit the loop.
			stop/
 
*/

package IntegratedQuestions;
import java.util.Scanner;

public class InsuranceCompany {
	static Scanner sc = new Scanner(System.in);
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsuranceCompany obj = new InsuranceCompany();
		Policy[] insuranceCompany = new Policy[0];
		boolean flag = true;

		do {

			System.out
					.println("1) Add Policy details to the system and display all Policy details present in system...");
			System.out.println("2) Display all the present details..");
			System.out.println(
					"3) Display policies whose premium fee is less than or equal to given Amount for given mode...");
			System.out.println("4) Sort policies details by number....");
			System.out.println("5)Update Given fee details for given policy...");
			System.out.println("6) Exit");
			System.out.println("enter choice");
			while (!sc.hasNextInt()) {
				System.out.println("Choice must be a integer only!! retry");
				sc.next();
			}
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				if (insuranceCompany.length >= 0) {
					insuranceCompany = obj.returnArray(insuranceCompany);
				}
				insuranceCompany = obj.AdddetailsInInsurencePolicy(insuranceCompany);
				count++;
				break;
			case 2:
				obj.displayInsurancePolicyDetails(insuranceCompany);
				break;
			case 3:
				System.out.println("Enter preminumFee");
				double premiumfee = sc.nextDouble();
				System.out.println("Enter mode");
				String mode = sc.next();
				Policy[] result1 = obj.displayPoliciesAccordingtoPremimumFee(insuranceCompany, premiumfee, mode);
				for (int i = 0; i < result1.length; i++) {
					obj.displayInsurancePolicyDetails(result1);
					break;
				}
				break;
			case 4:
				Policy[] result2 = obj.sortPoliciesAccordingtoPremimumFee(insuranceCompany);
				for (int i = 0; i < result2.length; i++) {
					obj.displayInsurancePolicyDetails(result2);
					break;
				}
				break;
			case 5:
				System.out.println("enter premium id");
				long id = sc.nextLong();
				Policy[] result3 = obj.updatePoliciesAccordingtoPremimumFee(insuranceCompany, id);
				for (int i = 0; i < result3.length; i++) {
					obj.displayInsurancePolicyDetails(result3);
					break;
				}
				break;
			case 6:
				flag=false;
				default:
					System.out.println("Please Inter valid choice");

			}
		} while (flag);

	}

	private Policy[] updatePoliciesAccordingtoPremimumFee(Policy[] insuranceCompany, long id) {
		// TODO Auto-generated method stub
		int k = 0;
		for (int i = 0; i < insuranceCompany.length; i++) {
			if (insuranceCompany[i].getId() == id) {
				k++;
			}
		}
		Policy[] newArray = new Policy[k];
		for (int i = 0; i < k; i++) {
			if (insuranceCompany[i].getId() == id) {
				newArray[i] = insuranceCompany[i];
			}
		}

		for (int i = 0; i < k; i++) {
			if (newArray[i].getId() == id) {
				System.out.println("enter ne fee");
				double fee = sc.nextDouble();
				newArray[i].setpremiumFee(fee);

			}
		}
		return newArray;
	}

	private Policy[] sortPoliciesAccordingtoPremimumFee(Policy[] insuranceCompany) {
		// TODO Auto-generated method stub
		Policy temp;

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count - i - 1; j++) {
				if (insuranceCompany[j].getNumber() > (insuranceCompany[j + 1].getNumber())) {
					temp = insuranceCompany[j + 1];
					insuranceCompany[j + 1] = insuranceCompany[j];
					insuranceCompany[j] = temp;
				}
			}
		}
		return insuranceCompany;
	}

	private Policy[] displayPoliciesAccordingtoPremimumFee(Policy[] insuranceCompany, double premiumfee, String mode) {
		// TODO Auto-generated method stub
		int k = 0;
		for (int i = 0; i < insuranceCompany.length; i++) {
			if (insuranceCompany[i].getpremiumFee() <= premiumfee
					&& insuranceCompany[i].getpremimumMode().equals(mode)) {
				k++;
			}
		}
		Policy[] newArray = new Policy[k];
		for (int j = 0; j < k; j++) {
			if (insuranceCompany[j].getpremiumFee() <= premiumfee
					&& insuranceCompany[j].getpremimumMode().equals(mode)) {
				newArray[j] = insuranceCompany[j];
			}

		}
		System.out.println("hjjhhjjh" + newArray.length);
		return newArray;
	}

	private void displayInsurancePolicyDetails(Policy[] insuranceCompany) {
		// TODO Auto-generated method stub
		for (int i = 0; i < insuranceCompany.length; i++) {
			if(insuranceCompany!=null) {
			String[] temp = insuranceCompany[i].getpremimumMode();
			int length = temp.length;
			System.out.println("***** ID*****" + insuranceCompany[i].getId());
			System.out.println("*****NUMBER****" + insuranceCompany[i].getNumber());
			System.out.println("*****TYPE******" + insuranceCompany[i].getType());
			System.out.println("***** PREMIUM FEE***" + insuranceCompany[i].getpremiumFee());
			for (int j = 0; j < length; j++) {
				
				System.out.println("***** PREMIUM MODE***" + temp[j]);
				

			}
		}
		}

	}

	private Policy[] AdddetailsInInsurencePolicy(Policy[] insuranceCompany) {
		// TODO Auto-generated method stub
		System.out.println("Enter Id");
		long id = sc.nextLong();
		System.out.println("Enter Number");
		long number = sc.nextLong();
		System.out.println("Enter type");
		sc.nextLine();
		String type = sc.nextLine();
		System.out.println("Enter premiumFee");

		double premiumFee = sc.nextDouble();
		System.out.println("Enter PremiumMode");
		String[] premiumMode = new String[3];
		for (int i = 0; i < 3; i++) {

			System.out.println("0)-Quarterly");
			System.out.println("1)-Halfyearly");
			System.out.println("2)-Yearly");
			System.out.println("Enter choice ");

			while (!sc.hasNextInt()) {
				System.out.println("Choice must be a integer only!! retry");
				sc.next();
			}
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 0:
				premiumMode[i] = "Quarterly";
			case 1:
				premiumMode[i] = "Halfyearly";
			case 2:
				premiumMode[i] = "yearly";
			}

			break;
		}
		insuranceCompany[count] = new Policy(id, number, type, premiumFee, premiumMode);

		return insuranceCompany;
	}

	private Policy[] returnArray(Policy[] insuranceCompany) {
		// TODO Auto-generated method stub
		Policy[] tempArray = new Policy[insuranceCompany.length + 1];
		for (int i = 0; i < insuranceCompany.length; i++) {
			tempArray[i] = insuranceCompany[i];
		}
		Policy[] newArray = new Policy[tempArray.length];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = tempArray[i];
		}
		return newArray;
	}

}
