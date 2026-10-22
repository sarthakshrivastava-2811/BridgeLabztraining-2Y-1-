package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class FindSubSequence {
    public static ArrayList<String> findSubsequences(String s) {
        if (s.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }

        char firstCharacter = s.charAt(0);
        ArrayList<String> smallerSubsequences = findSubsequences(s.substring(1));
        ArrayList<String> result = new ArrayList<>(smallerSubsequences.size() * 2);
        for (String subsequence : smallerSubsequences) {
            result.add(subsequence);
            result.add(firstCharacter + subsequence);
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> ans = findSubsequences(s);
        System.out.println(ans);
    }
}
