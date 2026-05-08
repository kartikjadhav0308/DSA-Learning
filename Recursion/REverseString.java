package Recursion;
public class REverseString {
    public static void reverse(String st,int idx){
        if(idx == 0){
            System.out.print(st.charAt(idx));
            return;
        }
        System.out.print(st.charAt(idx));
        reverse(st, idx-1);
    }
    public static void main(String[] args) {
        String st = "abcd";
        reverse(st, st.length()-1);
    }
}
