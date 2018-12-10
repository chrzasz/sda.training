package sda.training.treesOwn;

/**
 * Created by Grzegorz Chrzaszczyk on 21-10-2018  10:21 AM
 */
public class Runner {

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        bt.add(1);
        bt.add(2);
        bt.add(3);
        System.out.println(bt.root.value);

        System.out.println(bt.containsNode(0));
        System.out.println(bt.containsNode(1));



    }


}
