import java.util.*;
 class LastRepeating{
    public static void main (String[] hsadhfj) {
        String s="abcab";
        HashSet<Character>h=new HashSet<>();
        for(int i=s.length()-1;i>=0;i--){
            if(h.contains(s.charAt(i))){
            System.out.print(s.charAt(i));
            break;
            }
            else{ 
            h.add(s.charAt(i));
            }
        }
            
    }
}