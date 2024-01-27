//find the element with highest frequency
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        //using HasMap
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i=0; i<n; i++){
            int num=arr[i];
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num, map.get(num)+1);
            }
        }
        int max=0;
        int num=0;
        for(Map.Entry<Integer,Integer>i : map.entrySet()){
            if(i.getValue()>max){
                max=i.getValue();
                num=i.getKey();
            }
        }
        System.out.println(num);
    }
}