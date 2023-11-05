import java.util.Scanner;
class dob {
    int date, month, year;
}
public class Student implements User {
    int sem;
    String enrollmentNo, name, emailid, password;
    dob DOB = new dob();
    Scanner sc = new Scanner(System.in);
    public void reset(){
        sem=0;
        enrollmentNo="";
        name="";
        emailid="";
        password="";
        DOB.date=0;
        DOB.month=0;
        DOB.year=0;
    }
    public void getdata() {
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

    public void showdata() {
        System.out.println("Name: " + name);
        System.out.println("Enrollment number: " + enrollmentNo);
        System.out.println("Email id: " + emailid);
        System.out.println("Date of Birth (dd mm yy): " + DOB.date + " " + DOB.month + " " + DOB.year);
        System.out.println("Semester: " + sem);
    }

    public int Login(String enn , String pwd) {
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
