import java.util.*;
public class Parking{
    public static double parkingSystem(int hoursParked){
        double totalFee = 0.0;
        if(hoursParked <= 0){
            totalFee = 0.0;
        }else if(hoursParked <= 2){
            totalFee = 50.0;
        }else if(hoursParked <= 5){
            totalFee = 50.0;
            totalFee += (hoursParked - 2 )*30.0;
        }else{
            totalFee = 50.0;
            totalFee += 3*30.0;
            totalFee += (hoursParked-5)*20.0;
        }
        return totalFee;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int hoursParked=sc.nextInt();
        System.out.println(parkingSystem(hoursParked));
    }
}