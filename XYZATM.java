import java.util.Scanner;

public class XYZATM {
    public static void main(String[] args) {
        Accounts accounts=new Accounts(9001811,90000);
        Scanner input=new Scanner(System.in);
        boolean condition=true;
        ATM atm=new ATM();
        while (condition) {
            displayMenu();
            switch (input.nextInt()) {
                case 1:
                   atm.deposit();
                    break;
                case 2:
                    atm.withdraw();
                    break;
                case 3:
                    atm.swipe();
                    break;
                case 4:
                    atm.getBalance();
                    break;

                case 5:condition=false;
                    System.out.println("Thankyou");
                    break;
                default:System.out.println("Enter a valid request");
            }
        }
    }
    public static void displayMenu()
    {
        System.out.println("Enter the action to be performed");
        System.out.println("1.Deposit Amount");
        System.out.println("2.Withdraw Amount");
        System.out.println("3.swipe for shopping");
        System.out.println("4.Get balance");
        System.out.println("5.Exit");
    }

}