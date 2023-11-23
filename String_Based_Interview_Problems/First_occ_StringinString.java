package String_Based_Interview_Problems;

public class First_occ_StringinString {
    public static int strStr(String haystack, String needle) {
        String str=haystack;
        for(int i=0;i<haystack.length();i++){
            if(str.startsWith(needle)){
                return i;
            }
            str= str.substring(1);
        }
        return -1;
    }

    public static void main(String[] args) {
        String h="sadburst";
        String l="ur";
        System.out.println(strStr(h,l));
    }
}
