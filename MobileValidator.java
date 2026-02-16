import java.util.regex.*;
public class MobileValidator {
    public static void main(String[] args){
        String mobile="9876543210";
        String regex="^[789]\\d{9}$";

        boolean isValid=mobile.matches(regex);
        System.out.println("Valid mobile:"+ isValid);
    }
}
