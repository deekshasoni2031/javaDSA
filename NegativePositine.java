public class NegativePositive {
     static void NParray(int[] arr) {
        /* */
        int l=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                if(i!=l){
                    int temp=arr[i];
                    arr[i]=arr[l];
                    arr[l]=temp;
                }
                l++;
            }
        }
       
        System.out.println("Array after arranging");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void BubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] arr={0,-3,5,6,-2,0,4,-8};
        NParray(arr);
        System.out.println("through sorting the rearranged array");
        BubbleSort(arr);
    }
}
