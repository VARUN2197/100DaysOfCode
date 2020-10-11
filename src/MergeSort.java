public class MergeSort {
    int arr[];
    int tempArr[];
    int length;

    public static void main (String args[]){
        int inputArr[] = {48,36,13,52,19,94,21};
        MergeSort ms = new MergeSort();
        ms.sort(inputArr);
        for(int i=0;i<inputArr.length;i++){
            System.out.print(inputArr[i] + " ");
        }
    }
    void sort(int arr[]){
        this.arr = arr;
        this.length = arr.length;
        this.tempArr = new int[length];
        divide(0,length-1);
    }
    void divide(int lowerIndex, int higherIndex){
        if(lowerIndex<higherIndex){
            int middle = lowerIndex + (higherIndex - lowerIndex)/2;
            //Will sort left side
            divide(lowerIndex,middle);
            //will sort the right side
            divide(middle+1,higherIndex);
            mergeArray(lowerIndex,middle,higherIndex);
        }
    }
    void mergeArray(int lowerIndex,int middle,int higherIndex){
        for(int i=lowerIndex;i<higherIndex;i++){
            tempArr[i] = arr[i];
        }
        int i = lowerIndex;
        int j = middle+1;
        int k = lowerIndex;
        while(i<=middle && j<=higherIndex){
            if(tempArr[i]<=tempArr[j]){
                arr[k] = tempArr[i];
                i++;
            }else {
                arr[k] = tempArr[j];
                j++;
            }
            k++;
        }
        while(i<=middle){
            arr[k] = tempArr[i];
            k++;
            i++;
        }
    }
}
 