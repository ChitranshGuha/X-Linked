import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Club implements User,Postable {
    public Club(){
        notices = new ArrayList<>();
    }
    String clubid , name, emailid , password;
    private List<Notice> notices;
    public void reset(){
        clubid="" ;
        name="";
        emailid="" ;
        password="";
    }
    @Override
    public void postNotice(String noticeContent) {
        Notice notice = new Bulletin(noticeContent);
        notices.add(notice);
    }
    @Override
    public void displayNotices() {
        for (Notice notice : notices) {
            notice.display();
        }
    }
    public void getdata() {
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
        sc.close();
    }

    public void showdata() {
        System.out.println("Name: " + name);
        System.out.println("club id: " + clubid);
        System.out.println("Email id: " + emailid);
    }

    public int Login(String clid , String pwd) {
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
