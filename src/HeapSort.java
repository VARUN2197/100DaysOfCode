public class HeapSort {
    static public void main(String args[]){
        int arr[] = {12,4,6,7,34,89};
        int n = arr.length;
        heapSort(arr,n);
        System.out.println("Sorted array is ");
        printArray(arr, n);
    }

    private static void heapSort( int arr[], int n){
        for(int i=n/2 -1;i>=0;i--){
            //heapify(arr,n,i);
            ascendHeapify(arr,n,i);
        }
        for(int i=n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            //heapify(arr,i,0);
            ascendHeapify(arr,i,0);
        }
    }

    private static void heapify(int arr[],int n,int i){
        int smallest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;
        if(l<n && arr[l] < arr[smallest]){
            smallest = l;
        }
        if(r<n && arr[r] < arr[smallest]){
            smallest = r;
        }
        if(smallest != i){
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            heapify(arr,n,smallest);
        }
    }

    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
            System.out.println();
        }

    private static void ascendHeapify(int arr[],int n,int i)
    {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;
        if(left<n && arr[left] > arr[largest]){
            largest = left;
        }
        if(right<n && arr[right] > arr[largest]){
            largest = right;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            ascendHeapify(arr,i,largest);
        }
    }
}
