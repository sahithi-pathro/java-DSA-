import java.util.*;
 class SetExplain{
    public static void main (String[] adg) {
        int[] arr={1,2,3,4,3};
        HashSet<Integer>h=new HashSet<>();
        for(int ele:arr){
            h.add(ele);
        }
        System.out.print(h);
    }
}