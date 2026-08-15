import java.util.*;
public class palindrome{
    public static void main(String[] args) {
        String name ="vel";
        boolean k=palindrome(name,0,name.length()-1);
        System.out.println(k);
    }
    public static boolean palindrome(String name,int s,int e){
        if(s>=e){
            
            return true;
        }
        if(name.charAt(s)!=name.charAt(e)){
            return false;
        }
        return palindrome(name,s+1,e-1);

    }
}