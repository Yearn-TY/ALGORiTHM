package tree;

/**
 * @author all
 * @date 2022/11/15 12:03
 */

public class Node {
    private int value;
    private Node Left;
    private Node right;

    public Node getLeft() {
        return Left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        Left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
