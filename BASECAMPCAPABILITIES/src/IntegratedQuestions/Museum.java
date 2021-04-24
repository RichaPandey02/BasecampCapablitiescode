

/*1-)First create the visitor class.
2-)create a array of object of type Visitor which size is of may be 0 or 1.
3-) Make a do while loop and display the menu there and take all the menu in switch cases.
4-) In case 1-
			1)-create a dynamic array.
			2)-Add the details in visitorDetails system.
4-) In case 2-
			1)-create a method displayVisitorDetails.
			2)-Display all the details present in the system.
5-)In case 3 Search visitor details for given range of age and sort Visitor details by Name and display the details....
			1)-Ask range of age from the user
			2-)create a function sortVisitorsAccordingToAge and pass the age  as a argument in array.
			3-)In sortVisitorsAccordingToAge function create a new array of actual memory size needed and copy all the details in new array.
			4-) Return array to the function.			
6-)	In case 5-
           Update Given fee details for given policy...
			1)-Ask user to enter id;
			2-)create uppdateDetailsForVisitor method
			3)-In uppdateDetailsForVisitor create a new array of actual memory size needed and copy all the details in new arry.
			4)-Return newArray to the function.
7)- In Exit-
			If value of flag is false then exit the loop.
			stop/
 
*/
package IntegratedQuestions;
import java.util.Scanner;
public class Museum {
static Scanner sc=new Scanner(System.in);
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Museum obj=new Museum ();
		Visitor[ ] visitorDetails=new Visitor[0];
		boolean flag = true;

		do {

			System.out.println("1) Register visitor details and display all the details present in the system.....");
			System.out.println("2) Display the visitor details....");
	        System.out.println("3) Search visitor details for given range of age and sort Visitor details by Name and display the details....");
			System.out.println("4) Update Age for given visitor Id and display visitor details....");
			System.out.println("5)Delete the details");
			System.out.println("6) Exit....");
			
			System.out.println("enter choice");
			while (!sc.hasNextInt()) {
				System.out.println("Choice must be a integer only!! retry");
				sc.next();
			}
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				if (visitorDetails.length >= 0) {
					visitorDetails = obj.returnArray(visitorDetails);
				}
				visitorDetails = obj.AdddetailsFor(visitorDetails);
				count++;
				break;
			case 2:
				obj.displayVisitorDetails(visitorDetails);
				break;
			case 3:
				System.out.println("Enter Range of age....");
				float age = sc.nextFloat();
			
			Visitor[] result1 = obj.sortVisitorsAccordingToAge(visitorDetails, age);
			for (int i = 0; i < result1.length; i++) {
					obj.displayVisitorDetails(result1);
					break;
				}
				break;
			case 4:
				System.out.println("Enter visitor id");
				long id=sc.nextLong();
				Visitor[] result2 = obj.uppdateDetailsForVisitor(visitorDetails,id);
				for (int i = 0; i < result2.length; i++) {
					obj.displayVisitorDetails(result2);
					break;
				}
				break;
			case 5:
				System.out.println("Enter visitor id");
				long id1=sc.nextLong();
				Visitor[] result3=obj.deleteVisitorDetails(visitorDetails,id1);
				for(int i=0;i<result3.length;i++)
				{
					obj.displayVisitorDetails(result3);
					break;
				}
				break;

			} 
		}while (flag);

		
	}
	
	private Visitor[] deleteVisitorDetails(Visitor[] visitiorDetails,long id1)
	{
		for(int i=0;i<visitiorDetails.length;i++)
		{
		if(visitiorDetails[i].getId()==id1)
		{
			visitiorDetails[i]=visitiorDetails[visitiorDetails.length-1];
			visitiorDetails[visitiorDetails.length-1]=null;
			count--;
			
		}
	
			
		}
		return visitiorDetails;
		
	}
	private Visitor[] uppdateDetailsForVisitor(Visitor[] visitorDetails,long id) {
		// TODO Auto-generated method stub
		for(int i=0;i<visitorDetails.length;i++)
		{
			if(visitorDetails[i].getId()==id)
			{
				System.out.println("Enter new id for customer...");
				long idForVisitor=sc.nextLong();
				visitorDetails[i].setId(idForVisitor);
			}
		}
			Visitor[] newArr=new Visitor[count];
			for( int i=0;i<count;i++)
			{
				newArr[i]=visitorDetails[i];
			}
		
		return newArr;
	}
	
	private Visitor[] sortVisitorsAccordingToAge(Visitor[] visitorDetails, float age) {
		// TODO Auto-generated method stub
		int steps=0;
		for(int i=0;i<visitorDetails.length;i++)
		{
			if(visitorDetails[i].getAge()==age)
			{
				steps++;
			}
		}
		Visitor[] newarr =new Visitor[steps];
		for(int i=0;i<newarr.length;i++)
		{
			if(visitorDetails[i].getAge()==age)
			{
			
			newarr[i]=visitorDetails[i];
			}
		}
		for(int i=0;i<newarr.length;i++)
		{
			if(newarr[i].getAge()==age)
			{
				Visitor temp;
				for ( i = 0; i < steps; i++) {
					for (int j = 0; j < steps - i - 1; j++) {
						if (newarr[j].getName().compareTo(newarr[j + 1].getName())>0) {
							temp = newarr[j + 1];
							newarr[j + 1] =newarr[j];
							newarr[j] = temp;
						}
					}
				}
			}
		}
		
		return newarr;
	}

private void displayVisitorDetails(Visitor[] visitorDetails) {
		// TODO Auto-generated method stub
	
		for(int i=0;i<visitorDetails.length;i++)
		{
			if( visitorDetails[i]!=null)
			{
			System.out.println("*****VISITOR ID*****"+visitorDetails[i].getId());
			System.out.println("******VISITOR NAME****"+visitorDetails[i].getName());
		    System.out.println("*****AGE******"+visitorDetails[i].getAge());
		    System.out.println("*****GENDER*****"+visitorDetails[i].getGender());
		}
	}
	}

private Visitor[] AdddetailsFor(Visitor[] visitorDetails) {
		// TODO Auto-generated method stub
		System.out.println("Enter id of the visitor...");
		long id=sc.nextLong();
		System.out.println("Enter name of the visitor....");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter age of the visitor...");
		float age=sc.nextFloat();
		System.out.println("Enter the gender of visitor....");
		sc.nextLine();
		String gender=sc.nextLine();
		visitorDetails[count]=new Visitor(id,name,age,gender);
		return visitorDetails;
	}
	private Visitor[] returnArray( Visitor[] visitorDetails ) {
		// TODO Auto-generated method stub
		 Visitor[] tempArray = new  Visitor[visitorDetails .length + 1];
		for (int i = 0; i < visitorDetails .length; i++) {
			tempArray[i] = visitorDetails [i];
		}
		 Visitor[] newArray = new  Visitor[tempArray.length];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = tempArray[i];
		}
		return newArray;
	}

}
