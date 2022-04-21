package DSA;

import java.util.LinkedList;
import java.util.Queue;
class SampleDemo implements Runnable{
    private Thread t;
    private String threadname;
    SampleDemo(String threadname){
        this.threadname=threadname;
    }
    public void run(){
        while(true){
            System.out.println(threadname);
        }
    }
    public void start(){
        if(t==null){
            t=new Thread(this,threadname);
            t.start();
        }
    }
}
class TestThread{
    public static void main(String[] args) {
        SampleDemo A = new SampleDemo("A");
        SampleDemo B = new SampleDemo("B");
        B.start();
        A.start();

    }
}

