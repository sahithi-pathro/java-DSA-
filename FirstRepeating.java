import java.util.*;
 class FirstRepeating{
    public static void main (String[] hsadhfj) {
        String s="abcab";
        HashSet<Character>h=new HashSet<>();
        for(char c:s.toCharArray()){
            if(h.contains(c)){
            System.out.print(c);
            break;
            }
            else{ 
            h.add(c);
            }
        }
            
    }
}