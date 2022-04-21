package DSA;

import java.util.Arrays;

public class username {
    public String userIdGenerator(String input1,String input2,int input3,int input4){
    String shorter = null;
    String longer = null;
    if(input1.length()>input2.length()){
        shorter+=input2.charAt(input2.length()-1);
        longer =input1;
    }

    else if(input1.length()==input2.length()){
        for(int i=0;i<input1.length();i++){
            if(input1.charAt(i)==input2.charAt(i)){
                continue;
            }
            else if(input1.charAt(i)<input2.charAt(i)){
                shorter+=input1.charAt(input1.length()-1);
                longer=input2;
            }
        }
    }
    String ans = shorter + longer;
    
    String input5 = String.valueOf(input3);
//    String pin1=input5.charAt(input4);
//    String pin2=input5.charAt(input5.length()-input4);
        String SS="";
        for(int i=0;i<ans.length();i++) {
//            char ch = s.charAt(i);
            if (Character.isLowerCase(ans.charAt(i))) {
                SS+=Character.toUpperCase(ans.charAt(i));
            } else if (Character.isUpperCase(ans.charAt(i))) {
                SS+=Character.toLowerCase(ans.charAt(i));
            }

        }
    

    SS=SS+input5.charAt(input4)+input5.charAt(input5.length()-input4);
    return SS;


}
//    static String conversion(String s){
//        String SS="";
//
//
//        return SS;
//    }

    public static void main(String[] args) {
        String input1 = "Rajiv";
        String input2 = "Roy";
        int input3 = 560037;
        int input4 = 6;

        username obj = new username();
        System.out.println(obj.userIdGenerator(input1,input2,input3,input4));
    }
}
