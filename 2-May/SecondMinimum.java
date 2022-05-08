import java.util.*;
public class SecondMinimum{

    static int findMin(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }

        int second_min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(second_min>arr[i] && arr[i]!=min){
                second_min = arr[i];
            }
        }
        return second_min;
    }

    static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[1];
    }
    public static void main(String args[]){
        int arr[] = {10,9,18,2,0,1,8};
        int min1 = findMin(arr);
        int min2 = sort(arr);
        System.out.println(min1);
        System.out.println(min2);
    }
}
