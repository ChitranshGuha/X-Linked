import java.util.Scanner;
class dob {
    int date, month, year;
}
public class Student {
    int sem;
    String enrollmentNo, name, emailid, password;
    dob DOB = new dob();

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("* Enter Information *");
        System.out.print("Name:");
        name = sc.next();
        System.out.print("Enrollment number:");
        enrollmentNo = sc.next();
        System.out.print("Password:");
        password = sc.next();
        System.out.print("Email id:");
        emailid = sc.next();
        System.out.println("Date of Birth");
        System.out.print("Date:");
        DOB.date = sc.nextInt();
        System.out.print("Month:");
        DOB.month = sc.nextInt();
        System.out.print("Year:");
        DOB.year = sc.nextInt();
        System.out.println("Current Semester:");
        sem = sc.nextInt();
    }

    void showdata() {
        System.out.println("Name: " + name);
        System.out.println("Enrollment number: " + enrollmentNo);
        System.out.println("Email id: " + emailid);
        System.out.println("Date of Birth (dd mm yy): " + DOB.date + " " + DOB.month + " " + DOB.year);
        System.out.println("Semester: " + sem);
    }

    int Login(String enn, String pwd) {
        if (enrollmentNo.equals(enn) && password.equals(pwd)) {
            System.out.println("Login Complete");
            return 1;
        }
        else {
            System.out.println("Incorrect Credentials");
            return 0;
        }
    }
}
