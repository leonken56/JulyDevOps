public class entrypoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank user1 = new Bank("123213111", 5000.50, "Anh Pham", "nova1@gmail.com","5103339999");
		Bank user2 = new Bank("123241222", 5000.50, "Ba Pham", "nova2@gmail.com","5103339999");
		Bank user3 = new Bank("121223333", 5000.50, "Chad Pham", "nova3@gmail.com","5103339999");
		ArrayListDAO ALLBANK = new ArrayListDAO();
		ALLBANK.addNewAccount(user1);
		ALLBANK.addNewAccount(user2);
		ALLBANK.addNewAccount(user3);
		ALLBANK.displayall();
	}

}
