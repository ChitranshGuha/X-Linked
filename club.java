import java.util.Scanner;
public class Club implements User{
    String clubid , name, emailid , password;
    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("* Enter Information *");
        System.out.print("Name:");
        name = sc.next();
        System.out.print("club id:");
        clubid = sc.next();
        System.out.print("Password:");
        password = sc.next();
        System.out.print("Email id:");
        emailid = sc.next();
    }

    void showdata() {
        System.out.println("Name: " + name);
        System.out.println("club id: " + clubid);
        System.out.println("Email id: " + emailid);
    }

    int Login(String clid, String pwd) {
        if (clubid.equals(clid) && password.equals(pwd)) {
            System.out.println("Login Complete");
            return 1;
        }
        else {
            System.out.println("Incorrect Credentials");
            return 0;
        }
    }
}
