package Recursion.arrays;

public class SumOfArrayElements {
    public static int sum(int[] arr,int index){
        if(index == arr.length){
            return 0;
        }

        return arr[index] + sum(arr,index+1);
    }
    public static void main(String []args){
        int arr[]={12,1234,123,1245,4563};
        System.out.println(sum(arr,0));
    }

}
