import java.util.*;
public class Anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        char[] ch1=s1.toCharArray();

        String s2=sc.nextLine();
        char[] ch2=s2.toCharArray();
        int check=0;
        for(int i=0;i<ch1.length;i++){
            for(int j=0;j<ch2.length;j++){
                if(ch1[i]==ch2[j]){
                    check++;
                    break;
                }
            }
        }
        if(ch1.length==ch2.length && check==ch1.length){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    
}
