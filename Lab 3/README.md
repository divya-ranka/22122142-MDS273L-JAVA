Question ->
Create a java program that performs the following operation:
The program should collect an integer array from the user
After the array is entered, you need to create a menu of items
Find the Mean Value
Find the Median Value
Find the Mode Value
From the user-given array.
The program should have a minimum of 3 functions apart from the main function; each of the functions implements the Mean, Median, and Mode computation by accepting the array user has entered as a parameter and returning the value as a result. From the main method, you will display the result.

----------------------------------------------------------------------------------------------------------------------
How to run a code? 
In a terminal -> 
javac filename.java
java filename.java

----------------------------------------------------------------------------------------------------------------------
What code is about?
Code is about performing mathematical operations by using functions
Given switch for multiple menus cases inside do-while loop to iterate multiple times.

----------------------------------------------------------------------------------------------------------------------
Constraints ->
Applied mean value if float then should return float value and not integer.
Keyword and datatypes to be in correct syntax.
Options menus should be created for choice and then operation to be performed.

----------------------------------------------------------------------------------------------------------------------
Code ->
import java.util.Scanner;
import java.util.Arrays;
public class lab3{

    //Function to find mean value on user input array
    static float mean_func(int[] numArray,int n){
        float sum=0;
        
        for(int k=0;k<n;k++){
            //Adding all elements of an array
            sum+=numArray[k];
        }
        //Storing in variable mean 
        float mean=sum/n;
        return mean;
    }

    //Function to find median value on user input array
    //Steps:First, simply sort the array .
    //Then, check if the number of elements present in the array is even or odd
    //If odd, then simply return the mid value of the array
    //Else, the median is the average of the two middle values
    static int median_func(int[] numArray,int n){
         // First we sort the array
         Arrays.sort(numArray);
 
         // check for even case
         if (n % 2 != 0)
             return numArray[n / 2];
  
         return (numArray[(n - 1) / 2] + numArray[n / 2] )/ 2;
    }
    
    //Function to find mode value on user input array
    static int mode_func(int[] numArray ,int n){
        //Count the occurence of each value in array
        int mValue=0;
        int mCount=0;
        int count=0;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(numArray[j]==numArray[i]){
                    count++;
                }
            }
            //Display the value with the highest occurrence
            if(count>mCount){
                mCount=count;
                mValue=numArray[i];
            }
        }
        return mValue;
    }
    public static void main(String[] args){

        System.out.println("Start Program ------->");
        System.out.print("Enter Array length: ");
        Scanner scan = new Scanner(System.in);
        int arrayLenMax=Integer.parseInt(scan.nextLine());

        // Initialize array and declaring array with the length of users choice
        int[] numArray = new int[arrayLenMax];
        int n=numArray.length;

        // iterating on array length to collect inputs and save to array
        for(int i=0;i<arrayLenMax;i++){
            System.out.println("Enter value for"+(i+1)+"th element:");
            numArray[i]=Integer.parseInt(scan.nextLine()); //saving to array
        }

        // displaying array to user
        System.out.println("Elements in array with size"+arrayLenMax);
        System.out.println(Arrays.toString(numArray));

        //Creating menu options on operations to be performed 
        int choice;
        do {
            System.out.println("\n\nMenu Options:");
            System.out.println("1. Find the mean value");
            System.out.println("2. Find the median value");
            System.out.println("3. Find the mode value");
            System.out.println("4. Exit");
            
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            switch (choice) 
            {
                case 1:
                System.out.println(mean_func(numArray,n));
                break;

                case 2:
                System.out.println(median_func(numArray,n));
                break;

                case 3:
                System.out.println(mode_func(numArray,n));
                break;

                case 4:
                System.out.println("Exiting the program.");
                break;

                default:
                System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }  
}

----------------------------------------------------------------------------------------------------------------------
Output ->
PS C:\Users\DIVYA\Desktop\22122142-MDS273L-JAVA\Lab 3> javac lab3.java
PS C:\Users\DIVYA\Desktop\22122142-MDS273L-JAVA\Lab 3> java lab3.java 
Start Program ------->
Enter Array length: 5
Enter value for1th element:
1
Enter value for2th element:
2
Enter value for3th element:
1
Enter value for4th element:
5
Enter value for5th element:
6
Elements in array with size5
[1, 2, 1, 5, 6]


Menu Options:
1. Find the mean value
2. Find the median value
3. Find the mode value
5. Exit
Enter your choice: 1
3.0


Menu Options:
1. Find the mean value
2. Find the median value
3. Find the mode value
5. Exit
Enter your choice: 2
2


Menu Options:
1. Find the mean value
2. Find the median value
3. Find the mode value
5. Exit
Enter your choice: 3
1

1. Find the mean value
2. Find the median value
3. Find the mode value
5. Exit
Enter your choice: 5
Invalid choice. Try again.
PS C:\Users\DIVYA\Desktop\22122142-MDS273L-JAVA\Lab 3> javac lab3.java
PS C:\Users\DIVYA\Desktop\22122142-MDS273L-JAVA\Lab 3> java lab3.java
Start Program ------->
Enter Array length: 5
Enter value for1th element:
1
Enter value for2th element:
1
Enter value for3th element:
2
Enter value for4th element:
4
Enter value for5th element:
6
Elements in array with size5
[1, 1, 2, 4, 6]


Menu Options:
1. Find the mean value      
2. Find the median value    
3. Find the mode value      
4. Exit
Enter your choice: 1
2.8


Menu Options:
1. Find the mean value  
2. Find the median value
3. Find the mode value  
4. Exit
Enter your choice: 2
2


Menu Options:
1. Find the mean value
2. Find the median value
3. Find the mode value
4. Exit
Enter your choice: 3
1


Menu Options:
1. Find the mean value
2. Find the median value
3. Find the mode value
4. Exit
Enter your choice: 4
Exiting the program.


Menu Options:
1. Find the mean value
2. Find the median value
3. Find the mode value
4. Exit
Enter your choice: 5
Invalid choice. Try again.


--------------------------------------------------------------------------------------------------------------------
Conclusion->
Demonstrated the use of functions for mathematical operations values - measure of central tendency

--------------------------------------------------END-----------------------------------------------------------------