public class BubbleSort {

    private static void bubbleSort(int arr[]){
        int i,j,temp;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length -1-i;j++){
                if( arr[j] > arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main (String args[]){
        int arr[] = {5,7,1,8,3,5};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
