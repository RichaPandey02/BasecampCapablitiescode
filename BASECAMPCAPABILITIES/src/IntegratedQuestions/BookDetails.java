package IntegratedQuestions;
import java.util.Scanner;
public class BookDetails {
static Scanner sc=new Scanner(System.in);
int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDetails obj=new BookDetails();
		 BookStore [] bookDetails=new BookStore[0];
		 boolean flag=true;
		 do {
			 System.out.println(" 1)-Add details to the bookStore");
			 System.out.println("2)-Display the details of books");
			 System.out.println("3)-Upadte the price of book");
			 System.out.println("4-)Do the sorting based on price");
			 System.out.println("5-)Enter your choice");
			 int choice =sc.nextInt();
			 switch(choice)
			 {
			 case 1:
				 if(bookDetails.length>=0)
				 {
				 bookDetails=obj.returnArray(bookDetails);
				 obj.addDetailsOfBooks(bookDetails);
				 break;
			 }
			 case 2:
				 obj.displayBookDetails(bookDetails);
				 break;
			 case 3:
				 System.out.println("Enter book Id");
				 long id=sc.nextLong();
				 BookStore[] result2= obj.updateDetailsOfBooks(bookDetails,id);
				 for(int i=0;i<result2.length;i++)
				 	{
				 		obj.displayBookDetails(result2);
				 	}
				 break;
			 case 4:
				 	BookStore[] result3= obj.sortingOfBookDetails(bookDetails);
				 	for(int i=0;i<result3.length;i++)
				 	{
				 		obj.displayBookDetails(result3);
				 	}
			 case 
				 
		 }

	}while(flag);

}
	private BookStore[] sortingOfBookDetails(BookStore[] bookDetails) {
		if(bookDetails.length>=0) {
		for(int i=1;i<bookDetails.length;i++)
		{
			BookStore t=bookDetails[i];
			int j=i-1;
			while(j>=0 && t.getPrice()<bookDetails[j].getPrice())
			{
				bookDetails[j+1]=bookDetails[j];
				j--;
			}
			bookDetails[j+1]=t;
				
		}
		}
		// TODO Auto-generated method stub
		return bookDetails;
		
	}
	private BookStore[] updateDetailsOfBooks(BookStore[] bookDetails, long id) {
		
		// TODO Auto-generated method stub
		for(int i=0;i<bookDetails.length;i++)
		{
			if(bookDetails[i].getBookId()==id)
			{
				System.out.println("Enter new Price of the book");
				double price=sc.nextDouble();
				bookDetails[i].setPrice(price);
			}
		}
		return bookDetails;
	}
	private void displayBookDetails(BookStore[] bookDetails) {
		// TODO Auto-generated method stub
		for(int i=0;i<bookDetails.length;i++)
		{
			if(bookDetails[i]!=null)
			{
				System.out.println("*****BOOK ID*****"+bookDetails[i].getBookId());
				System.out.println("**** BOOK NAME****"+bookDetails[i].getBookName());
				System.out.println("**** Book Author****"+bookDetails[i].getBookAuthor());
				System.out.println("*****Book Price****"+bookDetails[i].getPrice());
			}
		}
		
	}
	private void addDetailsOfBooks(BookStore[] bookDetails) {
		// TODO Auto-generated method stub
		System.out.println("Enter book id");
		long bookId=sc.nextLong();
		System.out.println("Enter name of the book");
		sc.nextLine();
		String bookName=sc.nextLine();
		
		System.out.println("Enter name of book author");
		String  bookAuthor=sc.nextLine();
		System.out.println("Enter price of the book");
		double price=sc.nextDouble();
		bookDetails[count]=new BookStore(bookId,bookName,bookAuthor,price);
		
	}
	private BookStore[] returnArray(BookStore[] bookDetails) {
		// TODO Auto-generated method stub
		BookStore[] tempArray=new BookStore[bookDetails.length+1];
		for(int i=0;i<bookDetails.length;i++)
		{
			tempArray[i]=bookDetails[i];
		}
		BookStore[] newArray=new BookStore[tempArray.length];
		for(int i=0;i<newArray.length;i++)
		{
			newArray[i]=tempArray[i];
		}
		return newArray;
	}
}