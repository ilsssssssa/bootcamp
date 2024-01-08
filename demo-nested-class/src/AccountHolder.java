public class AccountHolder {

  private String name;
  private Account account;

  public AccountHolder() {

  }

  public AccountHolder(String name) {
    this.name = name;
  }


  public AccountHolder(Account account) {
    this.account = account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Account createAccount(String AccountNo) {
    return new Account(AccountNo);
  }

  public class Account { // Inner Class
    private String accountNo;

    public Account(String accountNo) {
      this.accountNo = accountNo;
    }

    public void printHolderName() {
      System.out.println(name); // Inner Class instance method can access the outer class's instance variable
    }
  }

  public static void main(String[] args) {

    AccountHolder john = new AccountHolder("john");
    Account johAccount = john.createAccount("1234"); // john.new Account("1234")
    johAccount.printHolderName();
  }


}
