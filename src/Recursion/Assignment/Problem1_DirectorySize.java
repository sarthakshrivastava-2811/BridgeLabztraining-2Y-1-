package Recursion.Assignment;

import java.util.*;

public class Problem1_DirectorySize {

    static class Node {
        String name;
        int size;
        List<Node> kids = new ArrayList<>();

        Node(String name, int size) {
            this.name = name;
            this.size = size;
        }

        Node add(Node kid) {
            kids.add(kid);
            return this;
        }
    }

    static int total(Node node, Set<Node> seen) {
        if (!seen.add(node)) return 0;
        int sum = node.size;
        for (Node kid : node.kids) sum += total(kid, seen);
        return sum;
    }

    static int totalIterative(Node root) {
        int sum = 0;
        Set<Node> seen = new HashSet<>();
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if (!seen.add(node)) continue;
            sum += node.size;
            for (Node kid : node.kids) stack.push(kid);
        }
        return sum;
    }

    public static void main(String[] args) {
        Node guides = new Node("guides", 0).add(new Node("setup.pdf", 200));
        Node docs = new Node("docs", 0).add(new Node("readme.txt", 10)).add(guides);
        Node src = new Node("src", 0).add(new Node("main.java", 100)).add(new Node("utils.java", 50));
        Node project = new Node("project", 0).add(src).add(docs).add(new Node("config.xml", 20));

        System.out.println(total(project, new HashSet<>()));
        System.out.println(totalIterative(project));

        guides.add(project);
        System.out.println(total(project, new HashSet<>()));
    }
}
