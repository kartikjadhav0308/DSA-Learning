public class X_n {
    public static int xn(int x , int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }

        int xpown1 = xn(x,n-1);
        int xpow = x * xpown1;
        return xpow;
    }
    public static void main(String[] args) {
        int x=2;
        int n =5;
        System.out.println("x^n : "+ xn(x,n));

    }
}
