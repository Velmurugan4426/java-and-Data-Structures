import java.util.*;
public class mergesort{
    public static void main(String args[]){
        int arr[]={3,1,2,4,1,5,2,6,4};
        int low=0,high=arr.length-1;
        mergesort(arr,low,high);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void mergesort(int []arr,int low,int high){
        if(low>=high)return;
        int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        msort(arr,low,mid,high);
    }
    public static void msort(int arr[],int low,int mid,int high){
        int []temp=new int[arr.length];
        int j=0;
        int left=low,right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]>=arr[right]){
                temp[j++]=arr[right];
                right++;
            }
            else{
                temp[j++]=arr[left];
                left++;
            }
        }
        while(left>mid && right<=high){//copy right array
                temp[j++]=arr[right];
                right++;
        }
        while(right>high && left<=mid){//copy left array
                temp[j++]=arr[left];
                left++;
        }
        for(int i=low;i<=high;i++){//i-low is because the temp array varies each time
            arr[i]=temp[i-low];
        }
        
    }
}