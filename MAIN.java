import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        int ch , flag , ch1;
        System.out.println("X + Linkedin");
        System.out.println("Choose:");
        System.out.println("1:Student");
        System.out.println("2:Club");
        System.out.println("3:Exit");
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        if(ch==1){
            System.out.println("Choose:");
            System.out.println("1:Sign up");
            System.out.println("2:Login");
            ch1 = sc.nextInt();
            if(ch1==1){
                Student s = new Student();
                s.getdata();
            }
            else if(ch1==2){
                System.out.println("Hello again");
                String enn , pwd;
                System.out.println("Enter enrollment number:");
                enn=sc.next();
                System.out.print("Enter password");
                pwd=sc.next();
                flag=s.StuLogin(enn,pwd);
            }
        }
        else if(ch==2){
            System.out.println("Choose:");
            System.out.println("1:Sign up");
            System.out.println("2:Login");
        }
        else if(ch==3){

        }
        else{

        }
    }
    
}
