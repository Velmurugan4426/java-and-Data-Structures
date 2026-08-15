import java.util.*;
public class factorial{
    public static void main(String args[]){
        int n=5,k=1;
        factorial(n,k);
    }
    public static void factorial(int n,int k){
        if(n<=1){
            System.out.println(k);
            return;
        }
        k=k*(n);
        n--;
        factorial(n,k);
    }
}