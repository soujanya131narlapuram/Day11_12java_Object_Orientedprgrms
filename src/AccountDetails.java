public class AccountDetails {
    int account_Balance;
    void debit(int debit_Amount){    // Instance method
        if(this.account_Balance < debit_Amount){
            System.out.println("Debit amount exceeded account balance");
        }else{
            this.account_Balance = this.account_Balance - debit_Amount;
            System.out.println(" Account balance after Amount debit : " + this.account_Balance );
        }
    }


public static void main(String[] args){
    AccountDetails balance=new AccountDetails();

    balance.account_Balance=90000;
    System.out.println("ACCOUNT BALANCE:" + balance.account_Balance);
    balance.debit(91000);
}


}
