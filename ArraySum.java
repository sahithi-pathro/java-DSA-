public class ArraySum{
    public static void main (String[] args) {
        int[][] arr={{3,4,5},{5,6,7},{4,7,8}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}