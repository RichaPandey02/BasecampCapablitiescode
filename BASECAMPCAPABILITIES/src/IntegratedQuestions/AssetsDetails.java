/*1-)First create the Assets class.
2-)create an array of object type AssetsDetails which size is of may be 0 or 1.
3-) Make a do while loop and display the menu there and take all the menu in switch cases.
4-) In case 1-
			1)-create a dynamic array.
			2)-Add the details in AssetsDetails system.
4-) In case 2-
			1)-create a method displayAssets.
			2)-Display all the details present in the system.
5-)In case 3 Search assets for Given Months and sort the data By Model....
			1)-Ask to enter month from the user
			2-)create a function SortTheDataByModel and pass AssetsDetails.
			3-)In SortTheDataByModel function create a new array of actual memory size needed and copy all the details in new array.
			4-) Return array to the function.			
6-)	In case 4-
           Display total quantity alloted for given model....
		
			1-)create DisplaytotalQuantityAllotedBYGivenOrder method
			2)-In DisplaytotalQuantityAllotedBYGivenOrder create a new array of actual memory size needed and copy all the details in new arry.
			4)-Return newArray to the function.
7-) In case 5-
			Update Quality for given model...
			1)-Ask to enter model from the user
			2)If model matches then update the model.
7)- In Exit-
			If value of flag is false then exit the loop.
			stop/
 
*/
package IntegratedQuestions;
import java.util.Scanner;
public class AssetsDetails {
static Scanner sc=new Scanner(System.in);
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssetsDetails obj=new AssetsDetails();
		Assets[] AssetsDetails=new Assets[1];
boolean flag=true;
		
	    do{
	   
	        System.out.println("1) Add Details to the systems....");
	        System.out.println("2) Display all the stored Assets details...");
	        System.out.println("3) Search assets for Given Months and sort the data By Model....");
	        System.out.println("4) Display total quantity alloted for given model....");
	        System.out.println("5) Update Quality for given model...");
	        System.out.println("6) Display the car name aand color basd on there speed....");
	        System.out.println("7) Exit");
	        while (!sc.hasNextInt()) {
				System.out.println("Choice must be a integer only!! retry");
				sc.next();
			}
	        int choice = sc.nextInt();
            sc.nextLine();
	        switch (choice) {
	            case 1:
	            	AssetsDetails=obj.returnArray(AssetsDetails);	
	                obj.entereddetails(AssetsDetails,count);
	                count=count+1;
	                break;
	            case 2:
	            	if(AssetsDetails[0]==null)
	            	{
	            		System.out.println("first enter details...");
	            	}
	            	else
	            	{
	            		
	            	
	                obj.displayAssets(AssetsDetails,count);
	                break;
	            	}
	            case 3:
	            	Assets[] result1= obj. SortTheDataByModel(AssetsDetails,count);
	            	for(int i=0;i<result1.length;i++)
	            	{
	            		obj.displayAssets(result1, result1.length);
	            		break;
	            	}
	            	
	                break;
	            case 4:
	            	int result2= obj.DisplaytotalQuantityAllotedBYGivenOrder(AssetsDetails,count);
	            	System.out.println(result2);
	            	break;
	            case 5:
	            Assets[] result3=	obj.UpdateQuantityForModel(AssetsDetails,count);
	            for(int i=0;i<result3.length;i++)
            	{
            		obj.displayAssets(result3, result3.length);
            		break;
            	}
	            	break;
	            case 6:
	          
	            	break;
	            case 7:
	              
	            	flag=false;

	            default:
	                break;
	        }
	    }while(flag);
		

	}
	private Assets[] UpdateQuantityForModel(Assets[] AssetsDetails, int count2) {
		// TODO Auto-generated method stub
		int d=0;
		int k=0;
		int totalquant=0;
		System.out.println("enter model");
		String model=sc.nextLine();
		for(int i=0;i<count;i++)
		{
			if( AssetsDetails[i].getModel().equals(model))
			{
				d++;
			}
		}
		Assets[]  newarrquantity=new Assets[d];
		for(int i=0;i<count;i++)
		{
			if( AssetsDetails[i].getModel().equals(model))
			{
				 newarrquantity[k++]=AssetsDetails[i];
			}
		}
		for(int i=0;i<d;i++)
		{
			System.out.println("enter new quantity");
			int quant=sc.nextInt();
			newarrquantity[i].setQuantity(quant);
		}
		return newarrquantity;
	}
	private int DisplaytotalQuantityAllotedBYGivenOrder(Assets[] AssetsDetails, int count) {
		// TODO Auto-generated method stub
		int d=0;
		int k=0;
		int totalquant=0;
		System.out.println("enter model");
		String model=sc.nextLine();
		for(int i=0;i<count;i++)
		{
			if( AssetsDetails[i].getModel().equals(model))
			{
				d++;
			}
		}
		Assets[]  newarrquantity=new Assets[d];
		for(int i=0;i<count;i++)
		{
			if( AssetsDetails[i].getModel().equals(model))
			{
				 newarrquantity[k++]=AssetsDetails[i];
			}
		}
		for(int i=0;i<d;i++)
		{
			totalquant=totalquant+ newarrquantity[i].getQuantity();
		}
		return totalquant;
		
		
		
	}
	private Assets[] SortTheDataByModel(Assets[] AssetsDetails, int count) {
		// TODO Auto-generated method stub
		int newarrsize1 = 0;
		int k=0;
		System.out.println("enter month");
		String month=sc.nextLine();
		for(int i=0;i<count;i++)
		{
			
			if(AssetsDetails[i].getAllottedMonth().equals(month))
			{
				newarrsize1++;
			}
		}
		Assets[] sortedByMonth=new Assets[newarrsize1];
		for(int i=0;i<count;i++)
		{
			
			if(AssetsDetails[i].getAllottedMonth().equals(month))
			{
				sortedByMonth[k++]=AssetsDetails[i];
			}
		}
		
		Assets temp;
		for (int l = 0; l < k; l++) {
			for (int j = 0; j < k - 1 - l; j++) {
				if (sortedByMonth[j].getModel().compareTo(sortedByMonth[j + 1].getModel()) > 0) {
					temp = sortedByMonth[j + 1];
					sortedByMonth[j + 1] = sortedByMonth[j];
					
					sortedByMonth[j] = temp;
				}
			}

		}
		return sortedByMonth;
	}
	private void displayAssets(Assets[] AssetsDetails, int count) {
		// TODO Auto-generated method stub
		for(int i=0;i<count;i++)
		{
			if(AssetsDetails[i]!=null)
			{
			System.out.println("The Sno of Asset is:"+AssetsDetails[i].getSno());
			System.out.println("The model is"+AssetsDetails[i].getModel());
			System.out.println("The AllotedMonth is"+AssetsDetails[i].getAllottedMonth());
			System.out.println("the quantity is"+AssetsDetails[i].getQuantity());
		}
		}
		
	}
	private void entereddetails(Assets[] AssetsDetails, int count) {
		// TODO Auto-generated method stub
		validateAssets obj1=new validateAssets();
		System.out.println("Enter Sno");
		String Sno=sc.nextLine();
		System.out.println("Enter model");
		String model=sc.nextLine();
		//System.out.println("Enter AllotedMonths");
		String AllotedMonth;
		do {
			System.out.println("Enter  AllotedMonth  ");

			 AllotedMonth = sc.nextLine();

			if (!(obj1.validateMonth( AllotedMonth)))
				System.out.println("Invalid name");

		} while (!(obj1.validateMonth( AllotedMonth)));
		System.out.println("Enter quantity");
		int Quantity=sc.nextInt();
		AssetsDetails[count]=new Assets(Sno,model,AllotedMonth,Quantity);
	}
	private Assets[] returnArray(Assets[] AssetsDetails) {
		// TODO Auto-generated method stub
		Assets[] newarrsize=new Assets[AssetsDetails.length+1];
		for(int i=0;i<AssetsDetails.length;i++)
		{
			newarrsize[i]=AssetsDetails[i];
		}
		return newarrsize;
	}

}
