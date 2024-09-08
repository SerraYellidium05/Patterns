import java.util.Scanner;

public class InvertedHalfPyramid {
     public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int n=value.nextInt();
        int m=value.nextInt();
        int i,j;
        //outer loop->rows
        for(i=1;i<=n;i++){
            //inner loop->cols
            for(j=i;j<=m;j++){

                System.out.print("*");
            }
            System.out.print("\n");
        }   
    }
}
