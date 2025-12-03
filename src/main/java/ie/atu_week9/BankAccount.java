package ie.atu_week9;

public class BankAccount {
    private String accNO;
    private String Name;
    private double balance;
   


    public BankAccount(String accNo, String name, double balance) 
    {
        if (balance <=0)
         throw new IllegalArgumentException("Balance must be greater than 0.");

        this.accNO = accNo;
        this.Name = name;
        this.balance = balance;
    }

    public BankAccount() {

    }

    public String getAccNo()
    {
        return accNO;
    }

    public String getName() {
        return Name;
    }

    public double getBalance() {
        return balance;
    }
}
