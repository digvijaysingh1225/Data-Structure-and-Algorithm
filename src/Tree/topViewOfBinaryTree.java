package Tree;

import java.util.*;
// Both Top and Bottom view of Binary Tree
class Pairs{
    TreeNode node;
    int hd;
    Pairs(TreeNode node, int hd){
        this.node = node;
        this.hd = hd;
    }
}

public class topViewOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(10);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);

        root.right = new TreeNode(3);
        root.right.right= new TreeNode(7);


        System.out.println(topView(root));
        System.out.println(bottomView(root));
    }

    static ArrayList<Integer> topView(TreeNode root)
    {
        // add your code
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        Queue<Pairs> q = new LinkedList<>();
        q.add(new Pairs(root, 0));
        Map<Integer, Integer> map = new TreeMap<>();
        while(!q.isEmpty()){
            Pairs it = q.poll();
            int hd = it.hd;
            TreeNode temp = it.node;
            if(map.get(hd) == null){
                map.put(hd, temp.val);
            }
            if(temp.left != null){
                q.add(new Pairs(temp.left, hd - 1));
            }
            if(temp.right != null){
                q.add(new Pairs(temp.right, hd + 1));
            }
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;


    }

    static ArrayList<Integer> bottomView(TreeNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        Queue<Pairs> q = new LinkedList<>();
        q.add(new Pairs(root, 0));
        Map<Integer, Integer> map = new TreeMap<>();
        while(!q.isEmpty()){
            Pairs it = q.poll();
            int hd = it.hd;
            TreeNode temp = it.node;

            map.put(hd, temp.val);

            if(temp.left != null){
                q.add(new Pairs(temp.left, hd - 1));
            }
            if(temp.right != null){
                q.add(new Pairs(temp.right, hd + 1));
            }
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
