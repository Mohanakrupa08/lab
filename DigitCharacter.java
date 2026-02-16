import java.util.*;

public class DigitCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "a2b3c5";   

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {   
                digits.append(ch);
            } else {
                letters.append(ch);
            }
        }

        System.out.println(digits.toString() + letters.toString());
        sc.close();
    }
}
