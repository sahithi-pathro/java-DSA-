public class SameEle {
    public static void main(String[] args){
        int[] arr={5,5,5,5,5};
        int largest=Integer.MIN_VALUE;
        int second_lar=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second_lar=largest;
                largest=arr[i];
            }
            else if(arr[i]>second_lar&&arr[i]!=largest){
                second_lar=arr[i];
            }
        }
        if(second_lar==Integer.MIN_VALUE){
            System.out.println("second largest is not found");
        }
        else{
            System.out.println("second largest:"+second_lar);
        }
        System.out.println("largest:"+largest);
        System.out.println("second largest:"+second_lar);
    }
}
