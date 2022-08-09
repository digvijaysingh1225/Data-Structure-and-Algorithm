package String;

public class trimString {
    public static void main(String[] args) {
        String s = "    Hello World!!    ";
        char[] a = s.toCharArray();

        int start=0;
        int end=a.length-1;
        int count=0;

        for(int i=0;i<a.length;i++){
            if(a[i]!=' '){
                start=i;
                break;
            }
        }
        for (int i = end; i > 0 ; i--) {
            if(a[i]!=' '){
                end=i;
                break;
            }
        }
        count=end-start+1;
        String s1 = new String(a,start,count);
        System.out.println(s1);
    }
}
