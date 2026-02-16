import java.util.*;
public class Discount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Double a=sc.nextDouble();
        double discount;
        if(a>=5000){
            discount=a*0.2;
        }
        else if(a>=3000){
            discount=a*0.10;
        }
        else{
            discount=0;
        }
        System.out.println("no discount");
    }
    
}
