package Tree;
import com.sun.source.util.Trees;

import java.util.TreeSet;

public class ChildrenSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(35);

        root.left = new TreeNode(9);
        root.left.left = new TreeNode(43);
        root.left.right = new TreeNode(14);
//        root.left.right = new TreeNode(5);
//        root.left.right.left = new TreeNode(6);

        root.right = new TreeNode(10);
        root.right.left = new TreeNode(7);
        root.right.right= new TreeNode(9);
        System.out.println(root.val);
        childSum(root);
        System.out.println(root.val);


    }

    public static void childSum(TreeNode root){
        if(root == null){
            return;
        }
        int child = 0;
        if(root.left != null){
            child += root.left.val;
        }
        if(root.right != null){
            child += root.right.val;
        }
//        if(child >= root.val){
//            root.val = child;
//        }
        if(child < root.val){
            if(root.left != null){
                root.left.val = root.val;
            }
            else if(root.right != null){
                root.right.val = root.val;
            }
        }
        childSum(root.left);
        childSum(root.right);

        int total = 0;
        if(root.left != null){
            total += root.left.val;
        }
        if(root.right != null){
            total += root.right.val;
        }
        if(root.left != null || root.right != null){
            root.val = total;
        }
    }


}
