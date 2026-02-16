import java.util.regex.*;
public class EmailValidator {
    public static void main(String[] args){
        String email="user.name123@example.com";
        String regex= "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";

        boolean isValid=email.matches(regex);
        System.out.println("Valid Email: "+ isValid);
    }
}
