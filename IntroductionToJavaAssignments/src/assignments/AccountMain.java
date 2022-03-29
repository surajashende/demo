package assignments;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account();
		
		Account account2 = new Account(456, "Sayyad");
		
		account.setAccountNumber(32);
		account.setName("Ashiph");
		
		System.out.println("Account Number : "+ account.getAccountNumber());
		System.out.println("Account Name : "+account.getName());
		
		
		System.out.println(account2.toString());
	}

}
