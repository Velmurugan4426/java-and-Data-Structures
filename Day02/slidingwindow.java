/* BRUTE FORCE APPROACH

import java.util.*;
public class slidingwindow{
    public static void main(String[] args) {
        int arr[]={2,1,5,1,3,2,8,4};
        int n=arr.length;
        int k=3;
        int csum=0,msum=Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            csum=0;
            for(int j=i;j<i+k;j++){
                csum+=arr[j];
            }
            msum=Math.max(msum,csum);
        }
        System.out.println(msum);
    }
}

*/

//SLIDING WINDOW APPROACH

import java.util.*;
public class slidingwindow{
    public static void main(String[] args) {
        int arr[]={2,1,5,1,3,2,8,4};
        int n=arr.length;
        int k=3;
        int wsum=0,msum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
           wsum=wsum+arr[i]; 
        }
        for(int i=k;i<n;i++){
            wsum=wsum-arr[i-k]+arr[i];
            msum=Math.max(wsum,msum);
        }
        System.out.println(wsum);
    }
}