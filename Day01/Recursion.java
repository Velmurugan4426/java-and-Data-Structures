/*
//print names 5 times using recursion
import java.util.*;
public class Recursion{
    public static void main(String args[]){
        String name="vel";
        print(name,5);
    }
    static void print(String name,int count){
        if(count<=0){
            return ;
        }
        System.out.println(name);
        count--;
        print(name,count);
    }
    
}
*/


/*
//print number from reverse using recursion
public class Recursion{
    public static void main(String[] args) {
         print(5);
    }
    static void print(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        
        print(--n);//here n-- wont work post decrement so again and again 5 will run
    }

}
*/

/*
//recursion (print after recursion statement)
import java.util.*;
public class Recursion{
    public static void main(String[] args) {
        int i=1,n=5;
        print(i,n);
    }
    static void print(int i,int n){
        if(n<i){
            return;
        }
        print(i,n-1);
        System.err.println(n);
    }
}
*/

//sum of n numbers using recursion
import java.util.*;
public class Recursion{
    public static void main(String args[]){
        
        int ans=print(5,0);
        System.out.println(ans);
    }
    static int print(int i,int sum){
        if(i<1){
            return sum;
        }
        return print(i-1,sum+i);
    }
}