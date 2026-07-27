import java.util.*;
 class MapX{
    public static void main (String[] x) {
        int[] arr={10,100,10,9,9};
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int temp:arr){
            if(m.containsKey(temp)){
                int incremented=m.get(temp)+1;
                m.put(temp,incremented);
            }
            else {
                m.put(temp,1);
            }
        }
        for(Map.Entry<Integer,Integer>map:m.entrySet()){
            if(map.getValue()==1){
                System.out.print(map.getKey());
                break;
            }
        }
    }
}