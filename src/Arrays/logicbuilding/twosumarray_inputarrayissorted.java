package Arrays.logicbuilding;
import java.util.Scanner;

public class twosumarray_inputarrayissorted {
    static int[] twoSum(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if(sum == target) {return new int[]{start, end};}
            if(sum > target) {end--;}
            else {start++;}
        }
        return new int[]{-1, -1};
    }
}
    
