package Strings;

public class printString {
    public static char print(String name, int index ){
        if(index==name.length()){
            return 0;
        }
        char smallproblem=print(name,index+1);
        System.out.println(name.charAt(index));

        return smallproblem;
    }
    public static void main(String[] args){
        String name="madam";
        print(name,0);
    }
}
