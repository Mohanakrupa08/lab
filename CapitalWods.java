import java.util.regex.*;
public class CapitalWods {
    public static void main(String[] args){
        String sentence="India is a beautiful Country with rich Culture.";
        String regex="\\b[A-Z][a-z]*\\b";

        Matcher matcher=Pattern.compile(regex).matcher(sentence);
        System.out.println("Capital words");
    }
}
