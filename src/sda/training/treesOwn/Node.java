package sda.training.treesOwn;

/**
 * Created by Grzegorz Chrzaszczyk on 21-10-2018  10:18 AM
 */
public class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

}