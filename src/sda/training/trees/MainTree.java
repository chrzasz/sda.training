package sda.training.trees;

import java.util.List;
import java.util.Optional;
import java.util.Stack;

import sda.training.trees.SdaTreeImpl;

/*
	8
 9	    5
1 2	     6
 3 4 	7

 */


public class MainTree {
    public static void main(String[] args) {
        SdaTree exampleTree =
                SdaTree.of(8,
                        SdaTree.of(9,
                                SdaTree.leaf(1),
                                SdaTree.of(2,
                                        SdaTree.leaf(3),
                                        SdaTree.leaf(4))),
                        SdaTree.of(5,
                                null,
                                SdaTree.of(6,
                                        SdaTree.leaf(7),
                                        null)));
        System.out.print("--- Pre Order    : ");
        traversePreOrder(exampleTree);
        System.out.print("\n--- In Order     : ");
        traverseInOrder(exampleTree);
        System.out.print("\n--- Post Order   : ");
        traversePostOrder(exampleTree);

        System.out.print("\n--- Pre OrderIter: ");
        traversePreOrderIterative(exampleTree);

        System.out.print("\n--- Level Order  : ");
        traverseLevelOrder(exampleTree);

        System.out.println(countLeaves(exampleTree));

    }

    public static List<Integer> traversePreOrder(SdaTree tree) {
        System.out.print(" " + tree.getValue());

        // obie galezie musza byc Optional tak zeby nie wchodzil w null
        // wtedy nie mozna przyrownywac do null tylko trzeba robic .isPresent()
        Optional<SdaTree> leftSubTreeOptional = tree.getLeftChild();
        Optional<SdaTree> rightSubTreeOptional = tree.getRightChild();

        if (leftSubTreeOptional.isPresent()) {
            SdaTree leftSubTree = leftSubTreeOptional.get();
            traversePreOrder(leftSubTree);
        }

        if (rightSubTreeOptional.isPresent()) {
            SdaTree rightSubTree = rightSubTreeOptional.get();
            traversePreOrder(rightSubTree);
        }

        return null;
    }


    public static List<Integer> traverseInOrder(SdaTree tree) {
//        throw new UnsupportedOperationException("Not implemented yet");

        Optional<SdaTree> leftSubTreeOptional = tree.getLeftChild();
        Optional<SdaTree> rightSubTreeOptional = tree.getRightChild();

        if (leftSubTreeOptional.isPresent()) {
            SdaTree leftSubTree = leftSubTreeOptional.get();
            traverseInOrder(leftSubTree);
        }

        System.out.print(" " + tree.getValue());

        if (rightSubTreeOptional.isPresent()) {
            SdaTree rightSubTree = rightSubTreeOptional.get();
            traverseInOrder(rightSubTree);
        }

        return null;
    }

    public static List<Integer> traversePostOrder(SdaTree tree) {

        Optional<SdaTree> leftSubTreeOptional = tree.getLeftChild();
        Optional<SdaTree> rightSubTreeOptional = tree.getRightChild();

        if (leftSubTreeOptional.isPresent()) {
            SdaTree leftSubTree = leftSubTreeOptional.get();
            traversePostOrder(leftSubTree);
        }


        if (rightSubTreeOptional.isPresent()) {
            SdaTree rightSubTree = rightSubTreeOptional.get();
            traversePostOrder(rightSubTree);
        }
        System.out.print(" " + tree.getValue());


        return null;
    }

    public static List<Integer> traversePreOrderIterative(SdaTree tree) {
        Stack<SdaTree> sta = new Stack<SdaTree>();



        Optional<SdaTree> leftSubTreeOptional = tree.getLeftChild();
        Optional<SdaTree> rightSubTreeOptional = tree.getRightChild();

        sta.push(tree);

        while (!sta.isEmpty()) {
            SdaTree currentNode = sta.pop(); //peek


        }

        return null;
    }

    public static List<Integer> traverseLevelOrder(SdaTree tree) {
//        throw new UnsupportedOperationException("Not implemented yet");
        return null;
    }

    public static int countLeaves(SdaTree tree) {
//        throw new UnsupportedOperationException("Not implemented yet");
        return -1;
    }
}
