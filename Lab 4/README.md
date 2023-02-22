Question:
Write a JAVA Menu driven program that does the following:
1. You can ONLY have the below variables as global variables
-Account Number
-Account Holder Name
-Account Balance
2. You MUST have the below as functions
- To initialize the customer
- To deposit money
- To withdraw money
- To print the transactions
- To print account summary
3. Your menu will have the following operations once the customer is created
- To deposit money
- To withdraw money
- To print the transactions
- To print account summary

----------------------------------------------------------------------------------------------------------------------
What code is about?
Code is of a particular customer checking it bank details and making some transactions
----------------------------------------------------------------------------------------------------------------------

Constraints ->
User input for user bank details ,
Global variables to be made by static keyword
Options menus should be created for choice and then operation to be performed.
Program should involves 4 functions as per menu operations

---------------------------------------------------------------------------------------------------------------------

Code->
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


----------------------------------------------------------------------------------------------------------------------

Output->

Start Program->
Enter your Account Registered name:
Divya Ranka
Enter your Account number: 
22122456
Enter account balance: 
1000
1000.0


Menu Options:
1. Deposit the money
2. Withdraw th money
3. Display the transaction     
4. Display whole acount summary
5. Exit
Enter your choice: 
1  
Enter deposit amount:
100
Balance after deposit is:1100.0
1100.0
Amount Deposited


Menu Options:
1. Deposit the money
2. Withdraw th money
3. Display the transaction     
4. Display whole acount summary
5. Exit
Enter your choice: 
2
Enter amount to withdraw: 
100
Amount wihdrawn succesfully!
Account Balance after withdrawn is: 1000.0
1000.0
Account Balance was: 1000.0


Menu Options:
1. Deposit the money
2. Withdraw th money
3. Display the transaction
4. Display whole acount summary
5. Exit
Enter your choice:
3
Current time Transaction: 2023/02/22 19:12:30
Type of Transaction: Debit
Amount of transaction: 100.0
Previous Balance:900.0
Current Balance is: 1000.0


Menu Options:
1. Deposit the money
2. Withdraw th money
3. Display the transaction
4. Display whole acount summary
5. Exit
Enter your choice:
4
Customer Name -> Divya Ranka
Customer Account No -> 22122456
Customer Current balance -> 1000.0


Menu Options:
1. Deposit the money
2. Withdraw th money
3. Display the transaction
4. Display whole acount summary
5. Exit
Enter your choice:
5
Exiting the program.

--------------------------------------------------------------------------------------------------------------------

Conclusion->
Demonstrated the concept of global variables in menu driven program.

--------------------------------------------------------------------------------------------------------------------