import java.util.Scanner;
public class BankAccount {
    Scanner scan = new Scanner(System.in);
    private int accountID;
    private double balance;

    BankAccount(int accountID, double balance){
        this.accountID=accountID;
        this.balance=balance;
    }
    public int getAccountID(){
        return accountID;
    }
    public double getBalance(){
        return getBalance();
    }
    public void setAccountID(int accountID){
        this.accountID=accountID;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void deposit(double deposit){
        if(deposit>0){
            this.balance+=deposit;}
        else{
            System.out.println("Insufficient balance!");
        }
    }


    public void withdrow (double withdrow){
        if(this.balance>=withdrow)
            this.balance -= withdrow;
        else{
            System.out.println("You do not have this amount of money. Would you like to borrow?");
            System.out.println("1--> yes");
            System.out.println("2--> no ");
            int choise=0;
            if(choise==1){this.balance-=withdrow;}
            else{
                System.out.println("Insufficient balance!");
            }
        }
    }
    public void accountDetails(){
        System.out.println("ID of the account is : "+ getAccountID());
        System.out.println("Balance of the account is : "+getBalance());
    }




}
