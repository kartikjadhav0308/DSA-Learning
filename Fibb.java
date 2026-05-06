//fibonacci series : a , b , a+b -----
//by using the recursion time complexity O(n) space complexity O(n)
//instead of this use the iteration t=O(n) S=O(n)

public class Fibb{
    public static void fibb(int a , int b , int n ){
        
        if(n==0){
            return ;
        }
        
        int c=a+b;
        
        System.out.println(c+" ");
        fibb(b,c,n-1);
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 5;
        System.out.println(a+"\n"+b);
        fibb(a, b, n-2);
    }
}