import java.util.*;
public class SumOfUnique {

    public static int sumOfUnique(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int sum=0;
        for(int i : map.keySet()){
            if(map.get(i) == 1){
                sum += i;
            }
           
        }
        
        return sum;
        
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,2};
        System.out.println(sumOfUnique(arr));
    }
    
}
