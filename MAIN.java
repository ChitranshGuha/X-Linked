import java.util.Scanner;
public class MAIN {
    public static void main(String args[]){
        int ch , flag=0 , ch1;
        System.out.println("X_Linkedin");
        Club c = new Club();
        Student s = new Student();
        while (true) {
        System.out.println("Choose:");
        System.out.println("1:Student");
        System.out.println("2:Club");
        System.out.println("3:Exit");
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        System.out.println("");
        
            if(ch==1){
                System.out.println("Choose:");
                System.out.println("1:Sign up");
                System.out.println("2:Login");
                ch1 = sc.nextInt();
                System.out.println("");
                if(ch1==1){
                    s.getdata();
                    s.showdata();
                }
                else if(ch1==2){
                    System.out.println("Hello again");
                    String enn , pwd;
                    System.out.println("Enter enrollment number:");
                    enn=sc.next();
                    System.out.println("Enter password");
                    pwd=sc.next();
                    System.out.println("");                  
                    flag=s.Login(enn,pwd);
                }
                else{
                    continue;
                }
                if(flag==1){
                    System.out.println("Choose:");
                    System.out.println("1:Show Updates");
                    System.out.println("2:Search Club");
                    System.out.println("3:Sign out");
                    int ch2 = sc.nextInt();
                    System.out.println("");
                    if(ch2==1){
                        c.displayNotices();
                    }
                    else if(ch2==2){
                        String Search;
                        Search=sc.next();
                        System.out.println("");
                        if(c.name.equals(Search)){
                            c.displayNotices();
                        }
                        else{
                            System.out.println("No match :(");
                        }
                    }
                    else if(ch2==3){
                        s.reset();
                        continue;
                    }
                }

            }
            else if(ch==2){
                System.out.println("Choose:");
                System.out.println("1:Sign up");
                System.out.println("2:Login");
                ch1 = sc.nextInt();
                System.out.println("");
                if(ch1==1){
                    c.getdata();
                    c.showdata();
                    flag=1;
                }
                else if(ch1==2){
                    System.out.println("Hello again");
                    String clid , pwd;
                    System.out.println("Enter club id:");
                    clid=sc.next();
                    System.out.println("Enter password");
                    pwd=sc.next();
                    System.out.println("");
                    flag=c.Login(clid,pwd);
                }
                else{
                    continue;
                }
                if(flag==1){
                    System.out.println("Enter Choice:");
                    System.out.println("1:Put up Notice");
                    System.out.println("2:Sign out");
                    int ch2 = sc.nextInt();
                    System.out.println("");
                    if(ch2==1){
                        System.out.print("Enter the Notice:");
                        String NOTICE=sc.next();
                        c.postNotice(NOTICE);
                        System.out.println("");
                    }
                    else if(ch2==2){
                        c.reset();
                        continue;
                    }
                }
            }
            else if(ch==3){
                System.exit(0);
            }
            else{
                System.out.println("Invalid Choice :(");
            }
            sc.close();
        }
    }
}
