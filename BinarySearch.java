
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        int l=0;
        int h=arr.length-1;
        int no ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no to search");
        no=sc.nextInt();
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]==no){
                System.out.println("no found at "+mid+" position");
                return;
            }
            else if(arr[mid]<no){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }

        System.out.println("no is not found");
    }
}
