import java.io.Console;
import java.util.Scanner;  

public class Index{
    public void login() {
        System.out.println("MARKETING");
        System.out.println("Sign in to Continue!");
        System.out.println("Username:");

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        System.out.println("Password:");
        String password = hidePassword();

        
        if (username.equals("admin") && password.equals("password")) {
            System.out.println("Login successful!");
            //home()
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    public void home(){
        System.out.println("1. Add Student");
        System.out.println("2. View Student Information/List");
        System.out.println("3. Add Staff");
        System.out.println("4. View Staff Informartion/List");
        System.out.println("5. Sign Out");
        System.out.print("Select an option: \n");
        int option = scanner.nextInt();
        scanner.nextLine(); 

            switch (option) {
            case 1: 
              addStudent();
              break;
            case 2:
              studentList();
              break;
            case 3:
              addStaff();
              break;
            case 4:
              staffList();
              break;
            case 5:
              login();
              break;
            }

    }
    public void addStudent(){
      //yawa ka anhi diri francis
    }

    public void studentList(){
      //======
    }

    public void addStaff(){
      //=====
    }

    public void staffList(){
      //=====
    }


    private static String hidePassword() {
        Console console = System.console();
        if (console == null) {
            
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        } else {
            
            char[] passwordChars = console.readPassword();
            return new String(passwordChars);
        }
    }

}