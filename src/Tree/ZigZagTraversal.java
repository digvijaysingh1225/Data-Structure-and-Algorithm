package Tree;

import java.util.*;

public class ZigZagTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);

        System.out.println(zigzagTraversal(root));

    }

    public static List<List<Integer>> zigzagTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        queue.offer(root);
        boolean flag = true;
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> l = new ArrayList<>(levelNum);
            while(levelNum-->0){
                if(queue.peek().left!=null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right!=null)
                    queue.offer(queue.peek().right);
                if(flag == true)
                    l.add(queue.poll().val);
                else
                    l.add(0, queue.poll().val);
            }
            flag = !flag;
            list.add(l);
        }
        return list;
    }
}
