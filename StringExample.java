import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class StringExample {
    public static void main(String[] args){
        Pattern p=Pattern.compile(".m");
        Matcher m=p.matcher("am");

        boolean b1=m.matches();
        System.out.println(b1);

        boolean b2=Pattern.matches(".m","am");
        System.out.println(b2);

        System.out.println(Pattern.matches("[^amn]", "a"));
        System.out.println(Pattern.matches("[amn]","acd"));
        System.out.println(Pattern.matches("[a-zA-S]","To"));



    }
    
    
}
