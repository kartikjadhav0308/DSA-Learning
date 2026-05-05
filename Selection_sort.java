public class Selection_sort {
    public static void main(String[] args) {
        //one swap one iteration
        //find the small element and then push at it's appropriate position
        int[] arr = {8,7,2,3,1};
        
        for(int i=0;i<arr.length-1;i++){
            int small = i;
            //because starting element is the sorted in each iteration
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }

            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
        
    }

}
