import java.util.*;
public class sorting{
    public static void main(String args[]){
        int arr[]={13,46,24,52,20,9};
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            int min=arr[i];
            for(int j=i;j<n;j++){
                if(arr[j]<arr[i]){
                    min=arr[j];
                }
                swap(arr,j,i);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int[] swap(int arr[],int j,int i){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
        return arr;
    }
    
}