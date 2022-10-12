import java.util.Scanner;
public class ATM {
    Scanner input=new Scanner(System.in);
    Server verify=new Server();

    public void deposit()
    {int accountNumber=  verify.verification();
        if(accountNumber!=0)
        {
            System.out.println("Enter the deposit amount");
            int amount=input.nextInt();
           Server.getList1().replace(accountNumber, Server.getList1().get(accountNumber)+amount);
            System.out.println("Amount is deposited successfully");
            System.out.println("Balance:"+ Server.getList1().get(accountNumber));
        }
        else
        {
            System.out.println("Invalid details");
        }
    }
    public void withdraw()
    {
        float tax;
        int accountNumber=  verify.verification();
        if(accountNumber!=0)
        {
            System.out.println("Enter the deposit amount");
            int amount=input.nextInt();
            if(amount%5==0&&amount<= Server.getList1().get(accountNumber))
            {
                if(amount<=100)
                {
                     tax=0.02f;
                }
                else {
                   tax=0.04f;
                }
                Server.getList1().replace(accountNumber,  Server.getList1().get(accountNumber) - amount-(int)(amount*tax));
                System.out.println("Amount is withdrawn successfully");
                System.out.println("Balance:" +  Server.getList1().get(accountNumber));
                System.out.println("Tax:"+amount*tax);

            }
            else
            {
                System.out.println("Insufficient balance or Enter amount divisibe by 5");
            }
        }
        else
        {
            System.out.println("Invalid details");
        }
    }
    public void swipe()
    {int accountNumber=  verify.verification();
        if(accountNumber!=0) {
            System.out.println("Enter the purchase amount");
            int amount = input.nextInt();
            if(amount<= Server.getList1().get(accountNumber)){
                Server.getList1().replace(accountNumber,  Server.getList1().get(accountNumber) - amount+(int)(amount*0.01));
            System.out.println("purchase is successfully");
            System.out.println("Cashback:"+amount*0.01);
            System.out.println("Balance:" +  Server.getList1().get(accountNumber));}
            else {
                System.out.println("Insufficient balance");
            }
        }
        else
        {
            System.out.println("Invalid details");
        }
    }
    public void getBalance()
    {int accountNumber= verify.verification();
        if(accountNumber!=0)
        {System.out.println("Balance:"+ Server.getList1().get(accountNumber));}
        else {
            System.out.println("Enter valid details");
        }
    }

}
