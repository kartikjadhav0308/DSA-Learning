package Recursion;
public class PrintsubString {
    public static void sub(String str , int idx , String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return ;
        }

        char charAt = str.charAt(idx);

        //to add
        sub(str, idx+1, newString+charAt);

        //without add
        sub(str, idx+1, newString);
    }
    public static void main(String[] args) {
        sub("ABC", 0, "");
    }
}
