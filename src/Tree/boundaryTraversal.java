package Tree;

import java.util.ArrayList;

public class boundaryTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(23);
        root.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(4);
        root.left.left.right.left = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);
        root.right = new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);
        root.right.right.left.left = new TreeNode(10);
        root.right.right.left.right = new TreeNode(11);

        System.out.println(boundary(root));
    }

    static ArrayList<Integer> boundary(TreeNode node)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(!isLeaf(node))
            ans.add(node.val);
        addLeftBoundary(node, ans);
        addLeaves(node, ans);
        addRightBoundary(node, ans);
        return ans;
    }

    private static boolean isLeaf(TreeNode root){

        return (root.left == null) && (root.right == null);
    }

    static void addLeftBoundary(TreeNode node, ArrayList<Integer> res){
        TreeNode curr = node.left;
        while(curr!=null){
            if(!isLeaf(curr)){
                res.add(curr.val);
            }
            if(curr.left!=null){
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
    }

    static void addLeaves(TreeNode node, ArrayList<Integer> res){
        if(isLeaf(node)){
            res.add(node.val);
            return;
        }
        if(node.left!=null){
            addLeaves(node.left, res);
        }
        if(node.right!=null){
            addLeaves(node.right, res);
        }
    }

    static void addRightBoundary(TreeNode node, ArrayList<Integer> res){
        TreeNode curr = node.right;
        ArrayList<Integer> tmp = new ArrayList<>();
        while(curr!=null){
            if(!isLeaf(curr)){
                tmp.add(curr.val);
            }
            if(curr.right!=null){
                curr = curr.right;
            }
            else{
                curr = curr.left;
            }
        }
        // int i;
        for(int i = tmp.size()-1; i>=0; --i){
            res.add(i);
        }
    }
}
