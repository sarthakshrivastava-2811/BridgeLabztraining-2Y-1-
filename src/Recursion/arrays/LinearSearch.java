package Recursion.arrays;

public class LinearSearch {
    public static int lc(int arr[],int target,int index){
        if(index == arr.length){
            return  -1;

        }
        if(arr[index]==target){
            return index;
        }
        return lc(arr,target,index+1);
    }
    public static void main(String[] args){
        int arr[]={12,1234,123,1245,4563};
        int target = 123;
        System.out.println(lc(arr,target,0));
    }
}
