package String_Based_Interview_Problems;





public class FirstUniqueChar {
    public static void main(String[] args){
        int n=firstUniq("dddccdbba");
//        int a=firstUniq("aabbb");
        System.out.println(n+"    ------    ");
    }
    private static int firstUniq(String s){
        for(int i=0;i<s.length();i++) {
            if (count(s, s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
    private static int count(String s,char c){
        int count=0;
        int index=0;
        while(count<3 && index<s.length()){
            if(s.charAt(index)==c){
                count++;
            }
            index++;
        }
        return count;
    }

}
