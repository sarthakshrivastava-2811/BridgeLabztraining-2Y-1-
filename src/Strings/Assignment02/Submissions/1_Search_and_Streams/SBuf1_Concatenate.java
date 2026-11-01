import java.util.Scanner;

public class SBuf1_Concatenate {

    static String concatenate(String[] words) {
        StringBuffer buffer = new StringBuffer();
        for (String word : words) buffer.append(word);
        return buffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(concatenate(new Scanner(System.in).nextLine().split(" ")));
    }
}
