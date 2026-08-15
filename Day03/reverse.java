import java.util.*;
public class reverse{
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static int [] reverse(int []arr,int s,int e){
        
        if(s>=e){
            return arr;
        }
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;
        return reverse(arr,s,e);
    }
}