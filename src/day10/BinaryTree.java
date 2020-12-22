package day10;

import java.util.ArrayList;
import java.util.Iterator;

public class BinaryTree {

    Node root;
    //private int counter;

    public void add(int value) {
        // Случай 1: Если дерево пустое, просто создаем корневой узел.
        if (root == null) {
            root = new Node(value);
        }
        // Случай 2: Дерево не пустое =>
        // ищем правильное место для вставки.
        else {
            addTo(root, value);
        }

        //counter++;
    }
    // Рекурсивная ставка.
    private void addTo(Node node, int value)
    {
        // Случай 1: Вставляемое значение меньше значения узла
        if (value<node.getValue())
        {
            // Если нет левого поддерева, добавляем значение в левого ребенка,
            if (node.getLeft() == null)
            {
                node.setLeft(new Node(value));
            }
            else
            {
                // в противном случае повторяем для левого поддерева.
                addTo(node.getLeft(), value);
            }
        }
        // Случай 2: Вставляемое значение больше или равно значению узла.
        else
        {
            // Если нет правого поддерева, добавляем значение в правого ребенка,
            if (node.getRight() == null)
            {
                node.setRight(new Node(value));
            }
            else
            {
                // в противном случае повторяем для правого поддерева.
                addTo(node.getRight() , value);
            }
        }
    }
    public void printTree() {

        ArrayList<Node> currentLevel = new ArrayList<>();
        ArrayList<Node> nextLevel = new ArrayList<>();
        StringBuilder s1=new StringBuilder();

        currentLevel.add(root);

        while (!currentLevel.isEmpty()) {
            System.out.println(s1);
            Iterator<Node> iter = currentLevel.iterator();
            s1.setLength(0);
            while (iter.hasNext()) {
                Node currentNode = iter.next();
                if (currentNode.getLeft() != null) {
                    nextLevel.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    nextLevel.add(currentNode.getRight());
                }
                for(int i=0;i<currentNode.getValue();i++) {
                    System.out.print(" ");
                    s1.append(" ");
                }
                if(currentNode.getLeft()!=null && currentNode.getRight()!=null) {

                    s1.append(" ".repeat(Math.max(0, String.valueOf(Math.abs(currentNode.getValue())).length() - 1)));
                    s1.deleteCharAt(s1.length()-1);
                    s1.deleteCharAt(s1.length()-1);
                    s1.append("_|_");
                }
                else if(currentNode.getLeft()!=null ){
                    s1.append(" ".repeat(Math.max(0, String.valueOf(Math.abs(currentNode.getValue())).length() - 2)));
                    s1.append("_|");

                }
                else if(currentNode.getRight()!=null ){
                    s1.append(" ".repeat(Math.max(0, String.valueOf(Math.abs(currentNode.getValue())).length() - 2)));
                    s1.append("|_");

                }
                else{
                    s1.append(" ".repeat(String.valueOf(Math.abs(currentNode.getValue())).length()));
                }

                System.out.print(currentNode.getValue());
            }
            System.out.println();
            currentLevel = nextLevel;
            nextLevel = new ArrayList<>();

        }

    }

}

class Node {
    private static Node root;//корень
    private final int value; //значение узле
    private Node Left; //левый потомок
    private Node Right; //правый потомок
    //private Node Parent; // родитель

    public Node(int value) {
        this.value = value;
        if (root == null) {
            root = this;
            //Parent = this;
        }

    }

    public int getValue() {
        return this.value;
    }

    public Node getLeft() {
        return Left;
    }

    public Node getRight() {
        return Right;
    }

    // public void setValue(int value) {  this.value = value; }

    public void setLeft(Node left) {
        Left = left;
    }

    public void setRight(Node right) {
        Right = right;
    }

}
