import java.util.*;
public class Login{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String strongusername=sc.nextLine();
        String strongpassword=sc.nextLine();
        String username=sc.nextLine();
        String password=sc.nextLine();

        if(strongusername.equals(username) && strongpassword.equals(password)){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Login Failed");
        }
    }
}
