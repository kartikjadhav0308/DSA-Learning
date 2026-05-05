class Bubble_sort {
    public static void main(String[] args) {
        //run loop n-1 time
        //biggest no arrange at last
        int[] arr = {7,8,2,1,3};
        for(int i=0;i < arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}