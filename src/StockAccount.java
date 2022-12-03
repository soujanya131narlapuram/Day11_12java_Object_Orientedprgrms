import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class StockAccount {
        String stock_Name;
        int  number_Of_Shares;
        int share_Price;
        int stock_value;
        int total_stocks_value;

    public StockAccount(String Stock_Name,int Number_Of_Shares,
            int Share_Price){
                this.stock_Name=Stock_Name;
                this.number_Of_Shares= Number_Of_Shares;
                this.share_Price=Share_Price;
                this.stock_value=Number_Of_Shares*share_Price;
            }
            public void stock_display() {
                //stock_value=number_Of_Shares*share_Price;
                System.out.println("Stock_Name:"+stock_Name+" "+"stock value:" +stock_value);
                System.out.println("Number_Of_Share:" + number_Of_Shares +"  "+ "Share_Price:" +share_Price);
            }

    public void all_stocks_display(ArrayList<StockAccount> arr_list) {

    }

    public static void main(String[] args) {
                System.out.println("Welcome to Stock Account Management");
                Scanner sc=new Scanner(System.in);
                ArrayList<StockAccount> stocks=new ArrayList<>();
                int choice=5;   //random value
                String searchName=null;
                int debit_stocks=0;
                while (choice != 0) {
                    System.out.println("Select one of the below options");
                    System.out.println(" 0. Exit ");
                    System.out.println(" 1. Add stock ");
                    System.out.println(" 2. Debit Account ");
                    System.out.println(" 3.Display single stock ");
                    System.out.println(" 4.Display all stocks ");
                    choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice) {
                        case 1:
                            System.out.println("enter the details of new stock:");
                            System.out.println("Stock Name");
                            String ip_stockName = sc.nextLine();
                            System.out.println("Number of Shares");
                            int ip_Number_Of_Shares = sc.nextInt();
                            System.out.println("Share Price");
                            int ip_Share_Price = sc.nextInt();
                            stocks.add(new StockAccount(ip_stockName,ip_Number_Of_Shares,ip_Share_Price));
                            break;
                        case 2:
                            System.out.println("Enter stock name for which you want to debit");
                            searchName = sc.nextLine();
                            System.out.println("Enter the number of stocks you want to debit");
                            debit_stocks=sc.nextInt();
                            for (int i = 0; i < stocks.size(); i++) {
                                if (stocks.get(i).stock_Name.equals(searchName)) {
                                    int result=stocks.get(i).number_Of_Shares-debit_stocks;
                                        if(result>=0){
                                            stocks.get(i).number_Of_Shares=result;
                                    }else {
                                            System.out.println("you do not have enough shares to debit");
                                        }
                                    break;
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Enter stock name for which you want to know the total stock value");
                            searchName = sc.nextLine();
                            for (int i = 0; i < stocks.size(); i++) {
                                if (stocks.get(i).stock_Name.equals(searchName)) {
                                    stocks.get(i).stock_display();
                                    break;
                                }
                            }
                            break;
                        case 4:
                            int total_stocks_value=0;
                            for(int index=0;index<stocks.size();index++){
                                total_stocks_value=total_stocks_value+stocks.get(index).stock_value;
                                System.out.println("Stock_Name:"+stocks.get(index).stock_Name+" "+"stock value:" +stocks.get(index).stock_value);
                            }
                            System.out.println("Total Stocks Value:"+total_stocks_value);
                            break;
                    }
                }
            }
}
