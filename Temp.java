import java.util.*;
public class Temp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Temperature=sc.nextInt();
        if(Temperature>35){
            System.out.println("It is extremly hot");
        }
        else if(Temperature<50){
            System.out.println("It is extremly cold");
        }
        else{
            System.out.println("Moderate");
        }
    }
}