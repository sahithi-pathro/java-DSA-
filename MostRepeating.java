import java.util.*;
 class MostRepeating{
    public static void main (String[] hsadhfj) {
        String s="aabbcccddd";
        Map<Character,Integer>m=new HashMap<>();
        for(char ch:s.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        int ans=-1;
        for(Map.Entry<Character,Integer>map:m.entrySet()){
            ans=Math.max(ans,map.getValue());
        }
        for(Map.Entry<Character,Integer>map:m.entrySet()){
            if(map.getValue()==ans){
                System.out.print(map.getKey());
            }
        }
    }
}