Question->
Create a student class, that will store the details of the Student
Reg. No.
Name
Email
Phone
Class
Department
The class will have a constructor to initialize the values of the Student and a method to print the Details of the Student.

In the main-method class, create an array of Student Class to hold maximum details of 100 Students.
In the menu-driven program, the menu options will have
Add a student
Adds the details of 1 student to the array of Student
Search for a student
Search for the details of a student from the array of Student
(Optional) Searching can be done with Name & Register Number
Display all students
Displays the details of all students
-------------------------------------------------------------------------------------------------------------

Code->

import java.util.Scanner;
public class lab5{
    private String regNo;
    private String name;
    private String email;

    public lab5(String regNo, String name, String email) {
        this.regNo = regNo;
        this.name = name;
        this.email = email;
    }
    public String getRegNo() {
        return regNo;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

        public static void main(String[] args) {
            lab5[] students = new lab5[100]; // Array to hold details of up to 100 students
            int studentCount = 0; // Keeps track of the number of students added so far
            Scanner scanner = new Scanner(System.in);
    
            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Add a student");
                System.out.println("2. Search for a student");
                System.out.println("3. Display all students");
                System.out.println("4. Exit");
    
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
    
                switch (choice) {
                    case 1:
                        // Add a student
                        System.out.print("Enter registration number: ");
                        String regNo = scanner.next();
                        System.out.print("Enter name: ");
                        String name = scanner.next();
                        System.out.print("Enter email: ");
                        String email = scanner.next();
    
                        students[studentCount] = new lab5(regNo, name, email);
                        studentCount++;
    
                        System.out.println("Student added successfully.");
                        break;
    
                    case 2:
                        // Search for a student
                        System.out.print("Enter registration number or name to search for: ");
                        String searchKey = scanner.next();
    
                        boolean found = false;
                        for (int i = 0; i < studentCount; i++) {
                            lab5 student = students[i];
                            if (student.getRegNo().equals(searchKey) || student.getName().equals(searchKey)) {
                                System.out.println("Student found:");
                                System.out.println("Registration number: " + student.getRegNo());
                                System.out.println("Name: " + student.getName());
                                System.out.println("Email: " + student.getEmail());
                                found = true;
                                break;
                            }}
                        
                    break;

                    case 3:
                    System.out.println("List of all students:");
                    for (int i = 0; i < 100; i++) {
                        lab5 student = students[i];
                        System.out.println(student.getRegNo() + ", " + student.getName() + ", " + student.getEmail());
                    }
                    break;
                    default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
                }}  
            }
        }

-------------------------------------------------------------------------------------------------------------
Output->

PS C:\Users\DIVYA\Desktop\22122142-MDS273L-JAVA>  c:; cd 'c:\Users\DIVYA\Desktop\22122142-MDS273L-JAVA'; & 'C:\Program Files\Java\jdk-19\bin\java.exe' '--enable-preview' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\DIVYA\AppData\Roaming\Code\User\workspaceStorage\4a57d9235b0ca19f6a160d66f18cccad\redhat.java\jdt_ws\22122142-MDS273L-JAVA_aa05e2fc\bin' 'lab5' 
Menu:
1. Add a student
2. Search for a student
3. Display all students
4. Exit
Enter your choice: 1
Enter registration number: 22122142
Enter name: Divya Ranka
Enter email: Student added successfully.
Menu:
1. Add a student
2. Search for a student
3. Display all students
4. Exit
Enter your choice: 3
List of all students:
22122142, Divya, Ranka

----------------------------------------------------------------------------------------------------