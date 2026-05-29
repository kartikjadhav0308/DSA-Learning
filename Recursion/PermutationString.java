package Recursion;

public class PermutationString {
    public static void permutation(String st , String permu){
        if(st.length()==0){
            System.out.println(permu);
            return;
        }
        for(int i=0;i<st.length();i++){
            char current = st.charAt(i);
            String remianString = st.substring(0,i)+st.substring(i+1);
            permutation(remianString, permu+current);

        }
    }
    public static void main(String[] args) {
        String name = "abc";
        permutation(name, "");
    }
}
