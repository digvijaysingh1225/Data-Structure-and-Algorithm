package Tree;
class deleteNode{
    deleteNode left;
    deleteNode right;
    int data;
    deleteNode(int data){
        this.data=data;
    }
}
public class DeletionNodeBST {
    static deleteNode root;
    public static deleteNode Delete(deleteNode root,int value){
        if(root==null){
            return null;
        }
        else if(value<root.data){
            root.left=Delete(root.left,value);
        }
        else if(value>root.data){
            root.right=Delete(root.right,value);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left==null && root.right!=null){
                return root.right;
            }
            else if(root.right==null && root.left!=null){
                return root.left;
            }
            else{
                int minimum = min(root.right);
                root.data=minimum;
                root.right=Delete(root.right,minimum);
            }
        }
        return root;
    }

    private static int min(deleteNode root) {
        if(root.left!=null){
            return root.data;
        }
        return min(root.left);
    }
    private static int max(deleteNode root){
        if(root.right!=null){
            return root.data;
        }
        return max(root.right);
    }

    public static deleteNode insert(deleteNode root,int value){
        if(root==null){
            deleteNode n1=new deleteNode(value);
            root=n1;
            return root;
        }
        if(value<root.data){
            insert(root.left,value);
        }
        if(value>root.data){
            insert(root.right,value);
        }
        return root;
    }
    public static void preorder(deleteNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
//        int[] arr = {10,20,30,40,50,60};
//        for (int i = 0; i < arr.length; i++) {
//            insert(root,arr[i]);
//        }
        insert(root,10);
        insert(root,20);
        insert(root,30);
        preorder(root);

    }
}
