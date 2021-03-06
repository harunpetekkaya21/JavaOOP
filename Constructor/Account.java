
public class Account {
    // create fields for the account number ,balance ,customer name, email and phone numner.
    private int number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    
    public Account(){
        //call the appropriate parameterized constructor
        this(0000000, 0 , "anonim","nonim@mail.com","xxx");
        System.out.println("empty constructer called");
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this(000000,100,customerName,customerEmailAddress,customerPhoneNumber);
    }

    public Account(int number, double balance, String customerName,
                   String customerEmailAddress , String customerPhoneNumber){
        System.out.println("Account constructer with parameters called");
       this.number=number;
       this.balance=balance;
       this.customerName=customerName;
       this.customerEmailAddress=customerEmailAddress;
       this.customerPhoneNumber=customerPhoneNumber;

    }


    //To deposit money
    public void deposit(double depositAmount){
        this.balance+=depositAmount;
        System.out.println("Deposit of " +depositAmount + " made .New balance  is "+this.balance);
    }

    // withdraw money
    public void withdrawal(double withdrawalAmount ){
        if (this.balance-withdrawalAmount <0){
            System.out.println("Only " + this.balance + " available.Withdrawal not processed");
        }else{
            this.balance -=withdrawalAmount;
            System.out.println("Withdrawel of " + withdrawalAmount + " processed.Remaining balance = " + this.balance);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

