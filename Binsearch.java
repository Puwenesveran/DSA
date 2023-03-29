package Search;

import java.util.Scanner;

public class Binsearch {
    public static void main(String[] args) {
        int[] arr={1,3,6,67,68};
        Scanner input=new Scanner(System.in);
        int target=input.nextInt();
        int left=0;
        int right=arr.length-1;
        System.out.println(recursivebinarysearch(arr,target,left,right));
        System.out.println(iterativebinarysearch(arr,target));

    }

    private static int recursivebinarysearch(int[] arr, int n,int left,int right) {
        if(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==n)
                return mid;
            else if (arr[mid]>n)
                return recursivebinarysearch(arr,n,left,mid-1);
            else
                return recursivebinarysearch(arr,n,mid+1,right);
        }
        return -1;
    }

    private static int iterativebinarysearch(int[] arr, int n) {
        int left=0;
        int right=arr.length-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]==n) {
                return mid;
            }else if (arr[mid]>n) {
                right=mid-1;
            }else {
                left = mid + 1;

            }
        }
        return -1;
    }
    
}
