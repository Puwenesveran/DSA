package String_Based_Interview_Problems;

import java.util.HashMap;

public class NUmberOfOccurance {
    public static void main(String args[]){
        int[] arr={2,3,2,6,1,6,2};
        HashMap<Integer,Integer> dict=new HashMap<>();
        for (int i:arr) {
            if(dict.containsKey(i)){
                int current=dict.get(i);
                dict.put(i,current+1);
            }
            else {
                dict.put(i,1);
            }
        }
        System.out.println(dict);
    }
}
