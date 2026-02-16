import java.util.*;
public class Divisible{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("The number is divisible by 3 and 5 ");

        }
        else{
            System.out.println("Number is not divisible by 3 and 5");
        }
    }
}