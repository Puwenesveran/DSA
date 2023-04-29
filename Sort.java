package Sorting;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] a={5,6,2,3,1,4,7};
        quick(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static void quick(int[] a,int low,int hi) {
        if(low>=hi){
            return;
        }
        int s=low;
        int e=hi;
        int m=(s+e)/2;
        int pivot=a[m];
        while (s<=e){
            while (a[s]<pivot){
                s++;
            }
            while (a[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=a[s];
                a[s]=a[e];
                a[e]=temp;
                s++;
                e--;
            }
        }
        quick(a,low,e);
        quick(a,s,hi);
    }

    private static void inplacemergesort(int[] arr,int s,int e) {
        if(e-s==1){
            return ;
        }
        int mid=(s+e)/2;
        inplacemergesort(arr,s,mid);
        inplacemergesort(arr,mid,e);
        merge_inplace(arr,s,mid,e);
    }


    static void merge_inplace(int[] a,int s,int mid,int e){
        int[] result=new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while (i<mid&&j<e){
            if(a[i]<a[j]){
                result[k]=a[i];
                i++;
            }else{
                result[k]=a[j];
                j++;
            }
            k++;
        }
        while (i<mid){
            result[k]=a[i];
            i++;
            k++;
        }
        while(j<e){
            result[k]=a[j];
            j++;
            k++;
        }
        for (int t=0;t<result.length;t++){
            a[s+t]=result[t];
        }

    }


    static void insertion(int[] a) {
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(a[j]<a[j-1]){
                    swap(a,j,j-1);
                }else{
                    break;
                }
             }
        }
    }
   static void selection(int[] a) {
        for(int i=0;i<a.length;i++){
            //find the max element within the last index and swap
                int last=a.length-1-i;
                int maxindex=maxof(a,0,last);
                swap(a,maxindex,last);
        }
    }
    static void bubble(int[] a) {
        for(int i=0;i<a.length;i++){
            boolean swapped=false;
            for(int j=1;j< a.length-i;j++){
                if(a[j]<a[j-1]){
                    swap(a,j,j-1);
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
    static void cyclic(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }


    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }

    static int maxof(int[] arr,int first,int last){
        int max=first;
        for(int i=first+1;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}


