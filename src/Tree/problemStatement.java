package Tree;

// arr[] = {30,20,50,25,35,40,10};
public class problemStatement {
    public static void main(String[] args) {
        problemStatement obj = new problemStatement();
        int[] arr = {30,20,50,25,35,40,10};
        myNode newnode = new myNode(30);
        createBST(null,30);
        for (int i = 1; i < arr.length; i++) {
//            Node n1 = new Node(arr[i]);
            obj.createBST(newnode,arr[i]);
        }
        traversal(newnode);

    }
    myNode root;
    public static void createBST(myNode root, int value){
        if(root==null){
            root = new myNode(value);
        }
        if(value<root.data){
            if(root.left==null){
                root.left=new myNode(value);
            }
        }
        if(value>root.data){
            if(root.right==null){
                root.right=new myNode(value);
            }
        }
        else {
            if(value<root.data){
                createBST(root.left,value);
            }
            if(value>root.data){
                createBST(root.right,value);
            }
        }
//            if(root==null){
//                root = new Node(value);
//                return;
//            }
//            if(root.data>value){
//                createBST(root.left,value);
//            }
//            else if(root.data<value) {
//                createBST(root.right,value);
//            }
    }
    public static void traversal(myNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        traversal(root.left);
        traversal(root.right);
    }

}
