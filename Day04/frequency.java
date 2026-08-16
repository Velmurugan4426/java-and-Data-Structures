//brute force approach 
// FOR INTEGER
/*
import java.util.*;
public class frequency{
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,3,4};
        int n=arr.length;
        int count[]=new int[n];//the size varies according to the size of an array
        for (int i=0;i<n;i++){
            count[arr[i]]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                System.out.println(i+"->"+count[i]);
            }
            
        }
    }
}
*/

/*
import java.util.*;
public class frequency{
    public static void main(String args[]){
        String name="abcbcade";
        int freq[]=new int[256];
        for(int i=0;i<name.length();i++){
            freq[name.charAt(i)-'a']++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                System.out.println((char)(i+'a')+"->"+freq[i]);
            }
        }
    }
}
*/

/*
import java.util.*;
public class frequency{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,8,5,3,2,1};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
*/

//HIGHEST OCCURING ELEMENT IN AN ARRAY
//if all element has same frequency then print all element containing the same frequency
import java.util.*;
public class frequency{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,1};
        HashMap<Integer,Integer>map=new HashMap<>();
        int maxfreq=0;
        int maxelement=0;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])>maxfreq){
                maxfreq=map.get(arr[i]);
                maxelement=arr[i];
            }
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==maxfreq){
                System.out.println(entry.getKey()+"->"+maxfreq);
            }
        }
        
    }
}