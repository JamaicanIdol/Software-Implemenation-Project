
public class PaymentSystem {
	private long AccountNumber;
	private String PaymetType;
	private long TransactionNumber;
	private float TransactionAmount;
	
	public PaymentSystem() {
		AccountNumber =0;
		 PaymetType="";
		TransactionNumber=0;
		 TransactionAmount=0;
	}

	public PaymentSystem(long accountNumber, String paymetType, long transactionNumber, float transactionAmount) {
		
		AccountNumber = accountNumber;
		PaymetType = paymetType;
		TransactionNumber = transactionNumber;
		TransactionAmount = transactionAmount;
	}

	public long getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getPaymetType() {
		return PaymetType;
	}

	public void setPaymetType(String paymetType) {
		PaymetType = paymetType;
	}

	public long getTransactionNumber() {
		return TransactionNumber;
	}

	public void setTransactionNumber(long transactionNumber) {
		TransactionNumber = transactionNumber;
	}

	public float getTransactionAmount() {
		return TransactionAmount;
	}

	public void setTransactionAmount(float transactionAmount) {
		TransactionAmount = transactionAmount;
	}
	
	public void display() {
		System.out.println("Payment Information:"+AccountNumber+ PaymetType+TransactionNumber +TransactionAmount);
	}
}
