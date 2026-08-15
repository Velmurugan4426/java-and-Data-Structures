import java.util.*;
public class fibonacci{
    public static void main(String[] args) {
        int n=10;
        fibonacci(n,0,1);
    }
    public static void fibonacci(int n,int a,int b){
        if(n==0){
            return;
        }
        
        System.out.println(a);
        int c=a+b;
        a=b;
        b=c;
        fibonacci(n-1,a,b);
    }
}