// Write a Java Program that will collect your basic details that fall into different data types
//  and displays them.
// After the details have been displayed, with the help of conditional statements,
//  check if the gender of the user is 'm' or 'f'. It should print "MALE" for 'm' and "FEMALE" for 'f'.
// Assume that you can divide the states among India into four different regions (North, South, East, and West).
//  If you are from the southern part of India; with the help of a switch statement,
//   it should display The Student is from the southern states of India", along with the basic details.

import java.util.Scanner;
class Part1{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your details please ->");
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Enter your gender:");
        
        //for gender char ,its nextLine().charAt(0);
        char gender = scan.nextLine().charAt(0);
    


        if(gender=='m'){   //char be single quotes
            System.out.println("Your Gender is Male");
        }
        else if(gender=='f'){
            System.out.println("Your Gender is Female");
        }

        System.out.println("Enter your state:");
        String st = scan.nextLine();
        System.out.println("State entered by user:"+st);

        switch(st){
            
            case "Andhra Pardesh":
            case "Karnataka":
            case "Kerala":
            case "Tamilnadu":
            case "Telangana":
            System.out.println("Student is from the southern states of India");
            break;

            
            case "Delhi":
            case "Ladakh":
            case "Jammu and Kashmir":
            case "Chandigarh":
            case "Haryana":
            case "Himachal Pradesh":
            case "Uttar Pradesh":
            case "Punjab":
            case "Uttarakhand":
            case "Rajasthan":
            System.out.println("Student is from the northern states of India");
            break;


            case "Gujarat":
            case "Maharashtra":
            System.out.println("Student is from the western states of India");
            break;

            case "Odisha":
            case "West Bengal":
            System.out.println("Student is from the eastern states of India");
            break;
            
            
            default:
                System.out.println("Invalid output");
                break;

        }
    
    
    
    }
}