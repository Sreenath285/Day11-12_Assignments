import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StockManager stockManager = new StockManager();
        Account account = new Account(10000);

        while (true) {
            System.out.println("1. Buy Shares \n2. Sell shares \n3. Credit amount" +
                    "\n4. Debit amount \n5. Show stocks \n6. Show balance \n7. Exit");
            System.out.print("Enter choice : ");
            int choice = sc.nextInt();
            int _amount;
            String _symbol;

            switch (choice) {
                case 1 :
                    System.out.print("Enter name of the share to buy : ");
                    _symbol = sc.next();
                    System.out.print("Enter amount : ");
                    _amount = sc.nextInt();
                    stockManager.buy(_amount, _symbol);
                    break;
                case 2 :
                    System.out.print("Enter name of the share to sell : ");
                    _symbol = sc.next();
                    System.out.print("Enter amount : ");
                    _amount = sc.nextInt();
                    stockManager.sell(_amount, _symbol);
                    break;
                case 3 :
                    System.out.print("Enter credit amount : ");
                    _amount = sc.nextInt();
                    account.credit(_amount);
                    break;
                case 4 :
                    System.out.print("Enter debit amount : ");
                    _amount = sc.nextInt();
                    account.debit(_amount);
                    break;
                case 5 :
                    stockManager.showStocks();
                    break;
                case 6 :
                    stockManager.currentBal();
                    break;
                case 7 :
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
