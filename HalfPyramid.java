import java.util.*;
public class HalfPyramid{
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int n=value.nextInt();
        int m=value.nextInt();
        int i,j;
        //outer loop->rows
        for(i=1;i<=n;i++){
            //inner loop->cols
            for(j=1;j<=i;j++){

                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}