import java.util.*;
public class Frequency {
    public static void main(String args[]){
        String arr[] = {"India","Australia","Japan","India"};
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for(String i : map.keySet()){
            System.out.println(i+" -> "+map.get(i));
        }

    }
}
