package HackerEarth;

import java.util.*;

public class PlayWithNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];
        leftSum[0] = 0;
        rightSum[n-1] = 0;
        for(int i=1;i<n;i++){
            leftSum[i] = leftSum[i-1] + arr[i-1];
        }
        for(int i=n-2;i>=0;i--) {
            rightSum[i] = rightSum[i+1] + arr[i+1];
        }
        for(int x=0;x<q;x++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            l--;
            r--;
            int res = sum - (leftSum[l] + rightSum[r]);
            int base  = r-l+1;
            System.out.println(res/base);
        }
    }
}
