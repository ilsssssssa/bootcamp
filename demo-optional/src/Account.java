import java.util.Optional;

public class Account {

  private double balance;
  private int accountNo;

  // Important Note:
  // Optional<T>
  // private Optional<String> currency; // constructor, getter, setter??? attribute 適唔適合用 Optional 
  
  public Account(int accountNo, double balance) {
    this.balance = balance;
    this.accountNo = accountNo;
  }

  public double getBalance() {
    return this.balance;
  }

  public int accountNo() {
    return this.accountNo;
  }

  public void credit(double amount) {
    this.balance += amount;
  }

  public boolean debit(double amount) {
    if(this.balance < amount)
    return false;
    this.balance -= amount; // BigDecimal
    return true;
  }
}
