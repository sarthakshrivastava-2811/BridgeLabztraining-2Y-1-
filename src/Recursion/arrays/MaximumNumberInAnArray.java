package Recursion.arrays;
import java.util.Scanner;
public class MaximumNumberInAnArray {
    public static int max(int arr[],int index){
        if(index == arr.length-1){
            return arr[index];
        }
        int max=max(arr,index+1);
        int maxnum = Math.max(arr[index], max);
        return maxnum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(max(arr,0));
    }

}
