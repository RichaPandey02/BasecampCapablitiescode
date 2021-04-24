package IntegratedQuestions;



public class Policy {
	private long id;
	private long number;
	private String type;
	private double premiumFee;
	private String[] premimumMode;
	
	public Policy()
	{
		this.id=id;
		this.number = number;
		this.type = type;
		this.premiumFee = premiumFee;
		this.premimumMode = premimumMode;
	}
	public Policy(long id, long number, String type, double premiumFee, String[] premimumMode) {
		super();
		this.id = id;
		this.number = number;
		this.type = type;
		this.premiumFee = premiumFee;
		this.premimumMode = premimumMode;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getpremiumFee() {
		return premiumFee;
	}

	public void setpremiumFee(double premiumFee) {
		this.premiumFee = premiumFee;
	}

	public String[] getpremimumMode() {
		return premimumMode;
	}

	public void setPremimumMode(String[] premimumMode) {
		this.premimumMode = premimumMode;
	}

	
	

}
