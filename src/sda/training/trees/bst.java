package sda.training.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class SdaBstImpl<T extends Comparable<T>> { //tylko typy ktore moga sie porownywac ze soba moga byc na drzewie //ew. moze byc comparator

    private Node root;

    public SdaBstImpl(T[] elements) {
        for (T element : elements) {
            insert(element);
        }
    }

    public void insert(T element) {
        if (root == null) {
            root = new Node(element, null, null);
        } else {
            insert(root, element);
        }
    }

    private void insert(Node node, T element) {
        if (node.value.compareTo(element) < 0) {
            if (node.right == null) {
                node.right = new Node(element, null, null);
            } else {
                insert(node.right, element);
            }
        } else if (node.value.compareTo(element) > 0) {
            if (node.left == null) {
                node.left = new Node(element, null, null);
            } else {
                insert(node.left, element);
            }
        } else {
            node.value = element;
        }
    }

    public boolean contains(T element) {
        return contains(root, element);
    }

    private boolean contains(Node node, T element) {
        if (node == null) {
            return false;
        } else {
            int compare = element.compareTo(node.value);
            if (compare == 0) return true;
            if (compare > 0) return contains(node.right, element);
            if (compare < 0) return contains(node.left, element);
            throw new RuntimeException("we should not be here");
        }
    }

    public void delete(T element) {
        root = delete(root, element);
    }

    private Node delete(Node node, T element) {
        if (node == null) {                             // ¯\_(ツ)_/¯
            return null;
        } else if (node.value.compareTo(element) < 0) { // węzeł do usunięcia znajduje się w prawym poddrzewie
            node.right = delete(node.right, element);
            return node;
        } else if (node.value.compareTo(element) > 0) { // węzeł do usunięcia znajduje się w lewym poddrzewie
            node.left = delete(node.left, element);
            return node;
        } else if (node.left == null) {                 // węzeł do usunięcia ma co najwyżej prawe dziecko
            return node.right;
        } else if (node.right == null) {                // węzeł do usunięcia ma co najwyżej lewe dziecko
            return node.left;
        } else {                                        // węzeł do usunięcia ma dwoje dzieci
            Node successor = node.right;
            while (successor.left != null) {
                successor = successor.left;
            }
            delete(node, successor.value);
            node.value = successor.value;
            return node;
        }
    }

    public List<T> toList() {
        List<T> list = new ArrayList<>();
        inOrder(root, list::add);
        return list;
    }

    private void inOrder(Node node, Consumer<T> visitor) {
        if (node == null) {
            return;
        }
        inOrder(node.left, visitor);
        visitor.accept(node.value);
        inOrder(node.right, visitor);
    }

    private class Node {

        private T value;
        private Node left;
        private Node right;

        public Node(T value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}