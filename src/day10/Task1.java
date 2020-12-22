package day10;

public class Task1 {
    public static void main(String [] args) {
        int[] numbers = {20,14,23,11,16,5,8,15,18,22,27,24,150};
        BinaryTree tree = new BinaryTree();
        for (int number : numbers) {
            tree.add(number);
        }
        tree.printTree();

    }
}

