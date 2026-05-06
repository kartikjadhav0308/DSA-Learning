public class Recursion {
    static void p5to1(int a){
        if(a==0){
            return;
        }
        System.out.println(a);
        p5to1(a-1);
    }

    static void p1to5(int b){
        if(b==6){
            return;
        }
        System.out.println(b);
        p1to5(b+1);
    }

    static void sum_of_natural(int c,int sum){
        
        if(c==0){
            System.out.println("Sum:"+sum);
            return;
        }
        sum+=c;
        sum_of_natural(c-1,sum);

    }

    static int fact(int d,int facto){
        if(d==0 || d==1){
            return facto;
        }
        
        return fact(d-1, facto*d);
    }
    public static void main(String[] args) {
        //function is called it self for do the iteration
        //it use more memory than the for loop or other iteration
        // p5to1(5);
        // p1to5(1);
        // sum_of_natural(5,0);
        // int ans = fact(5, 1);
        // System.out.println("Factorial:"+ans);
    }
}
