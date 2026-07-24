public class MaxSum {
    public static void main(String[] args){
        int[] arr={-2,1,4,-5,-3,2};
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentsum+=arr[i];
            maxsum=Math.max(maxsum,currentsum);
            if(currentsum>0){
                currentsum=0;
            }
        }
        System.out.println("Maximum sum:"+maxsum);
    }
}