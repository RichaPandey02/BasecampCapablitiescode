package IntegratedQuestions;
public class Assets {
	private String Sno;
	private String Model;
	private String AllottedMonth;
	private int Quantity;
	public Assets(String sno, String model, String allottedMonth, int quantity) {
		super();
		Sno = sno;
		Model = model;
		AllottedMonth = allottedMonth;
		Quantity = quantity;
	}
	public String getSno() {
		return Sno;
	}
	public void setSno(String sno) {
		Sno = sno;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getAllottedMonth() {
		return AllottedMonth;
	}
	public void setAllottedMonth(String allottedMonth) {
		AllottedMonth = allottedMonth;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
}
