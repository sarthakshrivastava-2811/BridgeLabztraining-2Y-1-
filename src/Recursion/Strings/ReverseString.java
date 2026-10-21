package Recursion.Strings;

public class ReverseString {
    public static void reverse(String name, int index ){
        if(index==name.length()){
            return;
        }
        reverse(name,index+1);
        System.out.print(name.charAt(index));
    }
    public static void main(String[] args){
        String name="ararod ak aam ik ASD";
        reverse(name,0);
    }
}
