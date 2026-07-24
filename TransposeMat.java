public class TransposeMat{
    public static void main (String[] args) {
        int[][] A={{1,2,5},{3,4,6}};
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(A[j][i]+" ");
            }
             System.out.println();
        }
    }
}    