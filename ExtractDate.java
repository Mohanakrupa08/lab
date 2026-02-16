import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractDate{
    public static void main(String[]args){
        String text="the event is scheduled on 29/03/2001.";
        String regex="\\b\\d{2}/\\d{2}/\\d{4}\\b";

        Matcher matcher=Pattern.compile(regex).matcher(text);
        if(matcher.find()){
            System.out.println("date found: "+matcher.group());
        }
        else{
            System.out.println("date not found");
        }
    }
}