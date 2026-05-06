public class Occurance {
    public static int first = -1;
    public static int last = -1;

    public static void occurance(String st , char c , int idx){
        if(idx == st.length()){
            return;
        }

        char currenc = st.charAt(idx);
        
        if(currenc == c){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        occurance(st, c, idx+1);
    }

    public static void main(String[] args) {
        String st = "bdaaanbdhaapp";
        char c = 'a';
        occurance(st, c, 0);
        System.out.println("first : "+first+" last : "+last);
    }
}
