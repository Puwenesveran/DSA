package String_Based_Interview_Problems;

import java.util.Arrays;

public class Longestcommonprefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ans= new StringBuilder("");
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        for (int i=0;i<first.length();i++){
            if(first.charAt(i)==last.charAt(i))
                ans.append(first.charAt(i));
            else
                break;
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String [] str={"flower","flow","flight","fluck"};
        System.out.println(longestCommonPrefix(str));
    }
}
