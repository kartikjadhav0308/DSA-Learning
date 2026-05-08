package Recursion;
public class chechArraySorted {
    public static boolean  check(int[] arr , int i ){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] < arr[i+1]){
            //array is sorted till now
            return check(arr, i+1);
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Result : "+check(arr,0));
    }
}
