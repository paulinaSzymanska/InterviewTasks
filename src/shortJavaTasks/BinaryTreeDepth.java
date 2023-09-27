package src.shortJavaTasks;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

//Write a method that returns the maximum depth of a binary tree. The maximum depth is the number of nodes from the
//        root (inclusive) until the furthest node (inclusive).

public class BinaryTreeDepth {
    private static HashMap<Object, TreeNode> hashMap = new HashMap<Object, TreeNode>();

    public static void main(String[] args) {
        DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode("ZOO");
        DefaultMutableTreeNode birds = new DefaultMutableTreeNode("Birds");
        DefaultMutableTreeNode parrot = new DefaultMutableTreeNode("parrot");
        DefaultMutableTreeNode pigeon = new DefaultMutableTreeNode("pigeon");

        DefaultMutableTreeNode mammals = new DefaultMutableTreeNode("mammals");
        DefaultMutableTreeNode human = new DefaultMutableTreeNode("human");
        DefaultMutableTreeNode dog = new DefaultMutableTreeNode("dog");

        DefaultMutableTreeNode smallDog = new DefaultMutableTreeNode("puppy");
        DefaultMutableTreeNode unBornYet = new DefaultMutableTreeNode("embryo");

        defaultMutableTreeNode.add(birds);
        birds.add(parrot);
        birds.add(pigeon);

        defaultMutableTreeNode.add(mammals);
        mammals.add(human);
        mammals.add(dog);

        dog.add(smallDog);

        smallDog.add(unBornYet);

        System.out.println(countDepth(defaultMutableTreeNode));
    }


    private static HashMap<Object, TreeNode> saveDepthBinaryTree(TreeNode node) {
        for (Iterator<? extends TreeNode> it = node.children().asIterator(); it.hasNext(); ) {
            Object o = it.next();
            hashMap.put(o, node);
            if (o instanceof TreeNode) {
                int childCount1 = ((TreeNode) o).getChildCount();
                if (childCount1 > 0) {
                    saveDepthBinaryTree((TreeNode) o);
                }
            }
        }
        return hashMap;
    }

    private static Integer countDepth(TreeNode node) {
        saveDepthBinaryTree(node);
        HashSet<TreeNode> set = new HashSet<>();
        for (TreeNode value : hashMap.values()) {
            set.add(value);
        }
        return set.size() - 1;
    }
}
