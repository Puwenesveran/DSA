package Sorting;

import java.util.Arrays;

public class Mergee {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        mergeinplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length+1));
        return merge(left,right);
    }


    private static int[] merge(int[] a,int[] b){
        int[] result=new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<a.length&&j<b.length){
            if(a[i]<b[j]){
                result[k]=a[i];
                i++;
            }else{
                result[k]=b[j];
                j++;
            }
            k++;
        }
        while (i<a.length){
            result[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            result[k]=b[j];
            j++;
            k++;
        }

        return result;
    }


    static void mergeinplace(int[] arr,int s,int e){
        if(e-s == 1 ){
            return;
        }

        int mid=(s+e) / 2;

        mergeinplace(arr,s,mid);
        mergeinplace(arr,mid,e);

        joinmerge(arr,s,mid,e);
    }
    static void joinmerge(int[] arr,int s,int m,int e){
        int[] result=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while (i<m && j<e){
            if(arr[i]<arr[j]){
                result[k]=arr[i];
                i++;
            }else{
                result[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<m){
            result[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            result[k]=arr[j];
            j++;
            k++;
        }
        for(int t=0;t<result.length;t++){
            arr[s+t]=result[t];
        }

    }
}
