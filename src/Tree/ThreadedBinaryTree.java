package Tree;

class MYNODE{

    private String phone;
    private MYNODE left;
    private MYNODE right;
    private boolean rightthread ;
    MYNODE(String phone){
        this.phone=phone;
    }

    public String getPhone() {
        return phone;
    }

    public MYNODE getLeft() {
        return left;
    }

    public MYNODE getRight() {
        return right;
    }

    public boolean isRightthread() {
        return rightthread;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLeft(MYNODE left) {
        this.left = left;
    }

    public void setRight(MYNODE right) {
        this.right = right;
    }

    public void setRightthread(boolean rightthread) {
        this.rightthread = rightthread;
    }


}
public class ThreadedBinaryTree{
    public static void main(String[] args) {
        MYNODE obj1 = new MYNODE("One Two Triple Three Penta Five");
        MYNODE obj2 = new MYNODE("Penta Two Triple Four Five Hexa Six");
        MYNODE obj3 = new MYNODE("One Two Hepta Three Penta Five");
        MYNODE obj4 = new MYNODE("Seven Two Octa Three Double Seven");
        MYNODE obj5 = new MYNODE("Nine Eight Triple Three Quad Four");

    }
}