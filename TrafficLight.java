import java.util.*;
public class TrafficLight{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the color(red,yellow,green):");
        String color=sc.next().toLowerCase();
        if(color.equals("red")){
            System.out.println("STOP");
        }
        else if(color.equals("green")){
            System.out.println("GO");
        }
        else if(color.equals("yellow")){
             System.out.println("READY TO GO");
        }
        else{
            System.out.println("entered invalis color");
    
        }
    }
}