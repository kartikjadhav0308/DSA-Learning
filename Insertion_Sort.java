public class Insertion_Sort {
    public static void main(String[] args) {
        //we have to part sorted and unsorted
        // 7 | 8 3 1 2
        // 7 8 | 3 1 2
        int[] arr = {7,8,3,1,2};

        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
