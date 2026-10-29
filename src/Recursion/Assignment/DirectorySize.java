package Recursion.Assignment;

public class DirectorySize {

    static class Item {
        String name;
        int size;
        boolean isFile;
        Item[] contents;

        Item(String name, int size) {
            this.name = name;
            this.size = size;
            this.isFile = true;
        }

        Item(String name, Item[] contents) {
            this.name = name;
            this.contents = contents;
            this.isFile = false;
        }
    }

    static int totalSize(Item item) {
        if (item.isFile) {
            return item.size;
        }
        int sum = 0;
        for (int i = 0; i < item.contents.length; i++) {
            sum += totalSize(item.contents[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        Item guides = new Item("guides", new Item[] {
                new Item("setup.pdf", 200)
        });

        Item docs = new Item("docs", new Item[] {
                new Item("readme.txt", 10),
                guides
        });

        Item src = new Item("src", new Item[] {
                new Item("main.java", 100),
                new Item("utils.java", 50)
        });

        Item project = new Item("project", new Item[] {
                src,
                docs,
                new Item("config.xml", 20)
        });

        System.out.println("Total size: " + totalSize(project) + " KB");
    }
}