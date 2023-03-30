// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// https://leetcode.com/problems/find-peak-element/

package Search;

public class Peak {
    public static void main(String[] args) {
        int[] arr={1,3,6,7,5,2,1};
        System.out.println(peakofindex(arr));
    }

    private static int peakofindex(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]<arr[mid+1]) {
                // you are in asc part of array
                left = mid + 1;
            }else{
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                right=mid;
            }
        }
        return left;
    }
}
