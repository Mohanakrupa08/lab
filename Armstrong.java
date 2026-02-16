import java.util.*;
public class Armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp,Armstrong=0;
        int original=n;

        while(n>0){
            temp=n%10;
            Armstrong+=(int) Math.pow(temp,3);
            n=n/10;
        }
        if(Armstrong==original){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}