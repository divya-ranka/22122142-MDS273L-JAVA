import java.util.*;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;     
public class lab4 {
    //Declaring global variable by static 
    static int Account_number;
    static String Account_Holder_Name;
    static float Account_Balance=0;
    static Scanner scan = new Scanner(System.in);     //instead of Scanner scan=new Scanner(System.in),you can make global variable of it.
    static float dp;
    static float wd;
    static int flag;

    static float inputData(){
        System.out.println("Enter your Account Registered name: ");
        Account_Holder_Name= scan.nextLine();

        System.out.println("Enter your Account number: ");
        Account_number=scan.nextInt();

        System.out.println("Enter account balance: ");
        Account_Balance=scan.nextFloat();
        return Account_Balance;
    }
    static float deposit(){
        
        System.out.println("Enter deposit amount:");
        dp=scan.nextFloat();
        if(dp > 0){  
            Account_Balance = Account_Balance + dp;
        }
        System.out.println("Balance after deposit is:"+Account_Balance);
        flag=1;
        return Account_Balance;
        
    }
    
    static float withdraw(){
        
        System.out.println("Enter amount to withdraw: ");
        wd=scan.nextFloat();
        
        if(wd>Account_Balance){
            System.out.println("Insufficient Balance");
            System.out.println("Please enter amount available in Balance! ");
        }
        else{
            Account_Balance=Account_Balance-wd;
            System.out.println("Amount wihdrawn succesfully!");
        }
        System.out.println("Account Balance after withdrawn is: "+Account_Balance);
        flag=0;
        return Account_Balance;
    }

    static void display_transaction(){  
        //Display current time and date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println("Current time Transaction: "+dtf.format(now));  

        //Display Type of transaction
        if(flag==1){
            System.out.println("Type of transaction: Credit");
            System.out.println("Amount of transaction is: "+dp);
            System.out.println("Previous Balance:"+(Account_Balance-dp));
            System.out.println("Current Balance is: "+Account_Balance);
        }
        else if(flag==0){
            System.out.println("Type of Transaction: Debit");
            System.out.println("Amount of transaction: "+wd);
            System.out.println("Previous Balance:"+(Account_Balance-wd));
            System.out.println("Current Balance is: "+Account_Balance);
        }
        
    }
    static void account_summary(){
    
        System.out.println("Customer Name -> "+Account_Holder_Name);
        System.out.println("Customer Account No -> "+Account_number);
        System.out.println("Customer Current balance -> "+Account_Balance);
    }

    public static void main(String[] args){

        System.out.println("Start Program->");
        System.out.println(inputData());
        //Creating menu options on operations to be performed 
        int choice;
        do {
            System.out.println("\n\nMenu Options:");
            System.out.println("1. Deposit the money");
            System.out.println("2. Withdraw th money");
            System.out.println("3. Display the transaction");
            System.out.println("4. Display whole acount summary");
            System.out.println("5. Exit");
            
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();
            switch (choice) 
            {
                case 1:
                System.out.println(deposit());
                System.out.println("Amount Deposited");
                
                break;

                case 2:
                System.out.println(withdraw());
                System.out.println("Account Balance was: "+Account_Balance);
                break;

                case 3:
                display_transaction();
                break;

                case 4:
                account_summary();
                break;

                case 5:
                System.out.println("Exiting the program.");
                break;

                default:
                System.out.println("Invalid choice. Try again.");
            }
            
        } while (choice != 5);
    }  
}
