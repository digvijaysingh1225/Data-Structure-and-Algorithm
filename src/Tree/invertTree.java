package Tree;
import java.util.Arrays;

public class invertTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        invertTreeMethod(root);

    }

    public static TreeNode invertTreeMethod(TreeNode node){
        if(node ==  null){
            return node;
        }
        TreeNode l = invertTreeMethod(node.left);
        TreeNode r = invertTreeMethod(node.right);

        node.left = r;
        node.right = l;
        return node;
    }
}
