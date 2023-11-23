package String_Based_Interview_Problems;

public class Remove_palindrome {
    public static void main(String[] args) {
        String str="He did a good deed";
        String[] arr=str.split(" ");
        StringBuffer fl=new StringBuffer();
        for(String i : arr){
            if(!palindrome(i)){
                fl.append(i+" ");
            }
        }
        System.out.println(fl);

    }

    private static boolean palindrome(String str) {
        int r=str.length()-1;
        int l=0;
        boolean flag=true;
        if(l==r){
            return false;
        }
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                flag =false;
                break;
            }
            l++;
            r--;
        }
        return flag;
    }
    /*Input:
He did a good deed
Output:
He good
Input:
Hari speaks malayalam
Output:
Hari speaks*/
}
