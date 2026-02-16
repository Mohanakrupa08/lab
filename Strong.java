import java.util.*;
public class Strong{
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0,strong=0,copy=n;
        
        while(n>0){
            temp=n%10;
            int x=fact(temp);
            strong=strong+x;
            n=n/10;
        }
        if(copy==strong){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static int fact(int y){
        int f=1;
        for(int i=y;i>0;i--){
            f=f*i;
        }
        return f;
    }
    
}