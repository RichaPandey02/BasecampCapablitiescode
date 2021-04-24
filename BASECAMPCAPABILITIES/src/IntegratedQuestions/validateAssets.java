package IntegratedQuestions;



public class validateAssets {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	

	public boolean validateMonth(String AllotedMonth) {
		// TODO Auto-generated method stub
		for(int i=0;i<AllotedMonth.length();i++) {
			if (!(AllotedMonth.length()<=3 &&( (AllotedMonth).equals("JAN")||(AllotedMonth).equals("FEB")||(AllotedMonth).equals("MARCH")||(AllotedMonth).equals("APR")||(AllotedMonth).equals("MAY")||(AllotedMonth).equals("JUN")||(AllotedMonth).equals("JUL")||(AllotedMonth).equals("AUG"))))
					{
				return false;

			}
		
	}
		return true;
}
}
