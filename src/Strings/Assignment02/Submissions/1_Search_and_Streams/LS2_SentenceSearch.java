import java.util.Scanner;

public class LS2_SentenceSearch {

    static String findSentence(String[] sentences, String word) {
        for (String sentence : sentences)
            if (sentence.contains(word)) return sentence;
        return "Not Found";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sentences = new String[Integer.parseInt(sc.nextLine().trim())];
        for (int i = 0; i < sentences.length; i++) sentences[i] = sc.nextLine();
        System.out.println(findSentence(sentences, sc.nextLine()));
    }
}
