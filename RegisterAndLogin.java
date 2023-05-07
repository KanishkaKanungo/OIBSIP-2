import java.sql.SQLOutput;
import java.util.Scanner;

public class RegisterAndLogin {
    private String userName;
    private String password;
    private int choice;
    Scanner scan = new Scanner(System.in);
    public RegisterAndLogin(){
        String a = """
                ************************
                WELCOME TO ATM INTERFACE
               ***************************
               
             Press-
               1 -------> Register
               2 -------> Login
                """;
        System.out.println(a);
    }
    public void register(){
        System.out.print("Enter your choice: ");
        choice = scan.nextInt();
        if(choice == 1){
            inputRegister();
        }
        else if(choice ==2){
            inputLogin();
        }
        else{
            System.out.println("Invalid Choice !!");
            register();
        }
    }
    public void inputRegister() {
        String a="""
                      
                      REGISTER
                """;
        System.out.println(a);
        System.out.print("Enter UserName: ");
        userName = scan.next();
        System.out.println("Enter Password:\n"+"Note* - The password should not have more than 5 characters");
        password = scan.next();
        if(password.length()!=5){
            System.out.println("Invalid Password !!\n"+"Try Again");
            System.out.println("Enter Password Again:");
            password = scan.next();
        }

            System.out.println("Registered Successfully !!");
        inputLogin();

    }
    public void inputLogin() {
        String a="""
                      
                      LOGIN
                """;
        System.out.println(a);
        System.out.print("Enter UserName: ");
        String loginUserName = scan.next();
        System.out.print("Enter Password: ");
        String loginPassword = scan.next();
        if(password.length()!=5){
            System.out.println("Invalid Password !!\n"+"Try Again");
            System.out.println("Enter Password:");
            password = scan.next();
        }
        else if(!loginUserName.equals(userName)|| !loginPassword.equals(password)){
            System.out.println("Invalid Password/UserName");
            inputLogin();
        }
        else {
            System.out.println();
            System.out.println("LoggedIn Successfully !!");
        }
    }

    public String getUserName() {
        return userName;
    }
}
